package model.entities;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
/**
 * Created by dvasiliev on 17.01.2017.
 * сотрудники клиник (у пользователя должно быть сопоставление с сотрудником!)
 */

@Entity
@Table(name = "EmplClinic")
public class EmplClinic {
 //код сотрудника
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", insertable = false)
    private int id;
    // Ф.И.О.
    @Column(name = "LastName")
    private String lastname;
    public void setLastnameName(String lastname) {
        this.lastname = lastname;
    }
    public String getLastName() {
        return lastname;
    }

    @Column(name = "FirstName")
    private String firstname;
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstName() {return firstname;}

    @Column(name = "MiddleName")
    private String middlename;
    public void setMiddleName(String middlename) {this.middlename = middlename;}
    public String getMiddleName() {return middlename;}


    @ManyToOne
    @JoinColumn(name="СlinicId")
    private Clinic clinic;
    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }


    /*  public String emplName()
    {
        String ret;
        ret = this.getLastName();
        ret += (ret ? " " : "").concat(this.getFirstName());
        ret += (ret ? " " : "").concat(this.getMiddleName()));
        return ret;
    }
*/
}
