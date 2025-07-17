package Kiosk.assentialFunction.lv4;

import java.util.*;

class Menu {

    List<MenuItem> menuItems = new ArrayList<>();

    //List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    void printMenu() {
        Iterator<MenuItem> menu = menuItems.iterator();
        while (menu.hasNext()) {   //hasNest()는 다음요소가 존재하는가? true면 next()를 호출
            System.out.println(menu.next());
        }
        System.out.println("0. 종료");
    }

    //add 메서드
    public void addItem(MenuItem me){
        menuItems.add(me);
    }
}
