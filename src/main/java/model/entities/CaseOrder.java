package model.entities;

import javax.persistence.*;
import java.util.*;

/**
 * Created by dvasiliev on 17.01.2017.
 * Заявки
 */
@Entity
@Table(name = "CaseOrder")
public class CaseOrder {
    // id клиники

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "Id", insertable = false)
    private int id;
    //датавремя создания
    private Date createdDT;
    @Column(name = "CreatedDT")
    public void setCreatedDT(Date   createdDT) {
        this.createdDT = createdDT; }
    public Date getCreatedDT() {
        return this.createdDT;
    }

    //№ полиса

    @Column(name = "PolisNum", length = 25)
    private String polisNum;
    public void setPolisNum(String   polisNum) {
        this.polisNum = polisNum; }
    public String getPolisNum() {
        return this.polisNum;
    }

    // основной диагноз

    @Column(name = "MainDiagn")
    private String mainDiagn;
    public void setMainDiagn(String   mainDiagn) {
        this.mainDiagn = mainDiagn; }
    public String getMainDiagn() {
        return this.mainDiagn;
    }

    // Комментарий страховой

    @Column(name = "CompanyResp", length = 500)
    private String companyResp;
    public void SetCompanyResp(String   companyResp) {
        this.companyResp = companyResp; }
    public String getCompanyResp() {
        return this.companyResp;
    }


    //ФИО пациента

    @Column(name = "PatName")
    private String patName;
    public void setPatName(String   patname) {
        this.patName = patname;
    }
    public String getPatName() {return this.patName;}


    //ответственный сотрудник клиники

    @ManyToOne
    @JoinColumn(name = "EmplClinicId")
    private EmplClinic emplClinic;
    public void setEmplClinic(EmplClinic    emplClinic) {
        this.emplClinic = emplClinic;
    }
    public EmplClinic getEmplClinic() {
        return emplClinic;
    }

    //ответственный сотрудник страховой

    @ManyToOne
    @JoinColumn(name = "EmplCompanyId")
    private EmplCompany emplCompany;
    public void setEmplCompany(EmplCompany    emplCompany) {
        this.emplCompany = emplCompany;
    }
    public EmplCompany getEmplCompany() {
        return emplCompany;
    }

    //страховая

    @ManyToOne
    @JoinColumn(name = "Companyd")
    private Company company;
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company   company) {
        this.company = company;
    }
    //мед.клиника

    @ManyToOne
    @JoinColumn(name = "СlinicId")
    private Clinic clinic;
    public Clinic getClinic() {
        return clinic;
    }
    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

   @OneToMany(mappedBy = "caseOrder")
   private List<CaseOrderLine> orderLines;


}
