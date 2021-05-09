import java.util.Scanner;

public class App
{
    private final Finance finance =  new Finance();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void createMember(){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter number");
        String number = scanner.nextLine();
        System.out.println("Enter principal");
        int principal = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter rate");
        double rate = scanner.nextDouble();

        InterestCalc obj = finance.createList(name,number,principal,month,rate);
        finance.addList(obj);
    }




}