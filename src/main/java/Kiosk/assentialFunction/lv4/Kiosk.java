package Kiosk.assentialFunction.lv4;
import java.util.*;

class Kiosk {

    Menu menus;

    Kiosk(Menu menus){
        this.menus = menus;
    };

    //입력과 반복문 로직 start함수
    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::::::::::List의 Size(): " + menus.menuItems.size());
        while (true) {
            System.out.print("메뉴를 선택하세요: ");
            try { // 문자가 들어올 시 예외처리
                int selectMenu = sc.nextInt();

                if (selectMenu == 0) {
                    return;
                }
                if (selectMenu > 0 && selectMenu <= menus.menuItems.size()) {
                    System.out.println("선택한 메뉴는: " + menus.menuItems.get(selectMenu - 1));
                } else {
                    System.out.println("없는 메뉴입니다.");
                }
            } catch (InputMismatchException e){
                System.out.println("잘못된 입력입니다.");
                sc.nextLine(); //버퍼에 남아있는 잘못된 입력 제거
            }
        }
    }
}
