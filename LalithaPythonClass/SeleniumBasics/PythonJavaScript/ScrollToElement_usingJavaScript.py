from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)
print(" title of the page is :",driver.title)

# to scroll with Javascript executor
driver.execute_script ("window.scrollTo(0,document.body.scrollHeight);")

driver.close()

# title of the page is : Automation Testing Practice
