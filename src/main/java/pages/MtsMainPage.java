
package pages;

import framework.base.BasePage;
import framework.elements.Button;
import framework.elements.DropDownList;
import framework.elements.Label;
import framework.elements.TextField;
import framework.enums.MtsPaymentCategory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import static framework.base.BaseElement.switchToFrameByFrameIndexAndWait;

public class MtsMainPage extends BasePage {
    private static String mtsMainPage = "Главная страница МТС";

    private static Label mtsOnlinePayLabel = new Label(By.xpath("//div[@class='pay__wrapper']//h2"),
            "Лэйбл проверки главной страницы");


    private static Button cookieOkButton = new Button(By.xpath("//button[@id='cookie-agree']"),
            "Кнопка принятия куки");

    public MtsMainPage() {
        super(mtsOnlinePayLabel, mtsMainPage);
    }

    public void clickCookiesButton() {
        try {
            cookieOkButton.waitDisplayedAndClick();
        } catch (NoSuchElementException e) {
            System.out.println("Окно с куками не отображается.");
        } catch (TimeoutException e) {
            System.out.println();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при попытке нажать на кнопку куки: " + e.getMessage());
        }
    }



}
