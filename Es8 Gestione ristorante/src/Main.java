import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ResaurantManger r = new ResaurantManger();
        ArrayList<String> topping = new ArrayList<>();
        topping.add("Pepsi");
        topping.add("coca-cola");
        topping.add("Monster");
        Pizza pizza = new Pizza("Diavolo", 10, topping);
        r.addMenuItem(pizza);
        Pasta pasta = new Pasta("pasta al ragu", 10, true);
        r.addMenuItem(pasta);
        Dessert dessert = new Dessert("Tiramisu",10, true);
        r.addMenuItem(dessert);
        r.printMenu();
        r.orderRegister("Marco", pizza);
        r.orderRegister("lucas", pasta);
        r.orderRegister("Pepsi", dessert);
        r.printOrder();
    }
}