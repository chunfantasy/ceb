
import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.ceb.dao.SessionManager;
import com.ceb.model.News;


public class NewsTest {

	

	
	@Test
	public void testBbsSave() {
	
		News t = new News();
	    t.setPdate(new Date());
	    t.setContent("英国金融时报周二援引130名国会议员致美国财长盖特纳和商务部长骆家辉的一封信，他们要求奥巴马政府在下月发布有关汇率操纵的定期报告时，把中国列为汇率操纵国之一。这些议员还呼吁对中国输美产品征收反补贴税");
	
		Session session=SessionManager.newInstance().getSession();
		session.beginTransaction(); 
		session.save(t);
		session.save(t);
		session.save(t);
		session.save(t);
		session.save(t);
		session.getTransaction().commit();
		SessionManager.newInstance().closeSession();
	}
	
	
}
