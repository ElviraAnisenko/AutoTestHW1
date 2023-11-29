package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {

    /// JUnit4
    @org.junit.Test
    public void shouldSpendIfAmountLess1000OnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(700);
        int expected = 300;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSpendIfAmountMore1000OnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2300);
        int expected = 700;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSpendIfAmount999OnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(expected, actual);

    }


    @org.junit.Test
    public void shouldNotSpendIfAmount1000OnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSpendIfAmount1001OnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSpendIfAmountLessNullOnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(-1);
        int expected = 1001;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSpendIfAmountNullOnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSpendIfAmountMoreNullOnJUnit4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(expected, actual);

    }

    /// JUnit Jupiter
    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(700);
        int expected = 300;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2300);
        int expected = 700;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void shouldNotSpendIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmountLessNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(-1);
        int expected = 1001;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmountNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldSpendIfAmountMoreNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assertions.assertEquals(expected, actual);

    }
}