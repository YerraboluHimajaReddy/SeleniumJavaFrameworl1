from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement

driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)

# clicking on date field
driver.find_element_by_xpath("//input[contains(@id,'datepicker')]").click()
# select date by static way
driver.find_element_by_xpath("//table[contains(@class,'ui-datepicker-calendar')]/tbody/tr[2]/td[4]").click()


# Dynamic way to select date
driver.find_element_by_xpath("//input[contains(@id,'datepicker')]").click()
# getting all dates in a list
dates=driver.find_elements_by_xpath("//table[contains(@class,'ui-datepicker-calendar')]/tbody/tr/td")

# click on specific date
for date in dates:
    if(date.text=="21"):
        date.click()

driver.close()