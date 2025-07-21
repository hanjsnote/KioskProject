package Kiosk.assentialFunction.lv5;

import java.util.*;

class Menu {

    String strFormat = "%-15s | %-3.1f | %-50s%n"; //간격 포맷
    List<MenuItem> menuItems = new ArrayList<>();

    //List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    // 1.Burgers 메뉴 선택시 해당 목록만 출력
    void burgers() {
        System.out.println("[ BURGERS MENU ]");
        for (MenuItem berger : menuItems) {
            if (berger.category.equals("1. Burgers")){
                System.out.printf(strFormat, berger.name, berger.price, berger.comment);
            }
        }
        System.out.println("0. 뒤로가기");
    }
    // 2.Drink 메뉴 선택시 해당 목록만 출력
    void drink(){
        System.out.println("[ DRINK MENU ]");
        for (MenuItem drink : menuItems){
            if (drink.category.equals("2. Drinks")){
                System.out.printf(strFormat, drink.name, drink.price, drink.comment);
            }
        }
        System.out.println("0. 뒤로가기");
    }
    // 3.Desserts 메뉴 선택시 해당 목록만 출력
    void desserts(){
        System.out.println("[ DESSERTS MENU ]");
        for (MenuItem desserts : menuItems){
            if (desserts.category.equals("3. Desserts")){
                System.out.printf(strFormat, desserts.name, desserts.price, desserts.comment);
            }
        }
        System.out.println("0. 뒤로가기");
    }
    //add 메서드
    public void addItem(MenuItem me){
        menuItems.add(me);
    }

}
