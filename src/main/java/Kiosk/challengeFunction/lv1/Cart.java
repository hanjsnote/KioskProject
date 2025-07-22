package Kiosk.challengeFunction.lv1;
import java.util.*;

public class Cart {

    //장바구니 리스트
    private final List<MenuItem> cart = new ArrayList<>();

    List<MenuItem> getCart(){
        return cart;
    }

    void addCart(MenuItem menuItem){
        cart.add(menuItem);
    }





}
