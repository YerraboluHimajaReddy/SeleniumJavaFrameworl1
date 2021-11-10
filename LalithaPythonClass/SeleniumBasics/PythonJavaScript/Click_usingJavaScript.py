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
click_element=driver.find_element_by_xpath("//*[contains(text(),'Click Me')]")
click_element.click()
driver.switch_to_alert().accept()

#assertEqual("Tutorialspoint", "Tutorialspoint")

# extract the value with Javascript Executor
driver.execute_script ("arguments[0].click();",click_element)
driver.switch_to_alert().accept()
driver.close()

# title of the page is : Automation Testing Practice
