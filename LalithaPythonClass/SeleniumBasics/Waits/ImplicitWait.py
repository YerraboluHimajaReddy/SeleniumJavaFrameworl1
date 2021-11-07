from selenium import webdriver

import time

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()

driver.get("https://testautomationpractice.blogspot.com/")
print(" Tile of the webpage is :", driver.title)
# implicit wait is applicable for all the webelements in the webpage
# Explicit wait is applicable only for the webelement in the webpage
driver.implicitly_wait(2) # 2 seconds
field_textbox=driver.find_element_by_xpath("//input[contains(@id,'field1')]")
if(field_textbox.is_displayed()):
    print(" Filed 1 textbox value is : ", field_textbox.get_attribute("value"))
    field_textbox.clear()
    field_textbox.send_keys("Hello Himaja Reddy")
    print(" Filed 1 textbox value is : ", field_textbox.get_attribute("value"))
    driver.close()

#  Tile of the webpage is : Automation Testing Practice
#  Filed 1 textbox value is :  Hello World!
#  Filed 1 textbox value is :  Hello Himaja Reddy
