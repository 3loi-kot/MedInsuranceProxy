package model.entities;
import javax.persistence.*;
/**
 * Created by dvasiliev on 17.01.2017.
 * Страховые компании
 */

@Entity
@Table(name = "Company")

public class Company {

    // id страховой компании
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", insertable = false)
    private int id;


    // название страховой компании
    @Column(name = "Name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


