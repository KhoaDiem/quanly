package NKD.controller;
import NKD.entity.Trainer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@RequestMapping(value = "quanly")
public class TrainerController {
    @RequestMapping(value="/listTrainer",method = RequestMethod.GET)
    public String ShowList(ModelMap modelMap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Trainer.findAll",Trainer.class);
        List <Trainer> trainerList = q.getResultList();
        modelMap.put("trainerList", trainerList);
        return "trainerList";
    }
    //them/update trainer
     @RequestMapping(value="/addTrainer",method = RequestMethod.GET)
    public String adddTrainer(@RequestParam HashMap<String, String> formData, ModelMap modelMap){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        
         Trainer trainer = null;
 
        if(formData.containsKey("id") && !formData.get("id").isEmpty()){
             try {
                trainer = em.find(Trainer.class, Integer.parseInt(formData.get("id")));
            } catch (Exception e) {}
        }
        if(trainer == null){
            trainer = new Trainer();
        }
        modelMap.put("trainer",trainer);
        return "addTrainer";
    }
    //luu trainer
     @RequestMapping(value="/saveTrainer",method = RequestMethod.POST)
    public String SaveTrainer(@RequestParam HashMap<String, String> formData){
        String trainerName = formData.get("trainerName");
        String education = formData.get("education");
        String typework = formData.get("typework");
        String workingplace = formData.get("workingplace");
        String telephone = formData.get("telephone");
        String email = formData.get("email");
        
        int id = 0;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()) {
            id = Integer.parseInt(formData.get("id"));
        }
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        
        Trainer trainerFind = em.find(Trainer.class,id);
        
        if(trainerFind != null) {
            em.getTransaction().begin();
            trainerFind.setTrainerName(trainerName);
            trainerFind.setEducation(education);
            trainerFind.setTypework(typework);
            trainerFind.setWorkingplace(workingplace);
            trainerFind.setTelephone(telephone);
            trainerFind.setEmail(email);
            em.getTransaction().commit();
        }else{
        //insert
            em.getTransaction().begin();
            Trainer trainer = new Trainer(); 
            trainer.setTrainerName(trainerName);
            trainer.setEducation(education);
            trainer.setTypework(typework);
            trainer.setWorkingplace(workingplace);
            trainer.setTelephone(telephone);
            trainer.setEmail(email);
            em.persist(trainer);
            em.getTransaction().commit();
        }
        return "redirect:../quanly/listTrainer.html";   
    }
    //xoa trainer
     @RequestMapping(value="/deleteTrainer",method = RequestMethod.POST)
    public String DeleteTrainer(@RequestParam HashMap<String, String> formData){  
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        Trainer trainer = null;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()){
             try {
                trainer = em.find(Trainer.class, Integer.parseInt(formData.get("id")));
            } catch (Exception e) {}
        }
        if(trainer != null){
            em.getTransaction().begin();
            em.remove(trainer);
            em.getTransaction().commit();
        }
        return "redirect:../quanly/trainerList.html";
    }
}
