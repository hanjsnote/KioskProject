package Kiosk.assentialFunction.lv4;
import java.util.*;

class Kiosk {

    Menu menu;

    Kiosk(Menu menu){
        this.menu = menu;
    };

    //입력과 반복문 로직 start함수
    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers\n2. Drinks\n3. Desserts\n0. 종료");
            System.out.print("메뉴를 선택하세요: ");
            try { // 문자가 들어올 시 예외처리
                int selectMenu = sc.nextInt();
                if (selectMenu == 0) {  //메인 메뉴에서 종료
                    return;
                }
                if (selectMenu >= 1 && selectMenu <= 3) {
                    switch (selectMenu) {
                        case 1:
                            menu.burgers();
                            break;
                        case 2:
                            menu.drink();
                            break;
                        case 3:
                            menu.desserts();
                            break;
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요.");
                sc.nextLine(); //잘못된 입력 버퍼 제거
                continue;
            }

            while (true) {  //상세 메뉴
                System.out.print("메뉴를 선택하세요: ");
                try {
                int detailMenu = sc.nextInt();
                    if (detailMenu == 0) {  //상세 메뉴에서 메인 메뉴로 뒤로가기
                        break;
                    }
                    if (detailMenu > 0 && detailMenu <= menu.menuItems.size()) {
                        System.out.println("선택한 메뉴는: " + menu.menuItems.get(detailMenu - 1));
                    } else {
                        System.out.println("없는 메뉴입니다.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력해주세요.");
                    sc.nextLine();
                }
            }
        }
    }
}
