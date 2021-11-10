from selenium import webdriver

import time

from selenium.webdriver.support.select import Select

driver= webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
driver.maximize_window()

driver.get("https://testautomationpractice.blogspot.com/")

alert_button_ClickMe=driver.find_element_by_xpath("//button[contains(@onclick,'myFunction()')]")
if(alert_button_ClickMe.is_displayed()):
    alert_button_ClickMe.click()

    # to get alert text
    alert_text=driver.switch_to_alert().text
    print(" alert test is :" + alert_text)

    # for alert accept
    #driver.switch_to_alert().accept()

    # for alert cancel
    driver.switch_to_alert().dismiss()


driver.quit()
