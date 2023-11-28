package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldSpendIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(700);
        int expected = 300;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSpendIfAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2300);
        int expected = 700;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSpendIfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);

    }


    @Test
    public void shouldNotSpendIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSpendIfAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSpendIfAmountLessNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(-1);
        int expected = 1001;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSpendIfAmountNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSpendIfAmountMoreNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);

    }

}