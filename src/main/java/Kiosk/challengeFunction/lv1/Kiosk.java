package Kiosk.challengeFunction.lv1;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

class Kiosk {

    private final Menu menu;
    Cart cart = new Cart();

    Kiosk(Menu menu){
        this.menu = menu;
    };

    List<MenuItem> filtered = new ArrayList<>(); //start 함수에서 사용할 List

    //입력과 반복문 로직 start함수
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. 관리자 메뉴, 2. 사용자 메뉴: ");
            try {
                int userMode = sc.nextInt();
                sc.nextLine();

                if (userMode == 1) {    //관리자 메뉴
                    while (true) {
                        System.out.print("관리자 비밀번호를 입력해주세요 (비번: 1111)(또는 뒤로가기 0): ");

                        String pw = sc.nextLine();

                        if (menu.passWord().equals(pw)) { //passWord 메서드에 정의된 비밀번호가 입력값과 같으면
                            menu.setMenuItems();          //수정기능 메서드 호출
                        } else if (pw.equals("0")) {      //뒤로 가기
                            break;
                        } else {
                            System.out.println("비밀번호가 틀렸습니다.");
                        }
                    }

                } else if (userMode == 2) { //사용자 메뉴로 넘어감
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("1 또는 2만 입력해주세요");
                sc.nextLine();
            }
        }

        //사용자 메뉴
        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers\n2. Drinks\n3. Desserts\n0. 종료");

            //주문기능 장바구니(cart)가 비어있지 않다면
            if(!cart.getCart().isEmpty()) {
                System.out.println("[ ORDER MENU ]\n4. Orders\n5. Cancel "); //주문 기능 출력
                System.out.print("메뉴를 선택하세요: ");
            }

            try {   //문자가 들어오면 예외 처리
                int selectMenu = sc.nextInt();

                if(selectMenu == 0){
                    return; //종료
                }

                if (selectMenu == 1) {              //사용자 입력값이 1이라면
                    menu.burgers();                 //Menu 클래스의 bergers() 메서드를 호출하여 해당 메뉴 목록을 출력하고
                    filtered = menu.filteredItem("Burgers"); // 메뉴 항목 중 "1. Burgers" 카테고리에 해당하는 항목만 필터링해서 filtered 리스트에 담는다.

                } else if (selectMenu == 2) {
                    menu.drink();
                    filtered = menu.filteredItem("Drinks");

                } else if (selectMenu == 3) {
                    menu.desserts();
                    filtered = menu.filteredItem("Desserts");

                } else if (selectMenu == 4 && !cart.getCart().isEmpty()){ //주문을 누를때 장바구니가 비어있지 않다면
                    System.out.println("아래와 같이 주문하시겠습니까?");
                    System.out.println("[ Orders ]");

                    double totalPrice = 0;
                    for(MenuItem cartItem : cart.getCart()){
                        System.out.println(cartItem);           //장바구니의 목록을 보여주고
                        totalPrice += cartItem.getPrice();      //장바구니에 담긴 메뉴의 가격을 합산
                    }
                    System.out.println("[ Total ]\nW " + totalPrice + "\n1. 주문\t\t2. 메뉴판");

                    int orderOrMenu = sc.nextInt();
                    if(orderOrMenu == 1){
                        System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + "입니다.");
                        cart.removeCart();
                        continue;
                    } else if (orderOrMenu == 2){
                        continue;

                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                } else if (selectMenu == 5 && !cart.getCart().isEmpty()){ //장바구니 비우기
                    System.out.println("장바구니를 비우시겠습니까? (y/n): ");
                    char cleanCart = sc.next().charAt(0);

                    if(cleanCart == 'y'){ //y 를 누르면 장바구니 비우기
                        cart.removeCart();
                    } else if (cleanCart == 'n'){
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                } else if (selectMenu == 4 || selectMenu == 5 && cart.getCart().isEmpty()){
                    System.out.println("아따 장바구니가 비었당께롱");
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            } catch (InputMismatchException e){
                System.out.println("문자는 입력할 수 없습니다.");
                sc.nextLine();
                continue;
            }

            //상세 메뉴 선택
            System.out.print("메뉴를 선택하세요: ");
            try {
                int detailMenu = sc.nextInt();

                if (detailMenu == 0) {
                    continue;    //뒤로 가기
                }
                if (detailMenu >= 1 && detailMenu <= filtered.size()) { //입력값이 filtered 리스트의 size() 이내라면
                    System.out.println("\n선택한 메뉴: " + filtered.get(detailMenu - 1));

                    //장바구니 추가
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인 \t\t 2. 취소");
                    int inputCart = sc.nextInt();

                    if(inputCart == 2){ //취소
                        continue;
                    }

                    if(inputCart == 1) { //1. 확인하면 cart 리스트(장바구니)에 추가
                        cart.addCart(filtered.get(detailMenu - 1));
                        System.out.println(filtered.get(detailMenu - 1).getName() + " 이 장바구니에 추가되었습니다.");
                    }

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
