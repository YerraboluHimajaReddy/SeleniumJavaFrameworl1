from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)
print(" title of the page is :",driver.title)

# extract the value with Selenium
print(driver.find_element_by_xpath("//*[contains(@id,'field1')]").get_attribute("value"))

# extract the value with Javascript Executor
print(driver.execute_script('return document.getElementById("field1").value'))


driver.close()

# title of the page is : Automation Testing Practice
# Hello World!
# Hello World!