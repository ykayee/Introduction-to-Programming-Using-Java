public class Invoice {
    String number;
    String description;
    int quantityPurchased;
    double price;

    Invoice(String n, String d, int q, double p){
        this.number=n;
        this.description=d;
        this.quantityPurchased=Math.max(0, q);
        this.price=Math.max(0, p);
    }

    void getInoviceAmount(){
        System.out.println("Amount: "+ this.price * this.quantityPurchased);
    }

    public static void main(String[] args) {
        Invoice test1=new Invoice("A123", "test1", 10, 2);
        Invoice test2=new Invoice("B234", "test2", 2, -2);

        test1.getInoviceAmount();
        test2.getInoviceAmount();
    }        
}

