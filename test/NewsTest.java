
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
	    t.setContent("Ӣ������ʱ���ܶ�Ԯ��130��������Ա�������Ƴ������ɺ����񲿳���һԵ�һ���ţ�����Ҫ��°������������·����йػ��ʲ��ݵĶ��ڱ���ʱ�����й���Ϊ���ʲ��ݹ�֮һ����Щ��Ա���������й�������Ʒ���շ�����˰");
	
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
