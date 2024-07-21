package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestTest {

    private static WebDriver driver;
    private TestPage testPage;

    @BeforeEach
     void setupAll() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("mts.by"));
    }

    @ParameterizedTest
    @DisplayName("Проверка текста суммы платежа с внесенным платежем в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void SummText(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "100.00 BYN";
        String actual = testPage.getCostNumber().getText();
        assertEquals(expected, actual, "Сумма платежа не совпадает с описанием");
    }

    @ParameterizedTest
    @DisplayName("Проверка текста номера телефона с введенным телефоном в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void NumberText(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "Номер:375297777777";
        String actual = testPage.getPhoneNumber().getText();
        assertEquals(expected, actual, "Номер телефона не совпадает с описанием");
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдера Номер карты в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void CardNumber(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "Номер карты";
        String actual = testPage.getCardNumberPlaceholder().getText();
        assertEquals(expected, actual, "Номер карты не совпадает с описанием");
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдера Срок действия в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void Validity(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "Срок действия";
        String actual = testPage.getValidityPlaceholder().getText();
        assertEquals(expected, actual, "Срок действия не совпадает с описанием");
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдера CVC в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void Cvc(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "CVC";
        String actual = testPage.getCvc().getText();
        assertEquals(expected, actual, "CVC не совпадает с описанием");
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдера Имя держателя (как на карте) в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void NameCard(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "Имя держателя (как на карте)";
        String actual = testPage.getNamecard().getText();
        assertEquals(expected, actual, "Имя держателя (как на карте) не совпадает с описанием");
    }

    @ParameterizedTest
    @DisplayName("Проверка лого MasterCard в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void logoMastecard(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        assertTrue(testPage.getImgMasterCard().isDisplayed(), "Лого MasterCard не отображается");
    }

    @ParameterizedTest
    @DisplayName("Проверка лого Visa в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void logoVisa(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        assertTrue(testPage.getImgVisa().isDisplayed(), "Лого Visa не отображается");
    }

    @ParameterizedTest
    @DisplayName("Проверка лого Belcart в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void logoBelcart(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        assertTrue(testPage.getImgBelcart().isDisplayed(), "Лого Belcart не отображается");
    }

    @ParameterizedTest
    @DisplayName("Проверка лого Mir в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void logoMir(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        assertTrue(testPage.getImgmir().isDisplayed(), "Лого Mir не отображается");
    }

    @ParameterizedTest
    @DisplayName("Проверка лого Maestro в монадальном окне блока Услуга связи ")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void logoMaestro(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        assertTrue(testPage.getImgMaestro().isDisplayed(), "Лого Maestro не отображается");
    }

    @ParameterizedTest
    @DisplayName("Проверка текста Оплатить 100.00 BYN на кнопке подтверждения в монадальном окне блока Услуга связи")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void Buttontext(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expected = "Оплатить 100.00 BYN";
        String actual = testPage.getButtontextPrice().getText();
        assertEquals(expected, actual, "Текст 'Оплатить 100.00 BYN' не совпадает с описанием");
    }

    @AfterAll
    static void quitAll() {
        driver.close();
        driver.quit();
    }
}