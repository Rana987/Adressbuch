import model.Company;
import model.PartnerContact;
import model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] Args) {
        System.out.println("The main function");
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Person person = new Person("49494949", "Hans", "hans@adressbuch.de", "www.herrhans.de"
                    , 2L, "Prof. Dr.", "Berlin","Istanbul" , "MusterLebenslauf", "keinFoto");
            session.save(person);
            Company company = new Company("343434", "John", "john@adressbuch.de", "www.herrjohn.de"
                , 13L, "Pfizer", "Budapest","Munich" , 123, "Pharma");
            session.save(company);
            PartnerContact partnerContact = new PartnerContact("49494949", "Hans", "hans@adressbuch.de", "www.herrhans.de"
                , 2L);
            session.save(partnerContact);
            transaction.commit();
            session.close();
            System.out.println("DB updated");
        } catch (HibernateException hibernateException) {
            System.out.println("Problem creating session factory");
            hibernateException.printStackTrace();
        }

    }  //GIT TEST 3

}
