package tech.itpark.competition.service;

import lombok.var;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentServiceTest {
    @Test
    void calculatePaymentForFiveParticipant() {
        final var service = new PaymentService();
        final var paymentPaid = 10000;
        final var participantsNumber = 5;

        final List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2000, 2000, 2000, 2000, 2000));
        final var actualResult = service.calculatePaymentForParticipant(paymentPaid, participantsNumber);
        assertEquals(expected, actualResult);
    }

    @Test
    void calculatePaymentForOneParticipant() {
        final var service = new PaymentService();
        final var paymentPaid = 10000;
        final var participantsNumber = 1;

        final List<Integer> expected = Collections.unmodifiableList(Arrays.asList(10000));
        final var actualResult = service.calculatePaymentForParticipant(paymentPaid, participantsNumber);
        assertEquals(expected, actualResult);
    }

}