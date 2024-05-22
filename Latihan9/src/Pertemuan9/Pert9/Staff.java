package Pertemuan9.Pert9;

public class Staff extends Employee{
    private String title;
    private String office;
    private double salary;
    private String hireDate;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phone, email, office, salary, hireDate);
        this.title = title;
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate.toString();
    }

    public String toString() {
        return "Staff[name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + ", office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + ", title=" + title + "]";
    }
}
