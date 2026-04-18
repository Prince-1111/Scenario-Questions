class Person {
    int id;
    String name;
    double basicsalary;
    static String collegename= "XYZ College";
    Person(int id, String name, double salary){
        this.id=id;
        this.name= name;
        this.basicsalary= salary;
    }
    double annual(){
        return basicsalary* 12;
    }
}
class Teacher extends Person {
    String subject;
    double bonus;
    Teacher(int id, String name, double basicsalary, String subject, double bonus) {
        super(id, name, basicsalary);
        this.subject= subject;
        this.bonus= bonus;
    }
    @Override
    double annual(){
        return super.annual() + bonus;
    }
}
class Staff extends Person{
    int workinghours;
    double rateperhour;
    Staff(int id, String name, double basicsalary, int workinghours, double rateperhour){
        super(id, name, basicsalary);
        this.workinghours= workinghours;
        this.rateperhour= rateperhour;
    }
    double calculatesalary(){
        return workinghours*rateperhour;
    }
}
public class School{
    public static void main(String[] args){
        Teacher teacher1= new Teacher(1, "hari", 30000, "Math", 20000);
        System.out.println("Teacher Annual Salary:" + teacher1.annual());
        Staff staff1= new Staff(2, "Ram", 0, 1600, 3500);
        System.out.println("Staff Salary:" + staff1.annual());
        System.out.println("College Name:" + Person.collegename);
    }
}