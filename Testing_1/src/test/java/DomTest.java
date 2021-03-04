import Dom.Fairy;
import Dom.Ford;
import Dom.Margarita;
import Dom.Zafod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DomTest {
    Ford ford;
    Fairy fairy;
    Margarita margarita;
    Zafod zafod;

    @Before
    public void setUp(){
        ford = new Ford();
        margarita = new Margarita();
        zafod = new Zafod();
        fairy = new Fairy();
    }

    @Test
    public void testFord() {
        System.out.println("Ford's test \n");
        Assert.assertEquals(ford.do_actions(), "Форд испытывал будоражащее его волнение но его волнавало что он видит незнакомую планету и больше нечего");
        Assert.assertEquals(ford.admire(), "Форду разве недостаточно любоваться и не воображать что феи водятся в саду");
    }

    @Test
    public void testFairy() {
        System.out.println("Fairy's test \n");
        Assert.assertEquals(fairy.do_actions(), "феи водятся в саду");
    }

    @Test
    public void testMargarita() {
        System.out.println("Margarita's test \n");
        Assert.assertEquals(margarita.do_actions(), "Форду козалось слухи о Маргарита ребячество ");
    }

    @Test
    public void testZafod() {
        System.out.println("Zafod's test \n");
        Assert.assertEquals(zafod.do_actions(), "Фордa раздражало что Задоф набивает себе цену ");
    }
}
