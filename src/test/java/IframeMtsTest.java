import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IframeMtsTest extends BaseTest {
    private String phoneNumber = "(29)777-77-77";
    private String phoneNumberIframe = "375297777777";
    private String neededAttribute = "placeholder";
    private String phoneLabel = "Номер телефона";
    private String depositLabel = "Сумма";
    private String subscriberPhoneLabel = "Номер абонента";
    private String subscriberCreditLabel = "Номер счета на 44";
    private String subDebtLabel = "Номер счета на 2073";
    private String emailLabel = "E-mail для отправки чека";
    private String cardNumber = "Номер карты";
    private String cardDate = "Срок действия";
    private String cvcCode = "CVC";
    private String cardOwnerName = "Имя держателя (как на карте)";
    private String moneyAmount = "100.00";
    private boolean isTestPassed = false;
    SoftAssert softAssert = new SoftAssert();

    @DataProvider(name = "frameIndices")
    public Object[][] createFrameIndices() {
        return new Object[][]{
                {0},
                {1}
        };
    }


    @Test
    public void checkTextInFieldsInServiceCategory() {

    }


    @Test
    public void checkTextInFieldsInInternetCategory() {

    }


    @Test
    public void checkTextInFieldsInCreditCategory() {

    }


    @Test
    public void checkTextInFieldsInDebtCategory() {

    }

    @Test(dataProvider = "frameIndices")

    public void checkTextAndPaymentsLogoInAllFields(int frameIndex) {
    }
}


