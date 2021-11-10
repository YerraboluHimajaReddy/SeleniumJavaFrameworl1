from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common import keys
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()
driver.implicitly_wait(30)
driver.get("https://google.com");
# perform drag and drop
search_bar = driver.find_element_by_name("q")
#Create the object for Action Chains
actions = ActionChains(driver)
actions.click(search_bar)
actions.key_down(keys.Keys.SHIFT)
actions.send_keys("amazon")
actions.key_up(keys.Keys.SHIFT)
actions.key_up(keys.Keys.ENTER)
# perform the operation on the element
actions.perform()

driver.close(0)

