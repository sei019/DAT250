package model;
import javax.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity

@Data
public class CreditCard {
    @Id
    private int number;
    private int limit;
    private int balance;
    @OneToOne()
    private Pin pin;
    @ManyToOne()
    private Bank bank;
    @ManyToOne(optional = false)
    private Person people;
}
