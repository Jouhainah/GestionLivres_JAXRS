package tn.haina.service;

import tn.haina.dao.GestionLivreImp;
import tn.haina.model.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jouhaina
 * @Date: 08/12/2021
 * @Time: 16:59
 */
@Path("/livre")
public class LivreService {

    GestionLivreImp gestionLivre;

    public LivreService(){
        this.gestionLivre = new GestionLivreImp();
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Livre findById(@PathParam("id")long id){
        return gestionLivre.findById(id);
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Livre> findAll(){
        return gestionLivre.findAll();
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public String add(Livre livre){
         gestionLivre.save(livre);
         return "Livre added!";
    }


   /* @PUT
    @Path("{id}")
    public String update(@PathParam("id") Long id,Livre livre ) {
            Livre livre1= gestionLivre.findById(id);
            livre1.setName(livre.getName());
            livre1.setPrice(livre.getPrice());
            gestionLivre.update(livre);
            return "Live updated!";
    }*/

    @DELETE
    @Path("{id}")
    public String delete(@PathParam(value = "id") Long id) {
            gestionLivre.deleteById(id);
            return "Livre deleted";
    }


}
