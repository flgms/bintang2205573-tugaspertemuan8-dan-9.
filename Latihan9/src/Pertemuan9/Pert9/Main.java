package Pertemuan9.Pert9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input person
        System.out.println("Enter details for a Person:");
        System.out.print("Name: ");
        String personName = scanner.nextLine();
        System.out.print("Address: ");
        String personAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String personPhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String personEmail = scanner.nextLine();
        Person person = new Person(personName, personAddress, personPhoneNumber, personEmail);

        // Input for Student
        System.out.println("\nEnter details for a Student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String studentPhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String studentEmail = scanner.nextLine();
        System.out.print("Status (Freshman, Sophomore, Junior, Senior): ");
        String studentStatus = scanner.nextLine();
        Student student = new Student(studentName, studentAddress, studentPhoneNumber, studentEmail, studentStatus);

        // Input for Employee
        System.out.println("\nEnter details for an Employee:");
        System.out.print("Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Address: ");
        String employeeAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String employeePhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String employeeEmail = scanner.nextLine();
        System.out.print("Office: ");
        String employeeOffice = scanner.nextLine();
        System.out.print("Salary: ");
        double employeeSalary = scanner.nextDouble();
        System.out.print("Hire Date (year month day): ");
        int hireYear = scanner.nextInt();
        int hireMonth = scanner.nextInt();
        int hireDay = scanner.nextInt();
        MyDate hireDate = new MyDate(hireYear, hireMonth, hireDay);
        Employee employee = new Employee(employeeName, employeeAddress, employeePhoneNumber, employeeEmail, employeeOffice, employeeSalary, hireDate);

        // Input for Faculty
        scanner.nextLine();  // Consume newline left-over
        System.out.println("\nEnter details for a Faculty:");
        System.out.print("Name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Address: ");
        String facultyAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String facultyPhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String facultyEmail = scanner.nextLine();
        System.out.print("Office: ");
        String facultyOffice = scanner.nextLine();
        System.out.print("Salary: ");
        double facultySalary = scanner.nextDouble();
        System.out.print("Hire Date (year month day): ");
        hireYear = scanner.nextInt();
        hireMonth = scanner.nextInt();
        hireDay = scanner.nextInt();
        hireDate = new MyDate(hireYear, hireMonth, hireDay);
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Office Hours: ");
        String officeHours = scanner.nextLine();
        System.out.print("Rank: ");
        String rank = scanner.nextLine();
        Faculty faculty = new Faculty(facultyName, facultyAddress, facultyPhoneNumber, facultyEmail, facultyOffice, facultySalary, hireDate, officeHours, rank);

        // Input for Staff
        System.out.println("\nEnter details for a Staff:");
        System.out.print("Name: ");
        String staffName = scanner.nextLine();
        System.out.print("Address: ");
        String staffAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String staffPhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String staffEmail = scanner.nextLine();
        System.out.print("Office: ");
        String staffOffice = scanner.nextLine();
        System.out.print("Salary: ");
        double staffSalary = scanner.nextDouble();
        System.out.print("Hire Date (year month day): ");
        hireYear = scanner.nextInt();
        hireMonth = scanner.nextInt();
        hireDay = scanner.nextInt();
        hireDate = new MyDate(hireYear, hireMonth, hireDay);
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Title: ");
        String title = scanner.nextLine();
        Staff staff = new Staff(staffName, staffAddress, staffPhoneNumber, staffEmail, staffOffice, staffSalary, hireDate, title);

        // Output
        System.out.println("\nOutput:");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

        scanner.close();

    }
}