package NKD.controller;
import NKD.entity.Topic;
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
public class TopicController {
    @RequestMapping(value="/listTopic",method = RequestMethod.GET)
    public String ShowListTopic(ModelMap modelMap){ 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QuanlyPU");
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createNamedQuery("Topic.findAll",Topic.class);
        List <Topic> topicList = q.getResultList();
        modelMap.put("topicList",topicList);
        return "topicList"; 
    }
     @RequestMapping(value="/addTopic",method = RequestMethod.GET)
    public String adddTopic(){  
        return "addTopic";
    }
     @RequestMapping(value="/saveTopic",method = RequestMethod.POST)
    public String SaveTopic(){  
        return "topicList";
    }
     @RequestMapping(value="/deleteTopic",method = RequestMethod.POST)
    public String DeleteTopic(){  
        return "topicList ";
    }
}
