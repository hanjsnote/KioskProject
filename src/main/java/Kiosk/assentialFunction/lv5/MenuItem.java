package Kiosk.assentialFunction.lv5;

class MenuItem {
    //필드 인스턴스 변수
    private final String category;
    private final String name;
    private final double price;
    private final String comment;

    //생성자
    public MenuItem(String category, String name, double price, String comment){
        this.category = category;
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    //Getter
    String getCategory(){
        return category;
    }
    String getName(){
        return name;
    }
    Double getPrice(){
        return price;
    }
    String getComment(){
        return comment;
    }

    //Setter

    @Override
    public String toString(){
        return String.format("%-12s | %-3.1f | %-50s", name, price, comment);
    }

}
