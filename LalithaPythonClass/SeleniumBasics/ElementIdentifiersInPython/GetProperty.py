from selenium import webdriver
import time

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window()
keyword = "geeksforgeeks"
driver.get("https://www.geeksforgeeks.org/")
# get element
element = driver.find_element_by_link_text("Courses")
# get text_length property
print(element.get_property('href')) # https://practice.geeksforgeeks.org/courses/?ref=ghm

driver.close()
