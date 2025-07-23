package Kiosk.challengeFunction.lv1;

import java.util.*;

class Menu {

    String strFormat = "%-15s | W %-3.1f | %-50s%n"; //간격 포맷
    private final List<MenuItem> menuItems = new ArrayList<>();

    //Getter
    List<MenuItem> getMenuItems(){
        return menuItems;
    }

    Scanner sc = new Scanner(System.in);


    //List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    // 1.Burgers 메뉴 선택시 해당 목록만 출력
    void burgers() {
        System.out.println("[ BURGERS MENU ]");

        for (MenuItem berger : menuItems) {
            if (berger.getCategory().equals("Burgers")){
                System.out.printf(strFormat, berger.getName(), berger.getPrice(), berger.getComment());
            }
        }
        System.out.println("0. 뒤로가기");
    }

    // 2.Drink 메뉴 선택시 해당 목록만 출력
    void drink(){
        System.out.println("[ DRINK MENU ]");

        for (MenuItem drink : menuItems){
            if (drink.getCategory().equals("Drinks")){
                System.out.printf(strFormat, drink.getName(), drink.getPrice(), drink.getComment());
            }
        }
        System.out.println("0. 뒤로가기");
    }

    // 3.Desserts 메뉴 선택시 해당 목록만 출력
    void desserts(){
        System.out.println("[ DESSERTS MENU ]");

        for (MenuItem desserts : menuItems){
            if (desserts.getCategory().equals("Desserts")){
                System.out.printf(strFormat, desserts.getName(), desserts.getPrice(), desserts.getComment());
            }
        }
        System.out.println("0. 뒤로가기");
    }

    //add 메서드
    public void addItem(MenuItem me){
        menuItems.add(me);
    }

    //삭제 메서드
    public void removeItem(int modifyIndex){
        menuItems.remove(modifyIndex - 1);
        System.out.println("삭제되었습니다.");
    }

    //Main 메뉴에서 사용자 입력에 따라 카테고리별로 새로운 List에 담을 메서드
    List<MenuItem> filteredItem(String category) {
        List<MenuItem> filterList = new ArrayList<>();

        for (MenuItem item : getMenuItems()) {
            if (item.getCategory().equals(category)) {
                filterList.add(item);
            }
        }
        return filterList;
    }
}
