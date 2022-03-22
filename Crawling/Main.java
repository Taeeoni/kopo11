package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
   
   public static void main(String[] args) {
      // ID, PATH ����
      String DRIVER_ID = "webdriver.chrome.driver";
      String DRIVER_PATH = "C:/chromedriver.exe";
      
      System.setProperty(DRIVER_ID, DRIVER_PATH);
      WebDriver driver = new ChromeDriver();
      // ������ url
      String base_url = "https://www.google.com";
      try{
         // ����
         driver.get(base_url);
         // �������� ���ϴ�.
         System.out.println(driver.getPageSource());
         // �±��߿� ù��° ã����
         WebElement webElement = driver.findElement(By.name("q"));
         // Ű�� üũ
         webElement.sendKeys("�ν�Ʈ��ũ �κ�");
         // ������ ������ (����)
         webElement.submit();
         //�ؽ�Ʈ ��������
         String str = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3")).getText();
         
         System.out.println(str);
  
         //�ؽ�Ʈ ������ �κ��� Ŭ���ϰ� ���� �� 
         driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3")).click();

         
      } catch (Exception e){
         e.printStackTrace();
      }
   }
   
}
