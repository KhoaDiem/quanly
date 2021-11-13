package NKD.controller;
import NKD.entity.Trainer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    
    
    
     @RequestMapping(value="/addTrainer",method = RequestMethod.GET)
    public String adddTrainer(){  
        return "addTrainer";
    }
     @RequestMapping(value="/saveTrainer",method = RequestMethod.POST)
    public String Save(){  
        return "trainerList";
    }
     @RequestMapping(value="/deleteTrainer",method = RequestMethod.POST)
    public String DeleteTrainer(){  
        return "trainerList ";
    }
}
