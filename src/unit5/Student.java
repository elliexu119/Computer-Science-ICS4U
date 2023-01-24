/*
 * Ellie 
 * May 2018 
 * Student object. Contains data of students such as name and phone number, then generates a hash value.
 */
package unit5;

import java.util.Objects;

/**
 *
 * @author 1xuell
 */
public class Student {
    private String first;
    private String last;
    private int key; 
    private int phone; 

    public Student() {
        first = null;
        last = null;
        phone = 0; 
    }

    public Student(String first, String last, int phone) {
        this.first = first;
        this.last = last;
        this.phone = phone;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getkey() {
        return hashCode(); 
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 53 * hash + Objects.hashCode(this.first);
        hash = 53 * hash + Objects.hashCode(this.last);
        hash = 53 * hash + this.key;
        hash = 53 * hash + this.phone;
        return Math.abs(hash);
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
        return true;
    }
    

}
