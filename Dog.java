public class Dog {
    int size;

    Dog(int s){
        this.size=s;
    }

    void bark(){
        if ((this.size<=5) && (this.size>0)){
            System.out.println("Yip! Yip!");
        }else if ((this.size<=10)&&(this.size>5)){
            System.out.println("Ruff! Ruff!");
        }else if (this.size>10){
            System.out.println("Woof! Woof!");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog(4);
        dog.bark();
    }
}
