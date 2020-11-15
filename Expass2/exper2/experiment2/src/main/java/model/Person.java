package model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity @Data
public class Person {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private String id;

    @ManyToMany(mappedBy = "peopleAddress")
    ArrayList<Address> address = new ArrayList<>();

    @OneToMany(mappedBy = "peopleCards")
    private final ArrayList<CreditCard> creditcards = new ArrayList<CreditCard>();

}
