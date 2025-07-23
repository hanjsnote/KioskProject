package Kiosk.challengeFunction.lv2;
import java.util.*;

public class Cart {

    //장바구니 리스트
    private final List<MenuItem> cart = new ArrayList<>();

    List<MenuItem> getCart() {
        return cart;
    }

    void addCart(MenuItem menuItem) {  //장바구니에 메뉴 담기
        cart.add(menuItem);
    }

    void removeCart() {  //장바구니 비우기
        cart.clear();
    }

    void nullCart() {
        throw new NullCartException("장바구니가 비어있습니다.");
    }

    //장바구니가 비었을시 4, 5를 입력하면 RuntimeException 발생
    static class NullCartException extends RuntimeException {
        NullCartException(String message) {
            super(message);
        }
    }
}