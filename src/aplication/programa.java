package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.pessoa;

public class programa {

	public static void main(String[] args) {
		pessoa p1 = new pessoa(null, "Pablo", "pablo@gmail.com");
		pessoa p2 = new pessoa(null, "Thiago", "tiago@gmail.com");
		pessoa p3 = new pessoa(null, "André", "andre@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
	}

}
