import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
    		
		System.setProperty("webdriver.chrome.driver","C:\\Nagaraj\\Selenium\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

            if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
     
        driver.close();
       
    }


	}

