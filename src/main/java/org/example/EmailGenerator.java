package org.example;


import java.util.Scanner;

public class EmailGenerator {
    private String firstName;
    private String lastName;
    private String company = "awesome";
    private String department;
    private int passwordLength = 10;
    private String email;
    private String password;
    private int emailCapacity = 500;

    // constructor to get first and last name from user
    public EmailGenerator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = createPassword(passwordLength);
        this.email = createEmail();
    }
    public String printAll() {
        return "Name: " + this.firstName + " " + this.lastName + "\nDepartment: " + this.department + "\n Email: " + this.email + "\n Password: " + this.password
                  + "\n EmailCapacity: " + this.emailCapacity;
    }
    private String setDepartment() {
        System.out.println("Departments: Enter \n1 for Sales \n2 for Development \n3 for finance \n0 for not known");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            department = "sales";
        } else if (departmentChoice == 2) {
            department = "development";
        } else if (departmentChoice == 3) {
            department = "finance";
        } else if (departmentChoice == 0) {
            department = "unknown";
        } else {
            System.out.println("select from provided choices");
        }

        return department;
    }


    // set email address
    public String createEmail() {
        String generatedEmail = this.firstName + "." + this.lastName + "@" + this.department + "." + this.company + ".com";
        return generatedEmail;
    }

    public String createPassword(int length) {
        String passwordSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFJHIJKLMNOPQRSTUVWXYZ@£!*";
        char[] randomPassword = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            randomPassword[i] = passwordSet.charAt(random);
        }
        return new String(randomPassword);

//        byte[] array = new byte[10];
//        new Random().nextBytes(array);
//        this.password = new String(array, Charset.defaultCharset());
//        System.out.println(this.password);
//        return this.password;
    }

    public void setEmailCapacity(int emailCapacity) {
        this.emailCapacity = emailCapacity;
    }

    public int getEmailCapacity() {
        return emailCapacity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.email = alternateEmail;
    }

    public String getAlternateEmail(String email) {
        return email;
    }
}
