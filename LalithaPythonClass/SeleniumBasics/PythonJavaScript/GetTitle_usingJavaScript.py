from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)

# print the page title in console using selenium
print(" title of the page is :",driver.title)

# print the page title in console using java script
print(driver.execute_script('return document.title'))
# print the page URL in console
print(driver.execute_script('return document.URL'))


driver.close()

#  title of the page is : Automation Testing Practice
# Automation Testing Practice
# https://testautomationpractice.blogspot.com/
