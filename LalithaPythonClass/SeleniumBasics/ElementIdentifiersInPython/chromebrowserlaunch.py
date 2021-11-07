import time

from selenium import webdriver

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window() # to maximize the window
driver.get("https://accounts.google.com/signin") # to launch a web browser
time.sleep(2)
driver.close() # to close the particular/ current browser
#driver.quit() # to close the whole chrome browser