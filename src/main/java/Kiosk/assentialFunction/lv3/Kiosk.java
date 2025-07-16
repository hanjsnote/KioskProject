package Kiosk.assentialFunction.lv3;
import java.util.*;

public class Kiosk extends MenuItem{

    List<MenuItem> menuItems = new ArrayList<>();

    public void start(){

    }


    //add 메서드
    public void addItem(String name, double price, String comment){
        MenuItem Items = new MenuItem(name, price, comment);
        menuItems.add(Items);
    }


}
