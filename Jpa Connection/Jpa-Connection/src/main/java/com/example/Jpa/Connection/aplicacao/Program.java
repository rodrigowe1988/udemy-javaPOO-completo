package com.example.Jpa.Connection.aplicacao;

import com.example.Jpa.Connection.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

//        Objects to start the database
//        Pessoa p1 = new Pessoa(null, "Rodrigo Weber", "rodrigo@email.com");
//        Pessoa p2 = new Pessoa(null, "Rogério Weber", "rogerio@email.com");
//        Pessoa p3 = new Pessoa(null, "Aline Bays", "aline@email.com");
//        Pessoa p4 = new Pessoa(null, "Rafa Rosseti", "rafaela@email.com");


        //Interface used to interact with the entity manager factory for the persistence unit
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        //Interface used to interact with the persistence context
        EntityManager em = emf.createEntityManager();

        //start updates on database
//        em.getTransaction().begin();

        //persist to save object on database
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(p4);

        //find Person on database
        Pessoa p = em.find(Pessoa.class, 1);

        //remove this Person from Database
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        //confirm changes on database
//      em.getTransaction().commit();
        System.out.println(p);
        System.out.println("DONE!");
        em.close();
        emf.close();
    }
}
