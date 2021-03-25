public class ColaVendingMachine {
    int bottle = 12; 
    double cost=1.2;

    public int getBottle(){
        return bottle;
    }
    public void setBottle(int bottle){
        this.bottle=bottle;
    }

    void sellBottle(int numSold){
        int remainBottle=this.bottle-numSold;
        setBottle(remainBottle);
    }

    void restock(int numRestock){
        int newStock =this.bottle+numRestock;
        setBottle(newStock);
    }

    public static void main(String[] args) {
        ColaVendingMachine cola = new ColaVendingMachine();
        System.out.println("The orginial number of bottles: "+cola.getBottle());
        
        cola.sellBottle(6);
        System.out.println("After selling 6 bottles, the remaining bottles: "+cola.getBottle());
        cola.restock(4);
        System.out.println("New Stock: "+cola.getBottle());
    }
}
