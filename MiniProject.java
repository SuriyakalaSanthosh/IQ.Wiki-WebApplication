package seleniumPack;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiniProject {
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.get("https://iq.wiki/");
	d.manage().window().maximize();
	List<WebElement> e = d.findElements(By.xpath("/html/body/div/div[1]/div/section/h1"));
	String title = d.getTitle();
	System.out.println(title);
	//System.out.println(e.size());
	for(WebElement i:e)
	{
		System.out.println("Here the Text is:" +i.getText());
	}
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions act = new Actions(d);
	act.scrollByAmount(0, 500).perform();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.findElement(By.cssSelector("button[role='combobox']")).sendKeys("This Week"+Keys.ENTER);
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	act.scrollByAmount(0, 500).perform();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement heading = d.findElement(By.cssSelector("ul.flex "));
	System.out.println(heading.getText());
	/*
	//heading using Id
	WebElement h1 = d.findElement(By.id("title-charlotte-fang"));
	System.out.println(h1.getText());
	WebElement h2 = d.findElement(By.id("title-jeff-yan"));
	System.out.println(h2.getText());
	WebElement h3 = d.findElement(By.id("title-jake-claver"));
	System.out.println(h3.getText());
	WebElement h4 = d.findElement(By.id("title-crundle"));
	System.out.println(h4.getText());
	WebElement h5 = d.findElement(By.id("title-remilianet"));
	System.out.println(h5.getText());
	*/
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> tableColumn = d.findElements(By.tagName("th"));
 	System.out.println(tableColumn.size());
	for(WebElement i : tableColumn)
	{
		System.out.println(i.getText());
	}
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	act.scrollByAmount(0, 1000).perform();
	d.findElement(By.xpath("/html/body/div/div[1]/div/div/section[1]/div[2]/div[3]/a/button")).click();
	Thread.sleep(5000);
	d.navigate().back();
	System.out.println("After navigate the title is :" +d.getTitle());
	Thread.sleep(7000);
	act.scrollByAmount(0, 2500).perform();
	d.findElement(By.xpath("/html/body/div/div[1]/div/div/section[3]/div/nav/a[2]")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.findElement(By.xpath("/html/body/div/div[1]/div/div/button/a")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	List<WebElement> tableData1= d.findElements(By.xpath("/html/body/div/div[1]/div/div[2]/div[2]/div/div[1]/table/tbody/tr[1]"));
	System.out.println(tableData1.size());
	for(WebElement i:tableData1)
	{
		System.out.println(i.getText());
	}
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.findElement(By.xpath("/html/body/div/footer/div/div/div[3]/nav/div[2]/ul/li[1]/a")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	List<WebElement> e2 = d.findElements(By.cssSelector("h1[class^=\"text-center\"]"));
	String tit = d.getTitle();
//	System.out.println(Title);
	for(WebElement i:e2)
	{
		System.out.println("Title of this page is:" +i.getText());
	}
	Thread.sleep(6000);
	d.findElement(By.id("radix-:Rhl6ltb:-trigger-radix-:Rmhl6ltb:")).click();
	d.findElement(By.xpath("//*[@id=\"radix-:Rhl6ltb:-content-radix-:Rmhl6ltb:\"]/ul/li[8]/a/div/div/div")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	act.scrollByAmount(0, 1500).perform();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	act.scrollByAmount(0, -1500).perform();
	d.findElement(By.cssSelector("h1.text-xl ")).click();
	Thread.sleep(5000);
	d.findElement(By.linkText("The Agent Tokenization Platform (ATP)")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	Set<String> windows = d.getWindowHandles();
	System.out.println(windows.size());
	for(String i : windows)
	{
		d.switchTo().window(i);
		System.out.println(d.getTitle());
		if(d.getTitle().contains("IQ AQ: Transforming"))
		{
			d.switchTo().window(i);
			break;
		}
	}
	System.out.println("Now the title is :" +d.getTitle());
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.close();
	Thread.sleep(4000);
	d.quit();
}
}
 