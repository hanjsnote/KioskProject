package Kiosk.assentialFunction.lv4;

import java.util.*;

//Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.addItem(new MenuItem("1. Burgers","1. ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.addItem(new MenuItem("1. Burgers","2. SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.addItem(new MenuItem("1. Burgers","3. Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.addItem(new MenuItem("1. Burgers","4. Hamberger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menu.addItem(new MenuItem("2. Drinks","1. Cola", 2.4, "마시자 콜라, 상쾌한 이순간, 오직 그것뿐, 이 맛 이 느낌!"));
        menu.addItem(new MenuItem("2. Drinks","2. Zero-cola", 2.2, "제로로 제로하자! 마음은 와일드하게, 몸은 멋지게"));
        menu.addItem(new MenuItem("2. Drinks","3. Sprite", 2.3, "갈증에 따르라"));
        menu.addItem(new MenuItem("3. Desserts","1. Cake", 9.0, "특별한 날, 특별한 케이크와 함께."));
        menu.addItem(new MenuItem("3. Desserts","2. Macaroon", 3.8, "알록달록한 색감, 쫀득한 식감, 달콤한 맛, 그리고 프랑스 디저트"));
        menu.addItem(new MenuItem("3. Desserts","3. IceCream", 2.8, "오늘, 당신의 하루에 시원함과 달콤함을 더하세요"));

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();

    }
}
