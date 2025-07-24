package Kiosk.challengeFunction.lv2;

class MenuItem {
    //필드 인스턴스 변수
    private final String category; //메뉴 각각의 카테고리
    private String name;           //메뉴 이름
    private double price;          //메뉴 가격
    private String comment;        //메뉴 설명

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
    void setName(String name){
        this.name = name;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setComment(String comment){
        this.comment = comment;
    }

    @Override
    public String toString(){
        return String.format("%-8s | %-15s | W %-3.1f | %-50s", category, name, price, comment);
    }

}
