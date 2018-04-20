/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.examples;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 1xuell
 */
public class Student {

//CLASS CONSTANTS 
    public final static String SCHOOL = "Garth Webb";

    //CLASS VARIBALES 
    private int nextId;

    //OBEJCT / INSTANCE VARIABLE 
    private int studentNumber;
    private String firstName;
    private String lastName;
    private Date dob; //date of birth
    private int grade;

    /**
     * @param args the command line arguments
     */
    public Student() {
    }

    public Student (int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public static void main(String[] args) {
        Student a = new Student(1);
        Student b = new Student(1);
        Student c = new Student(2);
        Student d = c;

        System.out.println(a == b);
        System.out.println(d == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    private void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Strings{" + "nextId=" + nextId + ", studentNumber=" + studentNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", grade=" + grade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.studentNumber > 0 && other.studentNumber == other.studentNumber) {
            return true;
        }
        if (this.studentNumber != other.studentNumber) {
            return true;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return true;
    }
}
