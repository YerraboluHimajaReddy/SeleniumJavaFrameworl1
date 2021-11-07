import time

from selenium import webdriver

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window() # to maximize the window
driver.get("https://accounts.google.com/signin") # to launch a web browser
time.sleep(2)
driver.get_screenshot_as_file("Gmail.png") # to take screenshot of a particular webpage
driver.close()