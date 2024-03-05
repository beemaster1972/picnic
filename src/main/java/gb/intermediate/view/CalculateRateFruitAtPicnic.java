package gb.intermediate.view;

import java.util.Collections;
import java.util.Comparator;

import gb.intermediate.model.Basket;
import gb.intermediate.model.Fruits;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.*;

public class CalculateRateFruitAtPicnic implements Calculate<Basket> {
    private static boolean ascending = false;

    @Override
    public void calculate(Basket basket) {
        Map<Fruits, Integer> sorted;
        if (!ascending) {
           sorted = basket.getBasket()
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue,
                                    (e1, e2) -> e2, LinkedHashMap::new));
        }
        System.out.println(sorted);

    }
}
