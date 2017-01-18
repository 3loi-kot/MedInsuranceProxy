package model.entities;
import javax.persistence.*;
/**
 * Created by dvasiliev on 17.01.2017.
 * Медицинские клиники
 */

@Entity
@Table(name = "Clinic")

public class Clinic {

    // id клиники
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "Id", insertable = false)
    private int id;


    // название клиники
    @Column(name = "Name")
    private String name;
    public void setName(String name) {
        this.name = name; }

    public String getName() {
        return name;
    }



}
