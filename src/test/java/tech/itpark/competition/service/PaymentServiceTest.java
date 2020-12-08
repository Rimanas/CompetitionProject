package tech.itpark.competition.service;

import lombok.val;
import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    @Test
    void calculatePaymentForFourParticipant() {
        final var service = new PaymentService();
        final var amountDay = 1;
        final var residencePrice = 1;
        final var breakfastPrice = 1;
        final var lunchPrice = 1;
        final var dinnerPrice = 1;
        final var numberSeater = 4;
        final List<Integer> expected = Collections.unmodifiableList(Arrays.asList(1, 1, 1, 1));
        final var actualResult = service.calculate(amountDay, residencePrice, breakfastPrice, lunchPrice, dinnerPrice, numberSeater);
        assertEquals(expected, actualResult);
    }

    @Test
    void calculatePaymentForOneParticipant(){
        final var service = new PaymentService();
        final var amountDay = 1;
        final var residencePrice = 1;
        final var breakfastPrice = 1;
        final var lunchPrice = 1;
        final var dinnerPrice = 1;
        final var numberSeater = 1;
        final List<Integer> expected = Collections.unmodifiableList(Arrays.asList(4));
        final var actualResult = service.calculate(amountDay, residencePrice, breakfastPrice, lunchPrice, dinnerPrice, numberSeater);
        assertEquals(expected, actualResult);
    }

    @Test
    void calculatePaymentForTwoParticipant(){
        final var service = new PaymentService();
        final var amountDay = 1;
        final var residencePrice = 1;
        final var breakfastPrice = 1;
        final var lunchPrice = 1;
        final var dinnerPrice = 1;
        final var numberSeater = 2;
        final List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2, 2));
        final var actualResult = service.calculate(amountDay, residencePrice, breakfastPrice, lunchPrice, dinnerPrice, numberSeater);
        assertEquals(expected, actualResult);
    }

}