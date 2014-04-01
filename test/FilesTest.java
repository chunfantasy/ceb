import org.junit.Test;

import com.ceb.model.Files;
import com.ceb.service.FilesService;


public class FilesTest {
	
	@Test
	public void testBbsSave() {
	
		Files t = new Files();

		t.setId("2010030201");
	    t.setDescription("abc");
	    t.setName("wenhui");
	    
		FilesService fs =new  FilesService();
		fs.save(t);
		
	}

	}

