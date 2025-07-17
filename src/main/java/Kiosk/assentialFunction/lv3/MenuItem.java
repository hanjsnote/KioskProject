package Kiosk.assentialFunction.lv3;

import java.util.*;

class MenuItem {
    //필드 인스턴스 변수
    String name;
    double price;
    String comment;

    @Override
    public String toString(){
        return String.format("%-15s | %-3.1f | %-30s", name, price, comment);
    }





}
