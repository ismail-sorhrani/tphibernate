/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entities.Projet;
import java.util.Date;
import service.EmployeService;
import service.ProjetService;

/**
 *
 * @author Ismail
 */
public class TestProjet {
    public static void main(String[] args) {
        ProjetService ps = new ProjetService();
        EmployeService es = new EmployeService();
        ps.create(new Projet("devlloper un site", new Date(), new Date("2027/10/18"), es.findById(1)));
        ps.create(new Projet("devloper une application mobile", new Date(), new Date("2027/10/18"), es.findById(2)));
    }
}
