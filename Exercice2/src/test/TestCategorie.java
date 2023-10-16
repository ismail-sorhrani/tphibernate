/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Categorie;
import service.CategorieService;

/**
 *
 * @author PC
 */
public class TestCategorie {
    public static void main(String[] args) {
        CategorieService cs = new CategorieService();
        cs.create(new Categorie("1", "jacket"));
         cs.create(new Categorie("2", "short"));
          cs.create(new Categorie("3", "T-short"));
    }
    
}
