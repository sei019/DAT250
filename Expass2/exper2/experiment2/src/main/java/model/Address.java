package model;
import javax.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data @Entity
public class Address {
    private int id;
    private int number;

    @ManyToMany()
    private List<Person> people = new ArrayList<Person>();
}
