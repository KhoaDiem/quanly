package NKD.controller;
import NKD.entity.Account;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping(value = "quanly")
public class AccoutController {
    @RequestMapping(value = "/listAccount", method = RequestMethod.GET)
    public String ShowListAccount(ModelMap modelMap) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createNamedQuery("Account.findAll", Account.class);
        List<Account> accountList = q.getResultList();
        modelMap.put("accountList", accountList);
        return "accountList";
    }
    
    
    
    //add/update account
    
    
    
    @RequestMapping(value = "/addAccount", method = RequestMethod.GET)
    public String addAccount(@RequestParam Map<String, String> formData, ModelMap modelMap) {
        Account account = new Account(); 
        if(formData.containsKey("userID")) {
            int userID = Integer.parseInt(formData.get("userID"));
            //B1. Ket noi toi CSDL
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
            EntityManager em = factory.createEntityManager();       
            account = em.find(Account.class,userID);         
            if(account == null) {
                account = new Account();
            }
        }    
        modelMap.put("account", account);
        return "addAccount";
    }
    //khi click vao Add Account thì sẽ được sử lý tại đây
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String Save(@RequestParam HashMap<String, String> formData) {
        String username = formData.get("username");
        String password = formData.get("password");
        String acVerify = formData.get("acVerify");
        int userID = 0;
        if(formData.containsKey("userID") && !formData.get("userID").isEmpty()) {
            userID = Integer.parseInt(formData.get("userID"));
        }
        //Kết nối đến database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        if(userID > 0) {
            Account account = em.find(Account.class, userID);
            em.getTransaction().begin();
            account.setUsername(username);
            account.setPassword(password);
            account.setAcVerify(acVerify);
            em.getTransaction().commit();
        }else{
        //insert
            em.getTransaction().begin();
            Account account = new Account(); 
            account.setUsername(username);
            account.setPassword(password);
            account.setAcVerify(acVerify);
            em.persist(account);
            em.getTransaction().commit();
        }
        return "redirect:../quanly/listAccount.html";
    }
    
    //xoa Account
    @RequestMapping(value = "/deleteAccount", method = RequestMethod.POST)
    public String deleteAccount(@RequestParam HashMap<String, String> form) {
        int userID = 0;
        if (form.containsKey("userID") && !form.get("userID").isEmpty()) {
            userID = Integer.parseInt(form.get("userID"));
        }
        //Kết nối đến database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        if (userID > 0) {
            //delete
            Account accountFind = em.find(Account.class, userID);

            if (accountFind != null) {
                em.getTransaction().begin();
                em.remove(accountFind);
                em.getTransaction().commit();
            }
        }
        return "redirect:../quanly/listAccount.html";    
} 
    
    @RequestMapping(value = "/deleteAccount/{userID}", method = RequestMethod.POST)
    public String deleteAccount2(@PathVariable int userID) {
        //Kết nối đến database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        if (userID > 0) {
            //delete
            Account accountFind = em.find(Account.class, userID);

            if (accountFind != null) {
                em.getTransaction().begin();
                em.remove(accountFind);
                em.getTransaction().commit();
            }
        }
        return "redirect:../quanly/listAccount.html";
    }
}
