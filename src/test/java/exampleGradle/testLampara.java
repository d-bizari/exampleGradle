package exampleGradle;

import org.junit.Assert;
import org.junit.Test;

public class testLampara {
    @Test
    public void testLamparaSeEnciende(){
        Lampara lampara = new Lampara();

        Assert.assertTrue(lampara.encender());
    }

    @Test
    public void testLamparaSeApaga(){
        Lampara lampara = new Lampara();

        Assert.assertTrue(!lampara.apagar());
    }
}
