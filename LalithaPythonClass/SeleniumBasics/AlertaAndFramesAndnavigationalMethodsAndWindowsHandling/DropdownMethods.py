from selenium import webdriver

import time

from selenium.webdriver.support.select import Select

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()

driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIi6L5x8Du8wIVGSQrCh321gAKEAAYASAAEgLwoPD_BwE")

# using ID
#element=driver.find_element_by_id("identifierId")

#Creating webelement
element=driver.find_element_by_name("firstname")
element.send_keys("Himaja Reddy")

dropdown_Date=Select(driver.find_element_by_xpath("//select[contains(@name,'birthday_day')]"))
dropdown_Date.select_by_visible_text('4')

dropdown_Date.select_by_value('14')

dropdown_Date.select_by_index(1)

dropdown_Month=Select(driver.find_element_by_xpath("//select[contains(@name,'birthday_month')]"))
dropdown_Month.select_by_visible_text('Sep')
time.sleep(2)

dropdown_Month.select_by_value('4')
time.sleep(2)

dropdown_Month.select_by_index(5)
time.sleep(2)
driver.quit()

# input
