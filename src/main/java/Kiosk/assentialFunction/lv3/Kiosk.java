package Kiosk.assentialFunction.lv3;
import java.util.*;

class Kiosk{

    List<MenuItem> menuItems = new ArrayList<>();

    //입력과 반복문 로직 start함수
    public void start(){
        Scanner sc = new Scanner(System.in);

        //Iterator로 List에 저장된 요소를 하나씩 꺼내기
        Iterator<MenuItem> a = menuItems.iterator();
        while (a.hasNext()){   //hasNest()는 다음요소가 존재하는가? true면 next()를 호출
            System.out.println(a.next());
        }
        System.out.println("0. 종료");

        while (true) {
            System.out.print("메뉴를 선택하세요: ");
            try { // 문자가 들어올 시 예외처리
                int selectMenu = sc.nextInt();

                if (selectMenu == 0) {
                    return;
                }
                if (selectMenu > 0 && selectMenu <= menuItems.size()) {
                    System.out.println("선택한 메뉴는: " + menuItems.get(selectMenu - 1));
                } else {
                    System.out.println("없는 메뉴입니다.");
                }
            } catch (InputMismatchException e){
                System.out.println("잘못된 입력입니다.");
                sc.nextLine(); //버퍼에 남아있는 잘못된 입력 제거
            }
        }
    }

    //add 메서드
    public void addItem(MenuItem me){
        menuItems.add(me);
    }
}
