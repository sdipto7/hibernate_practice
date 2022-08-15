package service;

import domain.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSession;

public class StudentService {

    private Session session = HibernateSession.getSession();

    public Student findById(int id) {

        return session.get(Student.class, id);
    }

    public void save(Student student) {
        Transaction tx = session.beginTransaction();

        session.save(student);

        tx.commit();
    }
}
