package util;

import domain.Course;
import domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    public static Session getSession() {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class);
        SessionFactory sf = cfg.buildSessionFactory();

        return sf.openSession();
    }
}
