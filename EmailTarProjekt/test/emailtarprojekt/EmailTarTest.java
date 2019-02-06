/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailtarprojekt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sz7petfer
 */
public class EmailTarTest {
    
    public EmailTarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void EmailTarKonstruktorUresEmailCim() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("EmailTarKonstruktorUresEmailCim.");
        try{
            EmailTar et=new EmailTar("");
            fail("EmailTar konstruktor üres emailcímre nem dob kivételt.");
        }
        catch (Exception e){
            if(e.getMessage()!="EmailTar objektum üres email címmel nem jöhet létre.")
            {
                fail("EmailTar konstruktor üres emailcímre rossz szövegű kivételt dob!");
            }
        }
    }
    
}
