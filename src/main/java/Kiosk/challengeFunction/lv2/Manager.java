package Kiosk.challengeFunction.lv2;
import java.util.Scanner;

//메뉴 수정, 삭제, 추가 기능을 수행하는 관리자 클래스
public class Manager {

    Menu menu;

    Manager(Menu menu){     //Main에서 생성한 menu를 공유해서 사용
        this.menu = menu;
    }

    Scanner sc = new Scanner(System.in);

    //메뉴 추가 기능
    void setMenuItems(){
        while (true) {
            System.out.println("번호  | Category |       Name      | Price |            Comment");
            for(int i = 0; i < menu.getMenuItems().size(); i++){  //현재 menuItems 리스트의 목록을 보여줌
                MenuItem menuList = menu.getMenuItems().get(i);
                System.out.println("번호 " + (i + 1) + "| " + menuList);
            }

            System.out.print("메뉴를 추가하시겠습니까? 또는 수정하시겠습니까?(추가 y, 수정 m, 뒤로가기 0): ");
            char addCh = sc.next().charAt(0);

            if(addCh == '0'){   //뒤로 가기
                break;
            }

            if(addCh == 'y'){   //메뉴 추가 기능
                sc.nextLine(); //버퍼 제거

                System.out.print("category를 설정해주세요 예) Burgers, Drinks, Desserts: ");
                String categoryInput = sc.nextLine();

                System.out.print("name을 입력해주세요 예) 5. EggBurger: ");
                String nameInput = sc.nextLine();

                System.out.print("price를 입력해주세요 예) 6.2: ");
                double priceInput = sc.nextDouble();
                sc.nextLine();

                System.out.print("comment를 입력해주세요 예) 맛있는 에그 버거: ");
                String commentInput = sc.nextLine();

                //MenuItem 객체 생성후 addItem 호출하여 리스트에 메뉴 추가
                MenuItem newItem = new MenuItem(categoryInput, nameInput, priceInput, commentInput);
                menu.addItem(newItem);
                System.out.println("메뉴가 추가되었습니다.");

            } else if (addCh == 'm'){ // 메뉴 수정 기능

                System.out.print("수정할 번호를 선택하세요 또는 뒤로 가려면 0 입력: ");
                int modifyMenuNum = sc.nextInt();

                if(modifyMenuNum == 0){ //뒤로가기
                    break;
                }

                //Setter
                if (modifyMenuNum >= 1 && modifyMenuNum <= menu.getMenuItems().size()) { //입력값이 리스트 인덱스의 유효 범위인지 확인
                    MenuItem selectedItem = menu.getMenuItems().get(modifyMenuNum - 1);

                    System.out.print("선택하신 메뉴는: " + selectedItem + "입니다 수정하시겠습니까? (y/n) 또는 삭제는 x: ");
                    char ch = sc.next().charAt(0);

                    if (ch == 'y') {
                        sc.nextLine();

                        //name 수정
                        System.out.print(selectedItem.getName() + "의 name을 재설정 해주세요(예: 2. SmokeShack -> 2. EggBurger): ");
                        String modifyName = sc.nextLine();
                        selectedItem.setName(modifyName);

                        //price 수정
                        System.out.print("price를 재설정 해주세요 현재 price: " + selectedItem.getPrice() + " : ");
                        double modifyPrice = sc.nextDouble();
                        selectedItem.setPrice(modifyPrice);

                        sc.nextLine();

                        //comment 수정
                        System.out.print("comment를 재설정 해주세요 현재 comment: " + selectedItem.getComment() + " : ");
                        String modifyComment = sc.nextLine();
                        selectedItem.setComment(modifyComment);

                        System.out.println("수정 완료!");

                    } else if (ch == 'n') { //'n' 입력시 뒤로가기
                        break;
                    } else if (ch == 'x') { //'x' 입력시 해당 아이템 삭제
                        menu.removeItem(modifyMenuNum);
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                } else {
                    System.out.println("잘못된 번호입니다.");
                }
            }
        }
    }

    //눈가림용 암호화..
    private String passWord (){
        StringBuilder sb = new StringBuilder();
        int[] code = {49, 49, 49, 49};
        for(int c : code){
            sb.append((char)c);
        }
        return sb.toString();
    }

    String getPassWord (){
        return passWord();
    }

}
