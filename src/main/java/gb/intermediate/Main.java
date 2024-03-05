package gb.intermediate;

import gb.intermediate.model.Basket;
import gb.intermediate.model.FruitsBasket;
import gb.intermediate.model.Fruits;
import gb.intermediate.view.*;

public class Main {
    public static void main(String[] args) {
        Fruits apple = Fruits.getFruitInstance("Red apple");
        Basket<Fruits> basket = new FruitsBasket(new LoadFruitsFromFile("input.txt").getRawFruits());
        if (basket.getBasketSize()==0){
            System.err.println("Корзина пуста!!!");
            return;
        }
        for (Fruits fruit: basket){
            System.out.printf("%s  - %s шт.%n",fruit.getName(), basket.getPlantAmount(fruit));

        }
        Calculate<Basket> calc = new CalculateLongestFruitName();
        calc.calculate(basket);
        calc = new CountFruits();
        calc.calculate(basket);
        calc = new CalculateRateFruitAtPicnic();
        calc.calculate(basket);

    }
}