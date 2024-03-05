package gb.intermediate;

import gb.intermediate.model.Basket;
import gb.intermediate.model.FruitsBasket;
import gb.intermediate.model.Fruits;
import gb.intermediate.view.Calculate;
import gb.intermediate.view.CalculateLongestFruitName;
import gb.intermediate.view.LoadFruitsFromFile;

public class Main {
    public static void main(String[] args) {
        Fruits apple = Fruits.getFruitInstance("Red apple");
        Basket<Fruits> basket = new FruitsBasket(new LoadFruitsFromFile("input.txt").getRawFruits());
        for (Fruits fruit: basket){
            System.out.printf("%s  - %s шт.%n",fruit.getName(), basket.getPlantAmount(fruit));

        }
        Calculate<Basket> longest = new CalculateLongestFruitName();
        longest.calculate(basket);

    }
}