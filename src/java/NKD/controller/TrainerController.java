package NKD.controller;
import NKD.entity.Trainee;
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
    public String ShowList(ModelMap modelmap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Trainer.findAll",Trainee.class);
        List <Trainer> TrainerList = q.getResultList();
        modelmap.put("TrainerList", TrainerList);
        
        
        return "listTrainer";
    }
     @RequestMapping(value="/viewds",method = RequestMethod.GET)
    public String viewds(){  
        return "listTrainer";
    }
     @RequestMapping(value="/save",method = RequestMethod.POST)
    public String Save(){  
        return "listTrainer";
    }
     @RequestMapping(value="/delete",method = RequestMethod.POST)
    public String Delete(){  
        return "listTrainer";
    }
}
