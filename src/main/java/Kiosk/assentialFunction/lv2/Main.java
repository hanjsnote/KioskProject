package Kiosk.assentialFunction.lv2;

import java.util.*;

//Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
public class Main {
    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem();
        menuItem.addItem("1. ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItem.addItem("2. SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menuItem.addItem("3. Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menuItem.addItem("4. Hamberger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        Scanner sc = new Scanner(System.in);

        //Iterator로 List에 저장된 요소를 하나씩 꺼내기
        Iterator<MenuItem> a = menuItem.menuItems.iterator();
        while (a.hasNext()){   //hasNest()는 다음요소가 존재하는가? true면 next()를 호출
            System.out.println(a.next());
        }
        System.out.println("0. 종료");

        while (true) {
            System.out.print("메뉴를 선택하세요: ");
            try{ // 문자가 들어올 시 예외처리
                int selectMenu = sc.nextInt();

                if(selectMenu == 0){
                    return;
                }
                if (selectMenu > 0 && selectMenu <= menuItem.menuItems.size()) {
                    System.out.println("선택한 메뉴는: " + menuItem.menuItems.get(selectMenu - 1));
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
