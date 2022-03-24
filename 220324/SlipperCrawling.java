package Test01;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlipperCrawling {
	public static final String DRIVER_ID = "webdriver.chrome.driver";
	public static final String DRIVER_PATH = "C:\\Crawling\\chromedriver.exe";
	protected static List<String> Distance = new ArrayList<>();

	public void Crawling() {
		System.setProperty(DRIVER_ID, DRIVER_PATH);

		WebDriver driver = new ChromeDriver();

		int count = 0;
		SlipperExcel excel = new SlipperExcel();
		List<String> address = excel.list;
		String a = "";
		String b = "";

		while (count <= address.size()) {

			driver.get("https://map.naver.com/");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(
					By.xpath("/html/body/app/layout/div[3]/div[1]/navbar/perfect-scrollbar/div/div[1]/div/ul/li[2]/a"))
					.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			try {
				driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
						.sendKeys(address.get(count)); // variable x
				driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
						.sendKeys(Keys.ENTER);
			} catch (Exception e) {
				e.printStackTrace();
				count++;
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			try {
				driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
						.sendKeys("¹éÈ­Á¡");
				driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
						.sendKeys(Keys.ENTER);
			} catch (Exception e) {
				e.printStackTrace();
				count++;
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			try {
				driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[3]/a"))
						.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String prop = "/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-walking/div[1]/strong/readable-duration/span[";
			String prep = "]";

			try {
				a = (driver.findElement(By.xpath(prop + 1 + prep)).getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				b = (driver.findElement(By.xpath(prop + 2 + prep)).getText());
			} catch (Exception e) {
				e.printStackTrace();
			}

			Distance.add(address.get(count) + "-" + a + b); // [road - # + minute]

			/*
			 * SlipperOutStream sos = new SlipperOutStream(this.a, this.b, count);
			 * sos.Output();
			 */
			count++;
		}

		SlipperMatch sm = new SlipperMatch();
		sm.Output();
	}
}
