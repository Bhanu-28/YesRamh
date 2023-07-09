package kpitjavacore;
class GiftCard{
    int id;
    String passwd;
    GiftCard(){

    }
    public GiftCard(int id,String passwd){
        this.id = id;
        this.passwd = passwd;
    }
    void claim(){
        if(id<0){
            System.out.println("gift card invlaid");
        }
        else{
            System.out.println("Gift card claimed ");
        }

    }
}

public class InheritanceSingleMulti {

    public static void main(String[] args) {

        Restaurent res = new Restaurent(249,"Biryani", (byte) 1);
        res.showBill();
        Swiggy swiggy = new Swiggy(220,"Boneless",(byte) 1,218242,'M',"Bhanu Pradeep","Pune");
        swiggy.showOrderSlip();
        Customer cus = new Customer(290,"biryani",(byte)1,4254,'M',"Bhanu","pg phase1","swiggy",330,10);
        cus.invoiceSlip();
    Restaurent customer90 = new Restaurent(20,"1234");

    customer90.giftcard.claim();

    }
}

class Restaurent{

    private int price;
     private String dish;
     private int quantity;

     GiftCard giftcard;
Restaurent(int id,String passwd){
    giftcard = new GiftCard(id, passwd);

}
    public Restaurent(int price,String dish,byte quantity){
        super();
        this.price = price;
        this.dish = dish;
        this.quantity= quantity;
        giftcard = new GiftCard();
//        giftcard = new GiftCard(5,"1234");

    }
    void showBill(){
        System.out.println("price is :"+price);
        System.out.println("dish is :"+dish);
        System.out.println("quantity is :"+quantity);

    }


}

class Swiggy extends Restaurent{
    int orderId;
    char gender;
    String customerName;
    String dropDownPoint;

    public Swiggy(int price, String dish, byte quantity, int orderId,char gender,String customerName,
                  String dropDownPoint) {
        super(price, dish, quantity);
        this.orderId = orderId;
        this.gender = gender;
        this.customerName = customerName;
        this.dropDownPoint = dropDownPoint;
    }
    void showOrderSlip(){
        super.showBill();
        System.out.println("orderId :"+orderId);
        System.out.println("gender :"+gender);
        System.out.println("customerName :"+customerName);
        System.out.println("dropdownpoint :"+dropDownPoint);
    }

}

class Customer extends Swiggy{
    String platform;
    int  FarewithTax;
    int Tip;

    public Customer(int price, String dish, byte quantity, int orderId, char gender, String customerName, String dropDownPoint, String platform, int FarewithTax, int Tip) {
        super(price, dish, quantity, orderId, gender, customerName, dropDownPoint);
        this.platform = platform;
        this.FarewithTax = FarewithTax;
        this.Tip = Tip;
    }
    void invoiceSlip(){
        super.showOrderSlip();
        System.out.println("platform is :"+platform);
        System.out.println("Fare with tax is :"+FarewithTax);
        System.out.println("Tip contributed is :"+Tip);
    }
}
