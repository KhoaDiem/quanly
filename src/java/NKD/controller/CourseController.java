package NKD.controller;


import NKD.entity.Course;
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
public class CourseController {
    @RequestMapping(value="/listCourse",method = RequestMethod.GET)
    public String ShowListCourse(ModelMap modelMap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Course.findAll",Course.class);
        List <Course> courseList = q.getResultList();
        modelMap.put("courseList", courseList);
        return "courseList";
    }
    @RequestMapping(value="/addCourse",method = RequestMethod.GET)
    public String adddCourse(@RequestParam HashMap<String, String> formData, ModelMap modelMap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Course course = null;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()){
             try {
                course = em.find(Course.class, Integer.parseInt(formData.get("id")));
            } catch (Exception e) {}
        }
        if(course == null){
            course = new Course();
        }
        modelMap.put("course",course);
        return "addCourse";
    }
     @RequestMapping(value="/saveCourse",method = RequestMethod.POST)
    public String Save(@RequestParam HashMap<String, String> formData){  
         String courseName = formData.get("courseName");
         String description = formData.get("description");
         int id = 0;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()) {
            id = Integer.parseInt(formData.get("id"));
        }
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        Course courseFind = em.find(Course.class, id);
        if(courseFind != null){
            em.getTransaction().begin();
            courseFind.setCourseName(courseName);
            courseFind.setDescription(description);
            em.getTransaction().commit();
        }else{
            em.getTransaction().begin();
            Course course = new Course();
            courseFind.setCourseName(courseName);
            courseFind.setDescription(description);
            em.persist(course);
            em.getTransaction().commit();
        }
        return "redirect:../quanly/courseList.html";
    }
     @RequestMapping(value="/deleteCourse",method = RequestMethod.POST)
    public String DeleteCourse(@RequestParam HashMap<String, String> formData){  
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager();
        Course course = null;
        if(formData.containsKey("id") && !formData.get("id").isEmpty()){
             try {
                course = em.find(Course.class, Integer.parseInt(formData.get("id")));
            } catch (Exception e) {}
        }
        if(course != null){
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }
        return "redirect:../quanly/courseList.html ";
    }
    
}
