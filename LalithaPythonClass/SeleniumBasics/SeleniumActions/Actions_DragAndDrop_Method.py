from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)
print(" title of the page is :",driver.title)

drag_element=driver.find_element_by_xpath("//div[@id='draggable']/p")
drop_element=driver.find_element_by_xpath("//div[@id='droppable']")
# Create the object for Action Chains
actions=ActionChains(driver)

actions.drag_and_drop(drag_element,drop_element).perform()

driver.close()