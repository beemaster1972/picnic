package gb.intermediate.view;

import gb.intermediate.model.FruitsBasket;

public class CountFruits implements Calculate<FruitsBasket> {

    @Override
    public void calculate(FruitsBasket basket) {
        System.out.printf("Всего фруктов - %s", basket.getBasketSize());
    }
}
