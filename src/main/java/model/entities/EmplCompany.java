package model.entities;
import javax.persistence.*;
/**
 * Created by dvasiliev on 17.01.2017.
 * сотрудники страховых компаний (у пользователя должно быть сопоставление с сотрудником страховой компании)
 */

@Entity
@Table(name = "EmplCompany")
public class EmplCompany {
    //код сотрудника
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    @OneToOne
    @JoinColumn(name="CompanyId")
    private Company company;
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}

