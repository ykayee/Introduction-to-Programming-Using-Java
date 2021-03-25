import java.util.Scanner;
public class ProgramLang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Programming Name: ");
        String programName = scanner.nextLine();

        if(programName.equalsIgnoreCase("Java")){
            System.out.println("Good");
        }else if(programName.equalsIgnoreCase("Python")){
            System.out.println("Cool!");
        }else if(programName.equalsIgnoreCase("C++")){
            System.out.println("Not bad!");
        }else if(programName.equalsIgnoreCase("Go")){
            System.out.println("Awesome!");
        }else if(programName.equalsIgnoreCase("Ruby")){
            System.out.println("Nice!");
        }else
            System.out.println("This is not a programming lang.");
    }
}
