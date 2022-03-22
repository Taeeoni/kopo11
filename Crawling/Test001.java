package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001 {
	public static final String DRIVER_ID = "webdriver.chrome.driver";
	public static final String DRIVER_PATH = "C:\\Crawling\\chromedriver.exe";
	
	
    public static void main(String[] args) {
		System.setProperty(DRIVER_ID, DRIVER_PATH);

        WebDriver driver = new ChromeDriver();

        driver.get("https://sports.news.naver.com/index");
        
        try {
        Thread.sleep(3000);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/ul[1]/li[4]/a")).click();
        
        try {
        Thread.sleep(2000);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/ul[1]/li[4]/ul/li[5]/a")).click();
        
        try {
        Thread.sleep(2000);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        String prop = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[";
        String prep = "]/td[1]/div/span[2]";
        
        for(int i = 1; i <= 12; i++) {
        	System.out.println(driver.findElement(By.xpath(prop + i + prep)).getText());
        }
        
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/form/fieldset/input[3]")).sendKeys("삼성라이온즈");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/form/fieldset/input[3]")).sendKeys(Keys.ENTER);
   
    }
}