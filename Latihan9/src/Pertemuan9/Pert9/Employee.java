package Pertemuan9.Pert9;

public class Employee extends Person{
    
    private String office;
    private double salary;
    private MyDate hireDate;


    public Employee(String name, String address, String phone, String email, String office2, double salary2, MyDate hireDate2) {
        super(name, address, phone, email);
        this.office = office2;
        this.salary = salary2;
        this.hireDate = hireDate2;
    }

    public String toString() {
        return "Employee[name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + ", office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + "]";
    }
}

