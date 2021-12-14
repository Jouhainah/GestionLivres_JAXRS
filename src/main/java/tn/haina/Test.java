package tn.haina;

import tn.haina.dao.GestionLivreImp;

/**
 * @Author: Jouhaina
 * @Date: 08/12/2021
 * @Time: 17:27
 */
public class Test {
    public static void main(String[] args) {
        GestionLivreImp gestionLivreImp =new GestionLivreImp();
        System.out.println(gestionLivreImp.findById((long) 1));
        System.out.println(gestionLivreImp.findAll().get(1));

    }
}
