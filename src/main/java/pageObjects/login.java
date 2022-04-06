package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {


    public WebDriver driver;

    By email=By.cssSelector("[id='user-name']");
    By password=By.id("password");
    By login=By.id("login-button");




    public login(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }




    public WebElement getEmail()
    {
        return driver.findElement(email);
    }


    public WebElement getPassword()
    {
        return driver.findElement(password);
    }

    public WebElement getLogin()
    {
        return driver.findElement(login);
    }



}
