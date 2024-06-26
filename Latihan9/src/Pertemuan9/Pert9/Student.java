package Pertemuan9.Pert9;

public class Student extends Person{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String classStatus;
    
    public Student(String name, String address, String phone, String email, String classStatus){
        super(name, address, phone, email);
        this.classStatus = classStatus;
    }
// Override
    public String toString(){
        return "Student[name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + ", classStatus=" + classStatus + "]";
    }
}
