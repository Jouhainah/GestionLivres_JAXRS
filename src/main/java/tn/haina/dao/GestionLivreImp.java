package tn.haina.dao;

import tn.haina.model.Livre;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: Jouhaina
 * @Date: 08/12/2021
 * @Time: 01:28
 */
public class GestionLivreImp  implements IGestionLivre{



    private EntityManager em;

    public GestionLivreImp() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        em = emf.createEntityManager();
    }

    public Livre save(Livre livre) {
        em.getTransaction().begin();
        em.merge(livre);
        em.getTransaction().commit();
        return livre;
    }

    public Livre findById(Long id) {
        em.getTransaction().begin();
        Livre livre = em.find(Livre.class, id);
        em.getTransaction().commit();
        return livre ;
    }
    public List<Livre> findAll() {
        em.getTransaction().begin();
        Query query = em.createQuery("select l from Livre as l");
        List<Livre> livres = query.getResultList();
        em.getTransaction().commit();
        return livres;
    }

    /*public Livre update(Livre livre) {
        em.getTransaction().begin();
        livre = em.merge(livre);
        em.getTransaction().commit();
        return livre;
    }*/

    public void deleteById(Long id) {
        em.getTransaction().begin();
        em.remove(em.find(Livre.class, id));
        em.getTransaction().commit();
    }

}
