import java.util.Scanner;
public class FixedDeposits {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String choice="y";
        while (choice.equals("y")) {
        System.out.println("Enter your Deposit:");
        double p= sc.nextDouble();
        if (p>= 1000) {
            System.out.println("Enter the Interest rate (8% - 12%):");
            double rate= sc.nextDouble();
            if (rate>=8 && rate <= 12){
                System.out.println("Enter the Years(1-5):");
                int years = sc.nextInt();
                if (years >= 1 && years <= 5) {
                    int month= years *12;
                    double r= rate/12/100;
                    double maturity= p*Math.pow(1 + r, month);
                    double fee = maturity * 0.005;
                    System.out.println("Maturity:" + maturity);
                    System.out.println("Fee:" + fee);
                    System.out.println ("Final:" + (maturity-fee));
                    
                } else{
                    System.out.println("Invalid Years");
                }
            } else {
                System.out.println("Invalid Rate");
            }
        } else {
            System.out.println ("Invalid Ammount");
        }System.out.print("Enter y to continue:");
        choice= sc.next();
    }
    sc.close();
}
}