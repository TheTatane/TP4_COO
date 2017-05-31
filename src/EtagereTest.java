import org.testng.annotations.Test;


import static org.junit.Assert.*;

/**
 * Created by tatane on 31/05/2017.
 */
public class EtagereTest {

    @Test
    public void testAjouterDocument() throws Exception {

        Etagere E1 = new Etagere();
        Manuel M1 = new Manuel(1,"Toto en Amérique","Paolo",242,5);
        E1.ajouterDocument(M1);

        assertEquals(1, E1.getTailleOccupé());
    }
}