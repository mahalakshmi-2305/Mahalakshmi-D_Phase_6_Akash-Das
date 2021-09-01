package com.healthcare.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HealthcareAppAdminApplicationTests {

	@Test
	void contextLoads() {
	}
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://localhost:8080/admin";
		String expectedTitle = "Welcome to Medicare";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// close Fire fox
		driver.close();

	}

}
