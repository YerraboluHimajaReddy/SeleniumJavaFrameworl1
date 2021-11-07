from selenium import webdriver

import time

#driver=webdriver.opera("")
from setuptools import sic

#driver= webdriver.Chrome("path of the chrome driver.exe file")
driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
time.sleep(2)
driver.maximize_window()
driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIi6L5x8Du8wIVGSQrCh321gAKEAAYASAAEgLwoPD_BwE")
time.sleep(2)

# using Name
driver.find_element_by_name("firstname").send_keys("Himaja")
time.sleep(1)
driver.find_element_by_name("lastname").send_keys("Yerrabolu")
time.sleep(1)

# using Xpath
#Absolute Xpath
#driver.find_element_by_xpath("//*[@id='u_0_o_2K']").send_keys("00000000000000000")
time.sleep(1)

# Relative Xpath
# //tagname[contains(@attributename,'attributevalue')]
# //input[contains(@name,'reg_email__')]
driver.find_element_by_xpath("//input[contains(@name,'reg_email__')]").send_keys("00000000000000000")
time.sleep(1)

# by tagname
signupbutton=driver.find_element_by_tag_name("button").get_attribute("type")
print(signupbutton)
driver.find_element_by_tag_name("button").click()
time.sleep(3)
driver.quit()
