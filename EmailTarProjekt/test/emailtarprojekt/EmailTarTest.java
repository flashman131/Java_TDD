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

    /**
     * Test of ellenorzes method, of class EmailTar.
     */
    @Test
    public void testEllenorzesNincsKukac() {
        System.out.println("testEllenorzesNincsKukac");
        try{
            EmailTar instance = new EmailTar("peti.vasvari.hu");
            instance.ellenorzes();
            fail("Az ellenörzés kukac nélküli emailcímre nem dob kivételt!");
        }
        catch(Exception e)
        {
            if(e.getMessage()!="Az email cim nem tartalmaz kukacot!")
            {
                fail("Kukac nélküli emailcím esetén az ellenőrzés rossz szövegű kivételt dob.");
            }
        }
    }
    
    @Test
    public void testEllenorzesNagybetuKukacElott() {
        System.out.println("testEllenorzesNagybetuKukacElott");
        try{
            EmailTar instance = new EmailTar("Peti@vasvari.hu");
            instance.ellenorzes();
            fail("Az ellenörzés kukac előtt nagybetű esetén nem dob kivételt!");
        }
        catch(Exception e)
        {
            if(e.getMessage()!="Az email cim kukac előtt nagybetűt tartalmaz!")
            {
                fail("Kukac előtt nagybetű és az ellenőrzés rossz szövegű kivételt dob.");
            }
        }
    }
    
    @Test
    public void testEllenorzesNagybetuKisbetuEsTobbPont() {
        System.out.println("testEllenorzesNagybetuKisbetuEsTobbPont");
        try{
            EmailTar instance = new EmailTar("peti.p.p@vasvari.hu");
            instance.ellenorzes();
            fail("Az ellenörzés kukac előtt több pont esetén nem dob kivételt!");
        }
        catch(Exception e)
        {
            if(e.getMessage()!="Az email cim kukac előtt több pontot tartalmaz!")
            {
                fail("Kukac előtt több pont és az ellenőrzés rossz szövegű kivételt dob.");
            }
        }
    }
    
    @Test
    public void testEllenorzesTokeletesEmailcim() {
        System.out.println("testEllenorzesTokeletesEmailcim");
        try{
            EmailTar instance = new EmailTar("nagy.peti@vasvari.hu");
            instance.ellenorzes();
        }
        catch(Exception e)
        {
            fail("Az ellenörző jó emailcímre kivételt dobott!");
            
        }
    }
    
}
