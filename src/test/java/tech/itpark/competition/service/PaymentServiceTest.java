package tech.itpark.competition.service;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    @Test
    void shouldCalculateForPayment() {
        final var service = new PaymentService();
        final var amountDay = 11;
        final var residencePrice = 3000;
        final var breakfastPrice = 200;
        final var lunchPrice = 300;
        final var dinnerPrice = 200;
        final var numberSeater = 2;
//        final var expected = List.of
        final var expected = 20350;
        final var actualResult = service.calculate(amountDay, residencePrice, breakfastPrice, lunchPrice, dinnerPrice, numberSeater);
        assertEquals(20350, actualResult);
    }

}