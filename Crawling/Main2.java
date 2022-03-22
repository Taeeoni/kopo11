package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {

	public static void main(String[] args) {
		// ID, PATH 汲沥
		String DRIVER_ID = "webdriver.chrome.driver";
		String DRIVER_PATH = "C:/chromedriver.exe";

		System.setProperty(DRIVER_ID, DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		// 立加且 url
		String base_url = "https://www.inven.co.kr/board/lostark/4811";
		try {
			// 立加
			driver.get(base_url);

			for (int j = 1; j <= 10; j++) {
				for (int i = 1; i <= 100; i++) {

					String num = Integer.toString(i);

					WebElement webElement = driver.findElement(
							By.xpath("//*[@id=\"new-board\"]/form/div/table/tbody/tr[" + num + "]/td[2]/div/div/a"));

					if (webElement != null) {
						System.out.println(webElement.getText());
					}
				}
				driver.findElement(By.xpath("//*[@id=\"paging\"]/li[3]/a")).click();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
