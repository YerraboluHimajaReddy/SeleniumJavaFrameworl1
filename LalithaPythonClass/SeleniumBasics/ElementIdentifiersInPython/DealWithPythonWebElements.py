from datetime import time

from selenium import webdriver
from selenium.webdriver.chrome.service import service

s= service("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
driver=webdriver.chrome(service=s)
print(type(driver))
time.sleep(2)
driver.maximize_window()
driver.get("https://opensource-demo.orangehrmlive.com")
time.sleep(2)

username=driver.fi

