from selenium import webdriver

import time

#driver=webdriver.opera("")
driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window()
driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
time.sleep(2)

# using ID
driver.find_element_by_id("identifierId").send_keys("himaja04.selenium@gmail.com")
time.sleep(2)
driver.quit()
