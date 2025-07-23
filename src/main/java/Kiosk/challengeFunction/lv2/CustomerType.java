package Kiosk.challengeFunction.lv2;

public class CustomerType {
            //ENUM!
    enum Customer{
        NATIONAL(0.1), SOLDIER(0.05), STUDENT(0.03), PERSON(0);

        final double customer;  //NATIONAL, SOLDIER... 상수를 double 타입으로 변환

        Customer(double customer) {
            this.customer = customer;
        }
    }

    double discountAmount = 0;
    public void discount (int customersInput, double totalPrice) {

        if(customersInput >= 1 && customersInput <= 4){ //values()[]는 enum 값을 배열로 리턴
            discountAmount = totalPrice - (totalPrice * Customer.values()[customersInput - 1].customer);
        }
    }
}
