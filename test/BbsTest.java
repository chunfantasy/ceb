
import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.ceb.dao.SessionManager;
import com.ceb.model.Bbs;


public class BbsTest {

	

	
	@Test
	public void testBbsSave() {
	
		Bbs t = new Bbs();
	    t.setPname("�Ļ�");
		t.setRootid(1);
		t.setTitle("�ҵ�����");
		t.setCont("AC�������AC�������");
		t.setPdate(new Date());
		t.setIsleaf(0);
	
		Session session=SessionManager.newInstance().getSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		SessionManager.newInstance().closeSession();
	}
	
	
}
