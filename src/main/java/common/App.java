package common;

import org.hibernate.Session;
import model.entities.*;
 /* Created by dvasiliev on 18.01.2017.
 */
public class App {

    public static void main( String[] args )
    {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Clinic clinic = new Clinic();
        clinic.setName("ЛПУ №1");

        session.save(clinic);

        EmplClinic emplClinic = new EmplClinic();
        emplClinic.setFirstName("Иван");
        emplClinic.setLastnameName("Иванов");
        emplClinic.setMiddleName("Иванович");
        emplClinic.setClinic(clinic);
        session.save(emplClinic);

        emplClinic = new EmplClinic();
        emplClinic.setFirstName("Петр");
        emplClinic.setLastnameName("Петров");
        emplClinic.setMiddleName("Петрович");
        emplClinic.setClinic(clinic);
        session.save(emplClinic);

        CaseOrder order = new CaseOrder();
        session.getTransaction().commit();
    }
}
