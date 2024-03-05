package gb.intermediate.view;

import gb.intermediate.model.Basket;

public class CountFruits implements Calculate<Basket> {

    @Override
    public void calculate(Basket basket) {
        System.out.printf("Всего фруктов - %s", basket.getBasketSize());
    }
}
