/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailtarprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sz7petfer
 */
public class EmailTarProjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String email="Peti.vasvari.hu";
        
        try {
            EmailTar et=new EmailTar(email);
            et.ellenorzes();
        }
        catch (Exception e) {
            System.err.println("Diák rossz e-mail cím miatt nem hozható létre!");
        }
    }
    
}
