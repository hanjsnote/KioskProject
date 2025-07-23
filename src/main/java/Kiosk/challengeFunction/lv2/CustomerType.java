package Kiosk.challengeFunction.lv2;

public class CustomerType {
//ENUM!
    enum Customer{
        NATIONAL(0.1), SOLDIER(0.05), STUDENT(0.03), PERSON(0);

    private final double doubleChange;

    Customer(double doubleChange) {
        this.doubleChange = doubleChange;
    }

    public double getDoubleChange(){
        return doubleChange;
    }
}
//    public double discountAmount (int customersInput, double totalPrice){
//        if(customersInput == 1){
////            return totalPrice - (g * totalPrice);
//        }
//    }


}
