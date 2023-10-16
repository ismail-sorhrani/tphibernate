/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entities.Employe;
import service.EmployeService;

/**
 *
 * @author PC
 */
public class TestEmploye {
    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        es.create(new Employe("Ismail", "Sorhrani", "063768368548"));
         es.create(new Employe("Simo", "sorhrani", "063768368548"));
          es.create(new Employe("Sirine", "sorhrani", "063768368548"));
           
           
    }
    
}
