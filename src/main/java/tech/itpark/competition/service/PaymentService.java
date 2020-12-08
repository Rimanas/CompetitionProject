package tech.itpark.competition.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PaymentService {
//    public List<Integer> calculate(int amountDay, int residencePrice, int breakfastPrice, int lunchPrice, int dinnerPrice, int numberSeater) {
//        int dayPrice = residencePrice + breakfastPrice + lunchPrice + dinnerPrice;
//        int payment = (dayPrice * amountDay) / numberSeater;
//        return payment;
//        public int calculate(int amountDay, int residencePrice, int breakfastPrice, int lunchPrice, int dinnerPrice, int numberSeater) {
//        int dayPrice = residencePrice + breakfastPrice + lunchPrice + dinnerPrice;
//        int payment = (dayPrice * amountDay) / numberSeater;
//        return payment;

        public List<Integer> calculate(int amountDay, int residencePrice, int breakfastPrice, int lunchPrice, int dinnerPrice, int numberSeater) {
        int dayPrice = residencePrice + breakfastPrice + lunchPrice + dinnerPrice;
        int total = dayPrice * amountDay;
        int payment = total / numberSeater;

        List<Integer> result = new ArrayList<>();
            for (int i = 0; i < numberSeater - 1; i++) {
                result.add(payment);
            }
            result.add(total - payment * (numberSeater -1));
        return result;

    }
}
