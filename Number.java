import java.util.Scanner;

public class Number {
    int x;
    int y;
    int z;

    Number(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void showResult(){
        System.out.println("Sum: " +Integer.sum(x, Integer.sum(y, z)));
        System.out.println("Product: " + x*(y*z));
        System.out.println("Average: "+Integer.sum(x, Integer.sum(y, z))/3);
        System.out.println("Maximum: "+Math.max(x, Math.max(y, z)));
        System.out.println("Minimum: "+Math.min(x, Math.min(y, z)));
    }

    static public void main (String args[]){
        Number number = new Number(1,2,3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        number.x=scanner.nextInt();
        number.y=scanner.nextInt();
        number.z=scanner.nextInt();

        number.showResult();

    }
}
