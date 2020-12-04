package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CourseDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lo54Project");
    EntityManager entityManager = null;

    public void save(Course f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(f);
        entityManager.getTransaction().commit();
    }

    public Course getCourseById(long userId) {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Course.class, userId);
    }

    public void update(Course f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(f);
        entityManager.getTransaction().commit();
    }
}
