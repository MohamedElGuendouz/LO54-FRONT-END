package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LocationDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lo54Project");
    EntityManager entityManager = null;

    public void save(Location f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(f);
        entityManager.getTransaction().commit();
    }

    public Location getLocationById(long userId) {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Location.class, userId);
    }

    public void update(Location f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(f);
        entityManager.getTransaction().commit();
    }
}
