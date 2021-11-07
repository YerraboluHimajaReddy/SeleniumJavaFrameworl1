from selenium import webdriver
driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
# to maximize the browser window
driver.maximize_window()
#get method to launch the URL
driver.get("https://the-internet.herokuapp.com")
#to refresh the browser
driver.refresh()
driver.find_element_by_link_text("Frames").click()
driver.find_element_by_link_text("Nested Frames").click()
# to switch to frame with frame name
driver.switch_to.frame("frame-bottom")
# to get the text inside the frame and print on console
print(driver.find_element_by_xpath ("//*[contains(text(),'BOTTOM')]").text) # BOTTOM
# to move out the current frame to the page level
driver.switch_to.default_content()
#to close the browser
driver.quit()
