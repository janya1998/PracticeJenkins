package CreateContactTest;

import org.testng.annotations.Test;

public class PracticePrameterTest {
	@Test
	public void Practice() {
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		
		String URL = System.getProperty("url");
		
		System.out.println(URL);
		
	}

}
