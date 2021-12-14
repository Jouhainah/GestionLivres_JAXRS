package tn.haina.dao;

import tn.haina.model.Livre;

import java.util.List;

public interface IGestionLivre {

    public Livre save(Livre livre);
    public Livre findById(Long id) ;
    public List<Livre> findAll() ;
    /*public Livre update(Livre livre);*/
    public void deleteById(Long id);
}
