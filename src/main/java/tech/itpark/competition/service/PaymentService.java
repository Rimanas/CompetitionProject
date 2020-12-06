package tech.itpark.competition.service;

import java.util.Collections;
import java.util.List;

public class PaymentService {
//    public List<Integer> calculate(int amountDay, int residencePrice, int breakfastPrice, int lunchPrice, int dinnerPrice, int numberSeater) {
//        int dayPrice = residencePrice + breakfastPrice + lunchPrice + dinnerPrice;
//        int payment = (dayPrice * amountDay) / numberSeater;
//        return payment;
        public int calculate(int amountDay, int residencePrice, int breakfastPrice, int lunchPrice, int dinnerPrice, int numberSeater) {
        int dayPrice = residencePrice + breakfastPrice + lunchPrice + dinnerPrice;
        int payment = (dayPrice * amountDay) / numberSeater;
        return payment;

    }
}
