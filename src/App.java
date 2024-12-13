import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello User!");
        Scanner sc=new Scanner(System.in);
        String fname,lname,gender,place;
        int age,total,maxMarks;
        String sub1,sub2,sub3,sub4;
        double percentage;

        System.out.println("Please Enter First name,last name,age,gender,place");
        fname=sc.nextLine();
        lname=sc.nextLine();
        age=sc.nextInt();
        sc.nextLine();
        gender=sc.nextLine();
        place=sc.nextLine();


        System.out.println("Please Enter All the 4 Subject names and marks obtained");
        sub1=sc.next();
        int subMark1=sc.nextInt();
        sub2=sc.next();
        int subMark2=sc.nextInt();
        sub3=sc.next();
        int subMark3=sc.nextInt();
        sub4=sc.next();
        int subMark4=sc.nextInt();

        System.out.println("Please Enter maximum marks can be obtained in all subjects");
        maxMarks=sc.nextInt();

        total=subMark1+subMark2+subMark3+subMark4;

        percentage=((double)total/(maxMarks*4.0))*100;

        System.out.println("User Info Given :-\nfirst name :-> "+fname+" \nlast name :-> "+lname+" \nTotal Marks :-> "+total+"\npercentage :-> "+percentage);

    }
}
