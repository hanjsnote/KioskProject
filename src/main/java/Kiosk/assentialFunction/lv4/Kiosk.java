package Kiosk.assentialFunction.lv4;
import java.util.*;

class Kiosk {

    Menu menu;

    Kiosk(Menu menu){
        this.menu = menu;
    };

    //Main메뉴에서 사용자 입력에 따라 카테고리별로 새로운 List에 담을 메서드
    List<MenuItem> filteredItem(String category) {
        List<MenuItem> filterList = new ArrayList<>();

        for (MenuItem item : menu.menuItems) {
            if (item.category.equals(category)) {
                filterList.add(item);
            }
        }
        return filterList;
    }

    //입력과 반복문 로직 start함수
    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers\n2. Drinks\n3. Desserts\n0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            List<MenuItem> filtered = new ArrayList<>(); //start 함수에서 사용할 List

            try {
                int selectMenu = sc.nextInt();

                if (selectMenu == 1) {              //사용자 입력값이 1이라면
                    menu.burgers();                 //Menu 클래스의 bergers() 메서드를 호출하여 해당 메뉴 목록을 출력하고
                    filtered = filteredItem("1. Burgers"); // 메뉴 항목 중 "1. Burgers" 카테고리에 해당하는 항목만 필터링해서 filtered 리스트에 담는다.
                } else if (selectMenu == 2) {
                    menu.drink();
                    filtered = filteredItem("2. Drinks");
                } else if (selectMenu == 3) {
                    menu.desserts();
                    filtered = filteredItem("3. Desserts");
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
