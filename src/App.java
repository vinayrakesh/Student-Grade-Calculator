import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello User!");
        Scanner sc=new Scanner(System.in);
        String fname,lname,gender,place;
        int age;
        System.out.println("Please Enter First name,last name,age,gender,place");
        fname=sc.nextLine();
        lname=sc.nextLine();
        age=sc.nextInt();
        sc.nextLine();
        gender=sc.nextLine();
        place=sc.nextLine();

        System.out.println("User Info Given :-\nfirst name :-> "+fname+" \nlast name :-> "+lname+" \nage :-> "+age+"\ngender :-> "+gender+"\nplace :-> "+place);

    }
}
