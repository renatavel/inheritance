import java.util.Scanner;

public class Staff extends Person{
    String education,position;
    void intialize1(){
        super.initialize();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your education: ");
        education = sc.nextLine();
        System.out.println("Please enter your position: ");
        position = sc.nextLine();
    }

    String print1(){
        super.print();
        String all= "Education: "+this.education+",position: "+this.position;
        System.out.println(all);
        return all;
    }
}
