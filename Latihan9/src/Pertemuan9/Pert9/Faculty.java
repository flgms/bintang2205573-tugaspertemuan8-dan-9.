package Pertemuan9.Pert9;

public class Faculty extends Employee{
    private int hours;
    private String rank;
    private String office;
    private double salary;
    private String hireDate;

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate hireDate, int officeHours, String rank) {
        super(name, address, phone, email, office, salary, hireDate);
        this.hours = officeHours;
        this.rank = rank;
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate.toString();
        
    }
    
    public Faculty(String facultyName, String facultyAddress, String facultyPhoneNumber, String facultyEmail,
    String facultyOffice, double facultySalary, MyDate hireDate2, String officeHours, String rank2) {
        super(facultyName, facultyAddress, facultyPhoneNumber, facultyEmail, facultyOffice, facultySalary, hireDate2);
        this.hours = Integer.parseInt(officeHours);
        this.rank = rank2;
        this.office = facultyOffice;
        this.salary = facultySalary;
        this.hireDate = hireDate2.toString();

    }

    public String toString() {
        return "Faculty[name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + ", office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + ", hours=" + hours + ", rank=" + rank + "]";
    }
}
