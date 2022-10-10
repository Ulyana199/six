package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void Test() {
        SQRService service = new SQRService();

        int actual = service.calculate(150, 450);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
}
