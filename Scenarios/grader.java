import java.util.Scanner;
public class grader {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA:");
        double GPA= sc.nextDouble();
        if (GPA < 0.0){
            System.out.println("Your GPA is Invalid");
            
        } else if (GPA >4.0) {
            System.out.println("Yoyr GPA is Invalid");
        } else if (GPA >= 3.45){
            System.out.println("Your Grade is A");
        } else if (GPA >= 3.0){
            System.out.println("Your Grade is B");
        } else if (GPA >= 2.45) {
            System.out.println("Your Grade is C");
        } else if (GPA >= 2) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is F");
    }
} 
}

