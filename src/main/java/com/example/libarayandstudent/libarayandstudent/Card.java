package com.example.libarayandstudent.libarayandstudent;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "card_table")
public class Card {

    @Id    //we wnat out id to auto increment so than we use
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int fine;

    @CreationTimestamp
    private Date createdOn;


    Card()
    {

    }
    public Card(int fine){
        this.fine = fine;
    }





    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
