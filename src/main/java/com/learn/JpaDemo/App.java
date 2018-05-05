package com.learn.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student std=null;
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentPersistence");
        EntityManager em= emf.createEntityManager();
        //Find query
		std= em.find(Student.class, 109);
        System.out.println(std);
        
        //Insert into db
        em.getTransaction().begin();
        std=new Student();
        std.setRollno(108);
        std.setSname("Smita");
        std.setSchool("RJL");
        em.persist(std);
        em.getTransaction().commit();
        
        em.close();
         
    }
}
