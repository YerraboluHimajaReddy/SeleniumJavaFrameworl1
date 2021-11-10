from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)
print(" title of the page is :",driver.title)

Click_Element=driver.find_element_by_xpath("//*[contains(text(),'Click Me')]")
# Create the object for Action Chains
actions=ActionChains(driver)

actions.click(Click_Element).perform()
driver.switch_to_alert().accept()
driver.close()