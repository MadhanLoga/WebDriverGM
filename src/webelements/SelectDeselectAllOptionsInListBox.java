package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectAllOptionsInListBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");

		WebElement select1 = driver.findElement(By.xpath("//*[@id=\"pickList\"]/div/div[1]/select"));

		Select s1 = new Select(select1);
		List<WebElement> selectalloption = s1.getOptions();
		int count1 = selectalloption.size();
		System.out.println(count1);

		for (int i = 0; i < count1; i++) {
			s1.selectByIndex(i);
		}
		driver.findElement(By.xpath("//*[@id=\"pickList\"]/div/div[2]/button[1]")).click();

		// *[@id="pickList"]/div/div[3]/select
		WebElement select2 = driver.findElement(By.xpath("//*[@id=\"pickList\"]/div/div[3]/select"));
		Select s2 = new Select(select2);
		List<WebElement> deselectalloption = s2.getOptions();
		int count2 = deselectalloption.size();
		System.out.println(count2);
		for (int j = 0; j < count2; j++) {
			s2.selectByIndex(j);
		}
		driver.findElement(By.xpath("//*[@id=\"pickList\"]/div/div[2]/button[4]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
