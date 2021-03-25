import java.util.Scanner;

public class Digits {
    int number;

    Digits(int n){
        this.number=n;
    }
    void showNumber(){
        System.out.println(this.number/10%10+"    "+this.number%10);
    }
    static public void main (String args[]){
        Digits digits = new Digits(12345);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");

        digits.number=scanner.nextInt();
        digits.showNumber();
    }
}