package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Test1Test {
    private static WebDriver driver;

    @BeforeAll
    static void setupAll() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    void setupEach() {
        driver.get("https://www.mts.by/");
    }

    @DisplayName("Test1" + "Проверить надпись Номер телефона в блоке Услуги связи")
    @Test
    void Number1() {
        Test1 placeholder = new Test1(driver);
        String expected = "Номер телефона";
        String actual = placeholder.getNumber1Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Номер телефона не отображается");
    }

    @DisplayName("Test1" + "Проверить надпись Сумма в блоке Услуги связи")
    @Test
    void Summ1() {
        Test1 placeholder = new Test1(driver);
        String expected = "Сумма";
        String actual = placeholder.getSumm1Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Сумма не отображается");
    }

    @DisplayName("Test1" + "Проверить надпись E-mail для отправки чека в блоке Услуги связи")
    @Test
    void Email1() {
        Test1 placeholder = new Test1(driver);
        String expected = "E-mail для отправки чека";
        String actual = placeholder.getEmail1Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись E-mail для отправки чека не отображается");
    }


    @DisplayName("Test2" + "Проверить надпись Номер абонента в блоке Домашний интернет")
    @Test
    void Number2() {
        Test2 placeholder = new Test2(driver);
        Test2 click2 = new Test2(driver);
        click2.enterDataAndContinue1();
        String expected = "Номер абонента";
        String actual = placeholder.getNumber2Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Номер абонента не отображается");
    }

    @DisplayName("Test2" + "Проверить надпись Сумма в блоке Домашний интернет")
    @Test
    void Summ2() {
        Test2 placeholder = new Test2(driver);
        Test2 test3 = new Test2(driver);
        test3.enterDataAndContinue1();
        String expected = "Сумма";
        String actual = placeholder.getSumm2Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Сумма не отображается");
    }

    @DisplayName("Test2" + "Проверить надпись E-mail для отправки чека в блоке Домашний интернет")
    @Test
    void Email2() {
        Test2 placeholder = new Test2(driver);
        Test2 test4 = new Test2(driver);
        test4.enterDataAndContinue1();
        String expected = "E-mail для отправки чека";
        String actual = placeholder.getEmail2Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись E-mail для отправки чека не отображается");
    }

    @DisplayName("Test3" + "Проверить надпись Номер счета на 44 в блоке Рассрочка")
    @Test
    void Number3() {
        Test3 placeholder = new Test3(driver);
        Test3 click3 = new Test3(driver);
        click3.enterDataAndContinue2();
        String expected = "Номер счета на 44";
        String actual = placeholder.getNumberofScore().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Номер счета на 44 не отображается");
    }

    @DisplayName("Test3" + "Проверить надпись Сумма в блоке Рассрочка")
    @Test
    void Summ3() {
        Test3 placeholder = new Test3(driver);
        Test3 test5 = new Test3(driver);
        test5.enterDataAndContinue2();
        String expected = "Сумма";
        String actual = placeholder.getSumm3Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Сумма не отображается");
    }

    @DisplayName("Test3" + "Проверить надпись E-mail для отправки чека в блоке Рассрочка")
    @Test
    void Email3() {
        Test3 placeholder = new Test3(driver);
        Test3 test6 = new Test3(driver);
        test6.enterDataAndContinue2();
        String expected = "E-mail для отправки чека";
        String actual = placeholder.getEmail3Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись E-mail для отправки чека не отображается");
    }

    @DisplayName("Test4" + "Проверить надпись Номер счета на 2073 в блоке Задолженность")
    @Test
    void Number4() {
        Test4 placeholder = new Test4(driver);
        Test4 click4 = new Test4(driver);
        click4.enterDataAndContinue3();
        String expected = "Номер счета на 2073";
        String actual = placeholder.getNumber1ofScore().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Номер счета на 44 не отображается");
    }

    @DisplayName("Test4" + "Проверить надпись Сумма в блоке Задолженность")
    @Test
    void Summ4() {
        Test4 placeholder = new Test4(driver);
        Test4 test7 = new Test4(driver);
        test7.enterDataAndContinue3();
        String expected = "Сумма";
        String actual = placeholder.getSumm4Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись Сумма не отображается");
    }

    @DisplayName("Test4" + "Проверить надпись E-mail для отправки чека в блоке Задолженность")
    @Test
    void Email4() {
        Test4 placeholder = new Test4(driver);
        Test4 test8 = new Test4(driver);
        test8.enterDataAndContinue3();
        String expected = "E-mail для отправки чека";
        String actual = placeholder.getEmail4Placeholder().getAttribute("placeholder");
        assertEquals(expected, actual, "Надпись E-mail для отправки чека не отображается");
    }

    @AfterEach
    public void closeEach() {
        driver.close();
    }

    @AfterAll
    static void quitAll() {
        driver.quit();
    }
}