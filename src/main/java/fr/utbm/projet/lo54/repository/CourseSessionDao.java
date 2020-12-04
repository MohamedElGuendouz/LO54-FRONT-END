package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.CourseSession;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CourseSessionDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lo54Project");
    EntityManager entityManager = null;

    public void save(CourseSession f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(f);
        entityManager.getTransaction().commit();
    }
    
    public ArrayList<CourseSession> listAll() {
        ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();
        entityManager = entityManagerFactory.createEntityManager();
        Query q = entityManager.createQuery("from CourseSession");
        sessions = (ArrayList<CourseSession>) q.getResultList();
        return sessions;
    }

    public CourseSession getCourseSessionById(long userId) {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(CourseSession.class, userId);
    }

    public void update(CourseSession f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(f);
        entityManager.getTransaction().commit();
    }
}
