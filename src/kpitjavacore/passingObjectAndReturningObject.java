package kpitjavacore;

public class passingObjectAndReturningObject {
    public static void main(String[] args){
        PineApple pap = new PineApple();
        pap.setCost(90);
        pap.setQuantity(2);

        Sugar sag = new Sugar();
        sag.setCost(60);
        sag.setType("organic");
        sag.setQuantity(1000);

        JuiceStall js = new JuiceStall();
//        PineJuice pj =
    }
}

class Juice{
}
class PineJuice extends Juice{
    int glass;
    int price;

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public int getPrice() {
        return price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class JuiceStall{
    PineJuice makeAJuice(PineApple x,Sugar y){
        System.out.println("making a pine apple juice....");
        PineJuice ji = new PineJuice();//blank
        return ji;

    }
}

class PineApple{
    int cost;
    int quantity;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Sugar{
    String type;
    int cost;
    int quantity;
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}