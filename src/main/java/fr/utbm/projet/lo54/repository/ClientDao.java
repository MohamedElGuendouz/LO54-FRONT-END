package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lo54Project");
    EntityManager entityManager = null;

    public void save(Client f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(f);
        entityManager.getTransaction().commit();
    }

    public Client getClientById(long userId) {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Client.class, userId);
    }

    public void update(Client f) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(f);
        entityManager.getTransaction().commit();
    }
}
