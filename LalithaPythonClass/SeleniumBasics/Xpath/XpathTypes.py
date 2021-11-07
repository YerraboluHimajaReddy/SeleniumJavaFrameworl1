from _ast import List
from builtins import print

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement

driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)

# contains method
# 1st way
doubleclick=driver.find_element_by_xpath("//*[contains(text(),'Double Click')]")
print(doubleclick.text)

# 2nd way
doubleclick=driver.find_element_by_xpath("(//*[contains(text(),'Double')])[1]")
print(doubleclick.text)

# Starts with method
doubleclick=driver.find_element_by_xpath("(//*[starts-with(text(),'Double')])[1]")
print(doubleclick.text)

# ends with method
# //tagname[ends-with(@attribute, 'value')]
#doubleclick=driver.find_element_by_xpath("(//*[ends-with(text(),'Click')])[1]")
#print(doubleclick.text)

# text  method
doubleclick=driver.find_element_by_xpath("//*[text()='Double Click']")
print(doubleclick.text)

# And  method
doubleclick=driver.find_element_by_xpath("//*[text()='Double Click' and @class='title']")
print(doubleclick.text)

# OR  method
doubleclick=driver.find_elements_by_xpath("//*[text()='Double Click' or @class='title']")
print(len(doubleclick))

driver.quit()

# Double Click
# Double Click
# Double Click
# Double Click
# Double Click
# 16