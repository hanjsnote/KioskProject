package Kiosk.assentialFunction.lv3;

import java.util.*;

class MenuItem {
    //필드 인스턴스 변수
    String name;
    double price;
    String comment;

    //생성자
    public MenuItem(String name, double price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    @Override
    public String toString(){
        return String.format("%-15s | %-3.1f | %-30s", name, price, comment);
    }





}
