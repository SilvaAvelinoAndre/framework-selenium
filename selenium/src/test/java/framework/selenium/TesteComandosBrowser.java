package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosBrowser {

	public static void main(String[] args) {

		comandosBrowser();
		
	}

	static WebDriver driver;
	
	public static void comandosBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe"); // seta as propriedades do driver e o caminha
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximiza a janela
		
		driver.get("https://www.microsoft.com/pt-br/microsoft-teams/log-in");
		
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String fonte = driver.getPageSource();
		System.out.println(fonte);
		
		driver.close();
		
	}
	
	
}
