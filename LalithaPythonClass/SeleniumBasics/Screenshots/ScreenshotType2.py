from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement

driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)
print(" title of the page is :",driver.title)

# getting screenshot on the specified path
driver.get_screenshot_as_file("C:\\Users\\Sony\\PycharmProjects\\LalithaClass\\Screenshots\\testautomationpractice.png")

driver.close()