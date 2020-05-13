package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class GoogleSearchResultsPage(private val driver: WebDriver) {

  @FindBy(id = "hdtb-msb")
  private val header: WebElement? = null

  init {
    PageFactory.initElements(driver, this)
  }

  fun searchResultHeader(): String? {
    return header?.text
  }
}

