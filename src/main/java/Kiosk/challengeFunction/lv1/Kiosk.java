package Kiosk.challengeFunction.lv1;

import java.util.*;

class Kiosk {

    private final Menu menu;

    Kiosk(Menu menu){
        this.menu = menu;
    };

    //입력과 반복문 로직 start함수
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. 관리자 메뉴, 2. 사용자 메뉴: ");
            try {
                int userMode = sc.nextInt();
                sc.nextLine();

                if (userMode == 1) {
                    while (true) {
                        System.out.print("관리자 비밀번호를 입력해주세요 (비번: 1111)(또는 뒤로가기 0): ");

                        String pw = sc.nextLine();

                        if (menu.passWord().equals(pw)) {
                            menu.setMenuItems();
                        } else if (pw.equals("0")) {
                            break;
                        } else {
                            System.out.println("비밀번호가 틀렸습니다.");
                        }
                    }

                } else if (userMode == 2) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("1 또는 2만 입력해주세요");
                sc.nextLine();
            }
        }

            while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers\n2. Drinks\n3. Desserts\n0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            List<MenuItem> filtered = new ArrayList<>(); //start 함수에서 사용할 List

            try {
                int selectMenu = sc.nextInt();

                if (selectMenu == 1) {              //사용자 입력값이 1이라면
                    menu.burgers();                 //Menu 클래스의 bergers() 메서드를 호출하여 해당 메뉴 목록을 출력하고
                    filtered = menu.filteredItem("Burgers"); // 메뉴 항목 중 "1. Burgers" 카테고리에 해당하는 항목만 필터링해서 filtered 리스트에 담는다.
                } else if (selectMenu == 2) {
                    menu.drink();
                    filtered = menu.filteredItem("Drinks");
                } else if (selectMenu == 3) {
                    menu.desserts();
                    filtered = menu.filteredItem("Desserts");
                } else if (selectMenu == 0) {
                    return;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
                }
            } catch (InputMismatchException e){
                System.out.println("문자는 입력할 수 없습니다.");
                sc.nextLine();
                continue;
            }

            //상세 메뉴 선택
            while (true) {
                System.out.print("메뉴를 선택하세요: ");
                try {
                    int detailMenu = sc.nextInt();

                    if (detailMenu == 0) {
                        break;    //뒤로 가기
                    }
                    if (detailMenu >= 1 && detailMenu <= filtered.size()) { //입력값이 filtered 리스트의 size() 이내라면
                        System.out.println("선택한 메뉴: " + filtered.get(detailMenu - 1));
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                } catch (InputMismatchException e){
                    System.out.println("문자는 입력할 수 없습니다.");
                    sc.nextLine();
                }
            }
        }
    }
}
