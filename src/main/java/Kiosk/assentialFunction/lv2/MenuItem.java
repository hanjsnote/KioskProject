package Kiosk.assentialFunction.lv2;

import java.util.*;

class MenuItem {
    //필드 인스턴스 변수
    String name;
    double price;
    String comment;


    //리스트 생성
    List<MenuItem> menuItems = new ArrayList<>();

    //생성자
    public MenuItem() {}
    public MenuItem(String name, double price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }



    @Override
    public String toString(){
        return String.format("%-15s | %-3.1f | %-30s", name, price, comment);
    }

    //add 메서드
    public void addItem(String name, double price, String comment){
        MenuItem Items = new MenuItem(name, price, comment);
        menuItems.add(Items);
    }
}
