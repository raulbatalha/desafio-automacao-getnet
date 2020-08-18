package br.com.getnet.navegador;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfiguracaoDoNavegador {

    public static WebDriver driverSelenium = null;
    protected static WebDriverWait waitSelenium = null;

    public static void configuracaoDoNavegador() {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        driverSelenium = new ChromeDriver();
        driverSelenium.get("https://site.getnet.com.br");
        driverSelenium.manage().window().maximize();
        waitSelenium = new WebDriverWait(driverSelenium, 10);
    }
}