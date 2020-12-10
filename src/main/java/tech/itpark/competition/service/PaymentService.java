package tech.itpark.competition.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaymentService {

    public List<Integer> calculatePaymentForParticipant(int paymentPaid, int participantsNumber) {

        int paymentOnePerson = paymentPaid / participantsNumber;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < participantsNumber - 1; i++) {
            result.add(paymentOnePerson);
        }
        result.add(paymentPaid - paymentOnePerson * (participantsNumber - 1));
        return result;

    }

}
