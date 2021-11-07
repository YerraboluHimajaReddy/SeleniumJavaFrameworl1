from _ast import List

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement

driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://testautomationpractice.blogspot.com/")
driver.implicitly_wait(2)

# tr is table row and td is table column
table=driver.find_element_by_xpath("//*[contains(@name,'BookTable')]")

if(table.is_displayed()):
    row=driver.find_elements_by_xpath("//*[contains(@name,'BookTable')]/tbody/tr")
    column=driver.find_elements_by_xpath("//*[contains(@name,'BookTable')]/tbody/tr/td")
    java=driver.find_element_by_xpath("//*[contains(@name,'BookTable')]/tbody/tr[3]/td[3]")
    if(java.text=="Java"):
        print(java.text)
    else:
        print(java.text,"is not displayed ")
else:
    print(" table is not displayed")

driver.quit()

# Java