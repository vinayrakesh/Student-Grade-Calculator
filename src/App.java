import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello User!");
        Scanner sc=new Scanner(System.in);
        String fname,lname,gender,place;
        int age,total,maxMarks;
        String sub1,sub2,sub3,sub4;

        System.out.println("Please Enter First name,last name,age,gender,place");
        fname=sc.nextLine();
        lname=sc.nextLine();
        age=sc.nextInt();
        sc.nextLine();
        gender=sc.nextLine();
        place=sc.nextLine();


        System.out.println("Please Enter All the 4 Subject names and marks obtained");
        sub1=sc.next();
        sub2=sc.nextLine();
        sub3=sc.nextLine();
        sub4=sc.nextLine();

        System.out.println("User Info Given :-\nfirst name :-> "+fname+" \nlast name :-> "+lname+" \nage :-> "+age+"\ngender :-> "+gender+"\nplace :-> "+place);

    }
}
