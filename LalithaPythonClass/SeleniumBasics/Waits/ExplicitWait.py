from selenium import webdriver

import time

from selenium.webdriver.common.by import By
from selenium.webdriver.support.expected_conditions import element_to_be_clickable

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver.get("https://testautomationpractice.blogspot.com/")
print(" Tile of the webpage is :", driver.title)
# implicit wait is applicable for all the webelements in the webpage
# Explicit wait is applicable only for the webelement in the webpage

# implicit wait
driver.implicitly_wait(2) # 2 seconds

# Explicit wait

# 1st way
element = WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.ID, "field2")))
print(element)

# 2nd way
wait = WebDriverWait(driver, 10)
element = wait.until(EC.element_to_be_clickable((By.XPATH, "//button[contains(text(),'Copy Text')]")))


driver.close()

