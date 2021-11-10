from selenium import webdriver

import time

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()

driver.get("https://www.youtube.com/")
print(" Tile of the webpage is :", driver.title)

driver.get("https://testautomationpractice.blogspot.com/")
print(" Tile of the webpage is :", driver.title)

# navigation back method
driver.back();
print(" Tile of the webpage is :", driver.title)
time.sleep(2)

# navigation refresh method
driver.refresh();
print(" Tile of the webpage is :", driver.title)
time.sleep(2)

# navigation forward method
driver.forward();
print(" Tile of the webpage is :", driver.title)
time.sleep(2) # 2 seconds

# navigation refresh method
driver.refresh();
print(" Tile of the webpage is :", driver.title)
time.sleep(2)

driver.quit()

#  Tile of the webpage is : YouTube
#  Tile of the webpage is : Automation Testing Practice
#  Tile of the webpage is : YouTube
#  Tile of the webpage is : YouTube
#  Tile of the webpage is : Automation Testing Practice
#  Tile of the webpage is : Automation Testing Practice
