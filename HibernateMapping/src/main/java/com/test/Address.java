package com.test;
 
import java.util.List;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String state;
    private String country;
 
    @ManyToMany(mappedBy = "addresses")
    private List<Student> students;
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
 
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
 
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
 
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}