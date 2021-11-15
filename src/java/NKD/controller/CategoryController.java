package NKD.controller;
import NKD.entity.Category;
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
public class CategoryController {
    @RequestMapping(value="/listCategory",method = RequestMethod.GET)
    public String ShowList(ModelMap modelMap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Category.findAll",Category.class);
        List <Category> categoryList = q.getResultList();
        modelMap.put("categoryList", categoryList);
        return "categoryList";
    }
     @RequestMapping(value="/addCategory",method = RequestMethod.GET)
    public String addCategory(){  
        return "addCategory";
    }
     @RequestMapping(value="/saveCategory",method = RequestMethod.POST)
    public String Save(){  
        return "categoryList";
    }
     @RequestMapping(value="/deleteCategory",method = RequestMethod.POST)
    public String DeleteCategory(){  
        return "categoryList ";
    }
}
