import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KrsOnlineLogin {
    public static void main(String[] args) {
        try {
            // Inisialisasi driver dan buka halaman login
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://krsonline.usk.ac.id/");

            // Isi NPM
            WebElement npmInput = driver.findElement(By.name("npm"));
            npmInput.sendKeys("2008107010062");

            // Isi password
            WebElement passwordInput = driver.findElement(By.name("password"));
            passwordInput.sendKeys("tabloidfarah22");

            // Klik tombol login
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // Tunggu hingga halaman selesai dimuat
            Thread.sleep(5000);

            // Tampilkan judul halaman setelah login berhasil
            System.out.println("Judul halaman setelah login: " + driver.getTitle());

            // Tutup browser
            driver.quit();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
