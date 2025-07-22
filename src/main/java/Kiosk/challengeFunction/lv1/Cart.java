package Kiosk.challengeFunction.lv1;
import java.util.*;

public class Cart {

    //장바구니 리스트
    private final List<MenuItem> cart = new ArrayList<>();

    List<MenuItem> getCart(){
        return cart;
    }

    void addCart(MenuItem menuItem){  //장바구니에 메뉴 담기
        cart.add(menuItem);
    }

    void removeCart(){  //장바구니 비우기
        cart.clear();
    }





}
