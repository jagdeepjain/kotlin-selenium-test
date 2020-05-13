package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class GoogleHomePage(private val driver: WebDriver) {

  @FindBy(name = "q")
  private val searchBox: WebElement? = null

  @FindBy(name = "btnK")
  private val searchButton: WebElement? = null

  init {
    PageFactory.initElements(driver, this)
  }

  fun search(name: String) {
    searchBox?.sendKeys(name)
    searchButton?.click()
  }
}

