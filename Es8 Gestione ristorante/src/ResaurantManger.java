import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ResaurantManger {

    private HashSet<MenuItem> menu = new HashSet<>();
    private HashMap<String, MenuItem> order = new HashMap<>();
    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void printMenu() {
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }
    public void orderRegister(String name,MenuItem menuItem){
        order.put(name, menuItem);
    }


    public void printOrder(){
        order.forEach((k,v)->{
            System.out.println(k.toString()+" "+v.getClass().getName());
        });
    }

}
