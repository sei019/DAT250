package model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data @Entity
public class Bank {
    @GeneratedValue(strategy = GenerationType.SEQUENCE) @Id
    private String id;
    private String name;

}
