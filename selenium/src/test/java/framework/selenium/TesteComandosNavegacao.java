package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosNavegacao {

	static WebDriver driver;

	public static void main(String[] args) {
		comandosNavegacao();

	}

	public static void comandosNavegacao() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile&client_id=5e3ce6c0-2b1f-4285-8d4b-75ee78787346&redirect_uri=https%3A%2F%2Fteams.microsoft.com%2Fgo&state=eyJpZCI6IjY1ZjI4MTEyLTE5MDAtNGZhYy1iOTZiLTViYTgxMmE1MzhiMiIsInRzIjoxNjcxNDczMzk3LCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=a672b539-b1db-4054-8ff6-bd2b30649fd2&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.3.4&client-request-id=2b649df2-9159-4e0d-b465-87a9b4ed94bb&response_mode=fragment");

		//driver.navigate().to("https://www.google.com");

		//driver.findElement(By.name("q")).sendKeys("celular");

		//Actions act = new Actions(driver); // simula comandos do mouse e teclado

		//act.sendKeys(Keys.ENTER).build().perform(); // simula o comando de teclado ENTER

		//driver.findElement(By.linkText("Entrar")).click(); // identifica na pagina pelo inspecionamento o link Shopping

		driver.findElement(By.id("i0116")).sendKeys("piaras@sp.gov.br");
			
			  //driver.findElement(By.linkText("Shopping")).click();
			  //driver.findElement(By.id("134880504")).click(); driver.navigate().forward(); // avança
			 
		// driver.navigate().back();// retorna a pagina anterior

		driver.navigate().refresh();// atualiza a pagina

		// driver.close(); //fecha a janela em questão

	}

}
