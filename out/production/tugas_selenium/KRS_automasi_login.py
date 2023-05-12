from selenium import webdriver
import time
from selenium.webdriver.common.by import By

try:

    driver = webdriver.Chrome()

    # 1 membuka website
    driver.get("https://krsonline.usk.ac.id/")

    # 2 input npm
    npm_input = driver.find_element(By.NAME, "npm")
    npm_input.send_keys("2008107010062")

    # 3 input password
    password_input = driver.find_element(By.NAME, "password")
    password_input.send_keys("tabloidfarah22")

    # 4 klik tombol login
    login_button = driver.find_element(
        By.XPATH, "//button[@type='submit']")
    login_button.click()

    # 5 menunggu laman loading
    time.sleep(5)

    # tahan agar window tidak terclose otomatis
    input("Press ENTER to exit\n")

except Exception as e:
    print("Error occurred:", e)
