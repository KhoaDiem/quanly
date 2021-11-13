/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.controller;

import NKD.entity.Trainee;
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
public class TraineeController {
    @RequestMapping(value="/listTrainee",method = RequestMethod.GET)
   public String ShowListTrainee(ModelMap modelMap){
   EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Trainee.findAll",Trainee.class);
        List <Trainee> traineeList = q.getResultList();
        modelMap.put("traineeList", traineeList);
        return "traineeList";
    
    }
    @RequestMapping(value="/addTrainee",method = RequestMethod.GET)
    public String AdddTrainee(){  
        return "traineeList";
    }
     @RequestMapping(value="/saveTrainee",method = RequestMethod.POST)
    public String Save(){  
        return "traineeList";
    }
     @RequestMapping(value="/deleteTrainee",method = RequestMethod.POST)
    public String DeleteTrainee(){  
        return "traineeList ";
    }
}
