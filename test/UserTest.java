
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.Test;


import com.ceb.model.*;


public class UserTest {
    
	

	
	@Test
	public void  UserSave() {
	
		Member t = new Member();

	    t.setName("нд╩т");
	    t.setAcademy("1");
	    t.setDepartment("123");
	    t.setEmail("132");
	  
	    t.setPassword("123");
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
	
	
}
