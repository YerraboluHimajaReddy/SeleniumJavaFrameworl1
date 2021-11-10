from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement

driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.get("https://meesho.com/")
driver.implicitly_wait(2)
print(" title of the page is :",driver.title)
women_ethnic=driver.find_element_by_xpath("//span[contains(text(),'Women Ethnic')]")

# Create the object for Action Chains
actions=ActionChains(driver)

#1st way
actions.move_to_element(women_ethnic).perform()

# 2nd way
#actions.move_to_element(women_ethnic)
# actions.perform()

driver.close()

# output
#  title of the page is : Meesho Online Shopping-Lowest Prices,Great Quality.