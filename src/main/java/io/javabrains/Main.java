package io.javabrains;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
       Employee employee = new Employee();
       employee.setId(1);
       employee.setName("Chaker");
        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("Mootez");
        employee1.setSsn("123");
        Employee employee2 = new Employee();
        employee2.setId(3);
        employee2.setName("Said");
        employee2.setSsn("124");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        entityManager.persist(employee1);
        entityManager.persist(employee2);

        transaction.commit();

    }
}