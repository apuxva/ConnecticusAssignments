abstract class Employee{
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;

    }
    abstract void calculateSalary();
}

class FullTimeEmp extends Employee{
    double salary;

    public FullTimeEmp(String name, int id, double salary) {
        super(name,id);
        this.salary = salary;
        
    }

    @Override
    void calculateSalary(){
        System.out.println("Full Time Employee Salary is " + salary);
    }    
}

class PartTimeEmp extends Employee{
    int hours;
    double rate;

    public PartTimeEmp(String name, int id, int hours , double rate) {
        super(name,id);
        this.hours = hours ;
        this.rate = rate;
    }

    @Override
    void calculateSalary(){
        System.out.println("Part Time Employee Salary is " + (hours*rate));
    }    
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmp("apurva", 101, 50000);
        Employee e2 = new PartTimeEmp("Anushka", 102, 5, 800);
        e1.calculateSalary();
        e2.calculateSalary();
    }

    
}
