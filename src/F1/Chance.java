package F1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chance {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:/Users/mssil/eclipse-workspace/Final/lib/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://qatechhub.com");
				System.out.println("Hi");
				System.out.println("Hello text");
				driver.close();
			}

		}



