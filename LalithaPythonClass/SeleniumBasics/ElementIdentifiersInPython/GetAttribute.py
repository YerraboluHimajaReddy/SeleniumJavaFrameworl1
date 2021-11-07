from selenium import webdriver
import time

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window()
keyword = "geeksforgeeks"
driver.get("https://www.geeksforgeeks.org/")
# get element
element = driver.find_element_by_link_text("Courses")

# get href attribute
print(element.get_attribute('href')) # https://practice.geeksforgeeks.org/courses/?ref=ghm
print(element.get_attribute('class')) #remove-anchor__decoration
driver.close()
