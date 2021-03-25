public class Giraffe {
    int height;
    int age;
    String name;

    Giraffe(int h, int a, String n){
        this.height=h;
        this.age=a;
        this.name=n;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    void walk(int step){
        System.out.println("Giraffe is walking " + step +" steps.");
    }
    public static void main(String[] args) {
        Giraffe g = new Giraffe(70, 5, "Amy");
        System.out.println("Height: "+g.getHeight());
        g.walk(12);
    }
}
