package Demo.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        alien a1 = new alien();
        a1.setOid(14);
        a1.setAname("Parth");
        a1.setColor("Red");
        
        Configuration con = new Configuration().configure();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(a1);
        
        tx.commit();
    }
}
