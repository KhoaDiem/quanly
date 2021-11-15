package NKD.controller;


import NKD.entity.Course;
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
    public String adddCourse(){  
        return "courseList";
    }
     @RequestMapping(value="/saveCourse",method = RequestMethod.POST)
    public String Save(){  
        return "courseList";
    }
     @RequestMapping(value="/deleteCourse",method = RequestMethod.POST)
    public String DeleteCourse(){  
        return "courseList ";
    }
    
}
