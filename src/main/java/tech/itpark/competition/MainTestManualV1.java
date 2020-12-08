package tech.itpark.competition;

import lombok.var;
import tech.itpark.competition.service.PaymentService;

public class MainTestManualV1 {
    public static void main(String[] args) {
        calculatePaymentForFourParticipant();
        calculatePaymentForOneParticipant();
    }
    public static void calculatePaymentForFourParticipant(){
        final var service = new PaymentService();
        final var actual = service.calculate(5,6200,600,900,600,4);
        System.out.println(actual);
    }

    public static void calculatePaymentForOneParticipant(){
        final var service = new PaymentService();
        final var actual = service.calculate(5,6200,600,900,600,1);
        System.out.println(actual);
    }
}
