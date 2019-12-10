package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Abraham;
import pages.TitlePage;
import pages.TravelsCars;
import pages.TravelsCarsExtras;
import pages.TravelsCustomers;
import pages.TravelsLogin;
import pages.TravelsMenu;


public class TravelsTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test(priority = 1)
	public void goLogIn() throws InterruptedException, IOException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		File file = new File("Username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		String korisnik = sheet.getRow(1).getCell(0).getStringCellValue();
		String lozinka = sheet.getRow(1).getCell(1).getStringCellValue();
		wb.close();
		TravelsLogin lg = new TravelsLogin(driver);
		lg.singIn(korisnik, lozinka);
		Thread.sleep(2000);

		TitlePage t = new TitlePage(driver);
		String title = t.getPageTitle();

		Assert.assertEquals(title, "Dashboard");
	}

	@Test(priority = 2)
	public void Menu() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

//		Abraham a= new Abraham(driver);
//		a.Ambraham();
		Thread.sleep(3000);
		TravelsMenu m = new TravelsMenu(driver);
		Thread.sleep(3000);
		m.goToDashboard();
		Thread.sleep(2000);
		m.goToUpdates();
		Thread.sleep(2000);
		m.goToModules();
		Thread.sleep(2000);
		m.goToTours();
		m.goToAddTours();
		Thread.sleep(2000);
	     m.goToCoupons();
		Thread.sleep(2000);
		m.goToNewsletter();
		Thread.sleep(2000);
		m.goToBookings();
		Thread.sleep(2000);

	}

	
    @Test(priority = 3)
	public void numOfCars() throws Exception {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);

//		Abraham a= new Abraham(driver);
//		a.Ambraham();
		
		TravelsCars c = new TravelsCars(driver);
		System.out.println(c.carsCount());
		Thread.sleep(2000);
		
		System.out.println(c.getOrders());
		Thread.sleep(1000);	
	}

	@Test(priority = 5)
	public void UploadPhotoCars() throws Exception {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);

//		Abraham a= new Abraham(driver);
//		a.Ambraham();
		TravelsCars c = new TravelsCars(driver);
		c.getUpload();
		Thread.sleep(3000);
		
	}
	@Test(priority=6)
	public void TestCarsExtras() throws Exception
	{
		driver.get("https://www.phptravels.net/admin/cars/extras");
		Thread.sleep(2000);
		
//		Abraham a= new Abraham(driver);
//		a.Ambraham();
		TravelsCarsExtras ce= new TravelsCarsExtras(driver);
		ce.GoToAdd();
		Thread.sleep(3000);
	}

	@Test(priority=7)
	public void TestCustomers() throws Exception
	{
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		TravelsCustomers c= new TravelsCustomers(driver);
		c.AccountCustomers();
		Thread.sleep(1000);
		
		c.ClickOnEdit();
		Thread.sleep(2000);
		c.setInformation("Natasa", "Zlatanovic", "hgagdsah@gmail", "075485738", "Serbia", "fhsgfhs", "Nis1", "Nis2","Enabled");
		c.setCheckBox();
		Thread.sleep(3000);
		c.clickSubmit();
		Thread.sleep(2000);
	}
}
