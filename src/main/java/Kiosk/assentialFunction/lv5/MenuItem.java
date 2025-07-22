package Kiosk.assentialFunction.lv5;

class MenuItem {
    //필드 인스턴스 변수
    private String category;
    private String name;
    private double price;
    private String comment;

    //생성자
    public MenuItem(){};
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
    void setCategory(String Category){
        this.category = category;
    }
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
        return String.format("%-8s | %-15s | %-3.1f | %-50s", category, name, price, comment);
    }

}
