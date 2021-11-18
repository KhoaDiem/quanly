/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.controller;

import NKD.entity.Trainee;
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
    public String adddTrainee(@RequestParam HashMap<String, String> formData, ModelMap modelMap){  
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        
         Trainee trainee = null;
 
        if(formData.containsKey("id") && !formData.get("id").isEmpty()){
             try {
                trainee = em.find(Trainee.class, Integer.parseInt(formData.get("id")));
            } catch (Exception e) {}
        }
        if(trainee == null){
            trainee = new Trainee();
        }
        modelMap.put("trainee",trainee);
        return "addTrainee";
    }
     @RequestMapping(value="/saveTrainee",method = RequestMethod.POST)
    public String SaveTrainee(@RequestParam HashMap<String, String> formData){  
        String traineeName = formData.get("traineeName");
        String dob = formData.get("dob");
        String education = formData.get("education");
        String programingLanguage = formData.get("programingLanguage");
        String toeicScore = formData.get("toeicScore");
        String expericenDetail = formData.get("expericenDetail");
        String departmdent = formData.get("departmdent");
        String location = formData.get("location");
        
        int id = 0;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()) {
            id = Integer.parseInt(formData.get("id"));
        }
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        
        Trainee traineeFind = em.find(Trainee.class,id);
        
        if(traineeFind != null){
            em.getTransaction().begin();
            traineeFind.setTraineeName(traineeName);
            traineeFind.setDob(dob);
            traineeFind.setEducation(education);
            traineeFind.setProgramingLanguage(programingLanguage);
            traineeFind.setToeicScore(toeicScore);
            traineeFind.setExpericenDetail(expericenDetail);
            traineeFind.setDepartment(departmdent);
            traineeFind.setLocation(location);
            em.getTransaction().commit();
        }else{
            //insert
            em.getTransaction().begin();
            Trainee trainee = new Trainee();
            trainee.setTraineeName(traineeName);
            trainee.setDob(dob);
            trainee.setEducation(education);
            trainee.setProgramingLanguage(programingLanguage);
            trainee.setToeicScore(toeicScore);
            trainee.setExpericenDetail(expericenDetail);
            trainee.setDepartment(departmdent);
            trainee.setLocation(location);
            em.getTransaction().commit();
        } 
    return "redirect:../quanly/traineeList.html";    
    }
     @RequestMapping(value="/deleteTrainee",method = RequestMethod.POST)
    public String DeleteTrainee(@RequestParam HashMap<String, String> formData){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        Trainee trainee = null;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()){
             try {
                trainee = em.find(Trainee.class, Integer.parseInt(formData.get("id")));
            } catch (Exception e) {}
        }
        if(trainee != null){
            em.getTransaction().begin();
            em.remove(trainee);
            em.getTransaction().commit();
        }
        return "redirect:../quanly/traineeList.html";
    }
}
