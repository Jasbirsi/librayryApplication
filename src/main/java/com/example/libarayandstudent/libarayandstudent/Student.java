package com.example.libarayandstudent.libarayandstudent;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_table")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;

    private int age;
    private String country;



    @CreationTimestamp
    private Date creationOn;

    @UpdateTimestamp
    private Date updateon;


    //relation between Student and library card
    @OneToOne  //if first one or many represent this class , and other represnt the table to which we are joining
    @JoinColumn  //we also need to specifiy here wi=hich column, since its defalut i
    Card card;




    Student() {

    }
    public Student( String name, int age, String country) {

        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Card getCard() {
        return card;
    }

    //what are we doing here?
    //because we need to create card for the students,thats why student.setcard()
    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
