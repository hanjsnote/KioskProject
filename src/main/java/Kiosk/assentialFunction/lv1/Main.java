package Kiosk.assentialFunction.lv1;
import java.util.*;
//Lv 1. 기본적인 키오스크를 프로그래밍해보자
public class Main {
    public static void main(String[] args) {

        String[] shakeShackMenu = {"1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                "2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                "3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                "4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거",
                "0. 종료"};


            //메뉴 출력
        for (int i = 0; i <= shakeShackMenu.length - 1; i++) {
            System.out.println(shakeShackMenu[i]);
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("메뉴를 선택하세요: ");
            int selectMenu = sc.nextInt();
            // 0을 입력하면 종료
            if (selectMenu == 0){
                return;
            }
            //메뉴 선택 출력
            if (selectMenu > 0 && selectMenu <= shakeShackMenu.length) {
                System.out.println("선택한 메뉴는: " + shakeShackMenu[selectMenu - 1]);
            } else {
                System.out.println("없는 메뉴입니다.");
            }
        }











    }
}
