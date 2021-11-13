/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.controller;

import NKD.entity.Account;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="quanly")
public class AccoutController {
    @RequestMapping(value="/listAccount",method = RequestMethod.GET)
    public String ShowListAccount(ModelMap modelMap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Account.findAll",Account.class);
        List <Account> accountList = q.getResultList();
        modelMap.put("accountList", accountList);
        return "accountList";
    }
     @RequestMapping(value="/addAccount",method = RequestMethod.GET)
    public String addAccount(){      
        return "addAccount";
   
    }
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String Save(@RequestParam HashMap<String, String> formData){ 
        String ID=formData.get("userID");
        String Username=formData.get("username");
        String Password=formData.get("password");
        String AcVerify=formData.get("acVerify");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Account account = new Account();
        account.setUserID(Integer.SIZE);
        account .setUsername(Username);
        account.setPassword(Password);
        account.setAcVerify(AcVerify);
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        return "redirect:accountList.html";   
    }
    @RequestMapping(value="/deleteAccount",method = RequestMethod.POST)
    public String DeleteAccount(){ 
        return "accountList";
    }
    
    
    
    
}
