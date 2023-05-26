package hibernatequerylanguage;

import hibernate.Employee;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employeee.class).
                buildSessionFactory();


        Session session = factory.openSession();
        Transaction tx = null;

        try{

            tx = session.beginTransaction();
            Employeee employee = new Employeee(1001,"Fazil",10000,new Address(1001,"Denizli"));


            Employeee employee = session.get(Employeee.class,1002);
            Address address =  session.get(Address.class,1002);

            System.out.println(employee+" "+address);

            //System.out.println(session.createQuery("select name,city from Employeee join Address on employee.id=employee.id").list());


        }finally {
            session.close();
        }
    }
}
