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
    print(" table is displayed")
    rows=driver.find_elements_by_xpath("//*[contains(@name,'BookTable')]/tbody/tr")
    if(len(rows) !=0):
        print(" no of rows in a table :", len(rows))
        for row in rows:
            print(" row number :" , row)
            if(row!=1):
                 columns = driver.find_elements_by_xpath("//*[contains(@name,'BookTable')]/tbody/tr["+row+"]/td")
                 if (len(columns) != 0):
                     print(" no of columns in a table :", len(columns))
                 else:
                     print(" columns are not there in the table:", len(columns))
            else:
                print(" row no ", row)



    else:
        print(" rows are not there in the table:", len(rows))
else:
    print(" table is not displayed")

driver.quit()