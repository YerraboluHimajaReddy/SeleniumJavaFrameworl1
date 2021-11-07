from selenium import webdriver

import time

#driver=webdriver.opera("")
from selenium.webdriver.common.by import By
from setuptools import sic

#driver= webdriver.Chrome("path of the chrome driver.exe file")
driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe")
driver.maximize_window()
driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIi6L5x8Du8wIVGSQrCh321gAKEAAYASAAEgLwoPD_BwE")
time.sleep(2)

# Locating multiple elements
#  1 way
allelements=driver.find_elements_by_xpath("//input[contains(@type,'text')]")
print("Total no of elemenst in 1st way :", len(allelements))
# 2nd way

allelements=driver.find_elements(By.XPATH,"//input[contains(@type,'text')]")
print("Total no of elemenst in 2nd way :" , len(allelements))

driver.quit()

# output
# Total no of elemenst in 1st way : 6
# Total no of elemenst in 2nd way : 6