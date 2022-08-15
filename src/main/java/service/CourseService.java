package service;

import domain.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSession;

public class CourseService {

    private Session session = HibernateSession.getSession();

    public Course findById(int id) {

        return session.get(Course.class, id);
    }

    public void save(Course course) {
        Transaction tx = session.beginTransaction();

        session.save(course);

        tx.commit();
    }
}
