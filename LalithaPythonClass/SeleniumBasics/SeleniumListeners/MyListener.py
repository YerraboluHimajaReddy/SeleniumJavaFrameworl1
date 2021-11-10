import unittest
import logging
from selenium import webdriver
from selenium.webdriver.support.events import EventFiringWebDriver, AbstractEventListener

class MyListener(AbstractEventListener):
    def before_navigate_to(self, url, driver):
        print("Before navigate to %s" % url)

    def after_navigate_to(self, url, driver):
        print("After navigate to %s" % url)

class Test(unittest.TestCase):
    def test_logging_file(self):
        driver = webdriver.Chrome("C:\\Users\\Sony\\Desktop\\Python\\Drivers\\chromedriver.exe")
        edriver = EventFiringWebDriver(driver, MyListener())
        edriver.get("https://google.com")

if __name__ == "__main__":
    unittest.main()


