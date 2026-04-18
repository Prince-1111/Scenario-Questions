class Patient {
    String patientname;
    int age;
    int daysadmitted;
    double dailycharge;
    Patient(String name, int age, int days , double charge){
        this.patientname= name;
        this.age= age;
        this.daysadmitted = days;
        this.dailycharge =charge;
    }
    double CalculateTotalBill(){
        double total= daysadmitted * dailycharge;
        if (daysadmitted>7) {
            total= total - (total*0.10);
        }
        return total;
    }
    void display() {
        System.out.println("Name:" + patientname);
        System.out.println("Age:" + age);
        System.out.println("Days Amitted:" + daysadmitted);
        System.out.println("Daily Charge:" + dailycharge);
    }
}
public class HospitalTest{
    public static void main(String[] args) {
        Patient patient1= new Patient("Hari", 33, 3, 3000);
        Patient patient2= new Patient("Ram", 12, 8, 5000);
        patient1.display();
        System.out.println("Total Bill:" + patient1.CalculateTotalBill());
        patient2.display();
        System.out.println("Total Bill:" + patient2.CalculateTotalBill());
    }
}