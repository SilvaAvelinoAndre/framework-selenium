package framework.selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteComandosNavegacao {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		comandosNavegacao();
		
	}
	
	
	public static void comandosNavegacao() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://10.14.111.230");
		
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("celular");
		
		Actions act = new Actions(driver);	// simula comandos do mouse e teclado
		
		act.sendKeys(Keys.ENTER).build().perform(); // simula o comando de teclado ENTER
		
		driver.findElement(By.linkText("Shopping")).click(); //identifica na pagina pelo inspecionamento o link Shopping
		
		driver.navigate().forward(); // avança
		
		driver.navigate().back();// retorna a pagina anterior
		driver.navigate().back();
		driver.navigate().back();
		
		
		
		driver.navigate().refresh();// atualiza a pagina
		
		driver.close(); //fecha a janela em questão
		
	}
	
	

}
