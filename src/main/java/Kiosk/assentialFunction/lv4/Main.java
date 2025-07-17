package Kiosk.assentialFunction.lv4;

//Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addItem(new MenuItem("1. ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.addItem(new MenuItem("2. SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.addItem(new MenuItem("3. Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.addItem(new MenuItem("4. Hamberger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        menu.printMenu();

        Kiosk kiosk = new Kiosk();
        kiosk.start();







    }
}
