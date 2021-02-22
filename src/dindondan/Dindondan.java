/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author Utente
 */
public class Dindondan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thr1 = new Thread (new Campana("din",5));
        thr1.start();
        Thread thr2 = new Thread (new Campana("don",5));
        thr2.start();
        Thread thr3 = new Thread (new Campana("dan",5));
        thr3.start();
        Thread thr4 = new Thread (new Campana("dun",5));
        thr4.start();

    }
    
}
