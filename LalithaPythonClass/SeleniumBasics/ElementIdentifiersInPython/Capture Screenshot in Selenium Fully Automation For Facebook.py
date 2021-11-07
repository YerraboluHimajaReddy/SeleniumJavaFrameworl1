import time

from selenium import webdriver

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window() # to maximize the window
driver.get("https://www.facebook.com/") # to launch a web browser
time.sleep(2)
driver.get_screenshot_as_file("C:\\Users\\Sony\\PycharmProjects\\LalithaClass\\Screenshots\\Facebook.png")
driver.quit() # to close all opened web browsers