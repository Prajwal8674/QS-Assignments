package Assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAllProducts {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.partialLinkText("Digital downloads")).click();
        Thread.sleep(500);

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//input[@value='Add to cart']"));
        for (WebElement button : addToCartButtons) {
            button.click();
            Thread.sleep(1000);
        }

        driver.findElement(By.className("ico-cart")).click();
        Thread.sleep(1000);

        List<WebElement> rows = driver.findElements(By.className("cart-item-row"));

        double maxPrice = 0;
        WebElement maxPriceButton = null;

        for (WebElement row : rows) {
            // Extract the price, including the currency symbol
            String webPrice = row.findElement(By.xpath(".//td[@class='subtotal nobr end']/span")).getText();

            // Extract only the numeric value for comparison
            String numericValue = webPrice.replaceAll("[^0-9.]", "");
            double priceValue = Double.valueOf(numericValue);

            if (priceValue > maxPrice) {
                maxPrice = priceValue;
                maxPriceButton = row.findElement(By.xpath(".//input[@type='checkbox']"));
            }
        }

        if (maxPriceButton != null) {
            maxPriceButton.click();
            System.out.println("Clicked on the product with the maximum price: " + maxPrice);
        } else {
            System.err.println("Could not find the product with the maximum price.");
        }

        driver.quit();
    }
}
