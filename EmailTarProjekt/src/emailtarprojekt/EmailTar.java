/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailtarprojekt;

/**
 *
 * @author sz7petfer
 */
public class EmailTar {
    private String email;

    public EmailTar(String email) throws Exception {
        if(email=="")
            throw new Exception("EmailTar objektum üres email címmel nem jöhet létre.");
        this.email = email;
    }

    void ellenorzes() throws Exception {
        if(ellenorzesNincsKukac())
            throw new Exception("Az email cim nem tartalmaz kukacot!");
    }

    private boolean ellenorzesNincsKukac() {
        for(char c : email.toCharArray()){
            if(c=='@')
                return false;
            
        }
        return true;
    }
}
