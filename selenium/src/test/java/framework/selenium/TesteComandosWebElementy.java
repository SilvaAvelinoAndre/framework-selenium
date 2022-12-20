package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosWebElementy {
	
	 
	
	public static void main(String[] args) {
		
		comandosWebElementy();
		
	}
	
	static WebDriver driver;
	
	public static void comandosWebElementy() {
		
		System.setProperty("webdrive.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		/* Teste de automação logon na conta do facebook - FUNCIONANDO
		 * driver.findElement(By.id("email")).sendKeys("andreavelinosilva@hotmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Cartola75*");
		 * driver.findElement(By.name("login")).click();
		 */
		
		 driver.findElement(By.id("email")).sendKeys("andreavelinosilva@hotmail.com");
		 driver.findElement(By.id("email")).clear(); // comando apaga, no caso o email que foi passado acima
		
		 boolean apareceu;
		 apareceu = driver.findElement(By.id("email")).isDisplayed();// verifica se o item na pagina esta aparecendo.
		 System.out.println("Apareceu = " + apareceu);
		 
		 
		 boolean habilitado;
		 habilitado = driver.findElement(By.id("email")).isEnabled(); // verifica se o item na pagina esta habilitado
		 System.out.println("Habilitado = " + habilitado);
		 
			/*Códigos abaixo abre um pagina e verifica se a caixa de seleção esta selecionada ou não.
			*/
		 driver.navigate().to("https://www.dell.com/pt-br/shop/computadores-all-in-ones-e-workstations/sr/desktops-n-workstations/micro?appliedRefinements=15462");
		 boolean selecionado;
		 selecionado = driver.findElement(By.name("15462")).isSelected(); // verifca se item na pagina foi selecionado
		 System.out.println("Selecionado = " + selecionado);
		 
		 driver.navigate().to("http://facebook.com");
		 String linkDoTexto;
		 linkDoTexto = driver.findElement(By.linkText("Esqueceu a senha?")).getText(); // traz o texto do link(não o link)
		 System.out.println(linkDoTexto);
		 
		 driver.navigate().to("https://facebook.com");
		 driver.findElement(By.id("email")).sendKeys("andreavelinosilva@hotmail.com");
		 driver.findElement(By.id("pass")).sendKeys("Cartola75*");
		 driver.findElement(By.name("login")).submit(); // submit aperta um botão.
		 
		 
		 
	}
	
	

}
