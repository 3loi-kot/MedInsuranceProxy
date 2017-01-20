package model.entities;

import javax.persistence.*;


/**
 * Created by dvasiliev on 20.01.2017.
 назначения по заявкам
 */

    @Entity
    @Table(name = "CaseOrderLine")
    public class CaseOrderLine {
        // id клиники

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Id", insertable = false)
        private int id;


        //назначения
        @Column(name = "Prescription", length = 500)
        private String prescription;
        public void setCreatedDT(String prescription) {
            this.prescription = prescription;
        }
        public String getPrescription() {
            return this.prescription;
        }

        //ccылка на заявку
        @ManyToOne(targetEntity = model.entities.CaseOrder.class)
        @JoinColumn(name = "CaseOrderId", nullable=false)
        private CaseOrder caseOrder;
        public void setCaseOrder(CaseOrder    caseOrder) {
            this.caseOrder = caseOrder;
        }
        public CaseOrder getCaseOrder() {
            return caseOrder;
        }

    }

