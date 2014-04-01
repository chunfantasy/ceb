
import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.ceb.dao.SessionManager;
import com.ceb.model.Bbs;


public class BbsTest {

	

	
	@Test
	public void testBbsSave() {
	
		Bbs t = new Bbs();
	    t.setPname("文辉");
		t.setRootid(1);
		t.setTitle("我的足球");
		t.setCont("AC米兰最棒AC米兰最棒");
		t.setPdate(new Date());
		t.setIsleaf(0);
	
		Session session=SessionManager.newInstance().getSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		SessionManager.newInstance().closeSession();
	}
	
	
}
