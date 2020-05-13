package org.example

import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit
import kotlin.test.assertTrue

class GoogleSearchResultsTest {
  var driver = ChromeDriver()

  @BeforeTest
  fun setup() {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    driver.manage().window().maximize()
    driver.get("https://www.google.co.in")
  }

  @Test
  fun testSearchPage() {
    GoogleHomePage(this.driver).search("Jagdeep")
    GoogleSearchResultsPage(this.driver).searchResultHeader()
      ?.contains("Images")?.let { assertTrue(it) }
  }

  @AfterTest
  fun driverClose() {
    driver.close();
  }
}
