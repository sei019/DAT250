package model;

import lombok.Data;
import javax.persistence.*;

@Entity @Data
public class Pin {
    @GeneratedValue(strategy = GenerationType.SEQUENCE) @Id
    private String id;
    private int count;
    private String pincode;
    @OneToOne(mappedBy = "pin", optional = false)
    private CreditCard creditCard;
}
