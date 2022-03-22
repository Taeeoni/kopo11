package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlipperCrawling {
	public static final String DRIVER_ID = "webdriver.chrome.driver";
	public static final String DRIVER_PATH = "C:\\Crawling\\chromedriver.exe";

	public static void main(String[] args) {
		System.setProperty(DRIVER_ID, DRIVER_PATH);

		WebDriver driver = new ChromeDriver();

		int count = 0;

		while (true) {

			SlipperExcel excel = new SlipperExcel(count);
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

			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
					.sendKeys(excel.RoadName()); // variable x
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys("백화점");
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[3]/a"))
					.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String prop = "/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-walking/div[1]/strong/readable-duration/span[";
			String prep = "]";

			for (int i = 1; i <= 2; i++) {

				if (driver.findElement(By.xpath(prop + 2 + prep)).getText().equals("시간")) {
					// can't output
				}
				System.out.print(driver.findElement(By.xpath(prop + i + prep)).getText()); // 몇 시간이 걸릴수도 있다.
			}
			System.out.println("");
			count++;
		}
	}
}
