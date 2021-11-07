from _ast import List
from builtins import print

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement

driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)

# Following  method
following=driver.find_element_by_xpath("(//*[contains(@class,'widget-content')]/following::input)[1]")
print(following.get_attribute("class"))

# Following -sibling method
following_sibling=driver.find_element_by_xpath("(//*[contains(@class,'widget-content')]//following-sibling::input)[2]")
print(following_sibling.get_attribute("value"))

# child method
child=driver.find_element_by_xpath("(//*[contains(@class,'widget HTML')]//child::h2)[1]")
print(child.get_attribute("class"))

# preceding
preceding=driver.find_element_by_xpath("(//*[contains(@class,'widget HTML')]//preceding::h2)[1]")
print(preceding.get_attribute("class"))

driver.quit()
# hasDatepicker
# Hello World!
# title
# title