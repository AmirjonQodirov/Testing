import Dom.Fairy;
import Dom.Ford;
import Dom.Margarita;
import Dom.Zafod;
import org.junit.Assert;
import org.junit.Test;

public class DomTest {

    @Test
    public void testFord() {
        System.out.println("Ford's test \n");
        Ford ford = new Ford();
        Assert.assertEquals(ford.do_actions(), "Форд испытывал будоражащее его волнение но его волнавало что он видит незнакомую планету и больше нечего");
        Assert.assertEquals(ford.admire(), "Форду разве недостаточно любоваться и не воображать что феи водятся в саду");
    }

    @Test
    public void testFairy() {
        System.out.println("Fairy's test \n");
        Fairy fairy = new Fairy();
        Assert.assertEquals(fairy.do_actions(), "феи водятся в саду");
    }

    @Test
    public void testMargarita() {
        System.out.println("Margarita's test \n");
        Margarita margarita = new Margarita();
        Assert.assertEquals(margarita.do_actions(), "Форду козалось слухи о Маргарита ребячество ");
    }

    @Test
    public void testZafod() {
        System.out.println("Zafod's test \n");
        Zafod zafod = new Zafod();
        Assert.assertEquals(zafod.do_actions(), "Фордa раздражало что Задоф набивает себе цену ");
    }
}
