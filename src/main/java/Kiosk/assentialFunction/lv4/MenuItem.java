package Kiosk.assentialFunction.lv4;

class MenuItem {
    //필드 인스턴스 변수
    String category;
    String name;
    double price;
    String comment;

    //생성자
    public MenuItem(String category, String name, double price, String comment){
        this.category = category;
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    @Override
    public String toString(){
        return String.format("%-12s | W %-3.1f | %-50s", name, price, comment);
    }

}
