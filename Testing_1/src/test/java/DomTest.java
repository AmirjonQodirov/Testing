import Dom.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DomTest {
    Ford ford;
    Fairy fairy;
    Margarita margarita;
    Zafod zafod;

    @Before
    public void setUp(){
        fairy = new Fairy();
        ford = new Ford(fairy);
        zafod = new Zafod(ford);
        margarita = new Margarita(ford);
    }

    /*
    Ford's tests

    Глядя на открывшееся им зрелище, Форд испытывал будоражащее его волнение, но его волновало лишь то,
    что он видит незнакомую ему планету, и больше ничего.
    Разве недостаточно просто любоваться прекрасным садом,
    и не воображать при этом, что там водятся феи?
     */
    @Test
    public void testFordFeel1() {
        System.out.println("Ford's feel1 test \n");
        ford.startFeelingExcitement();
        ford.stopFeelingEveryThing();
        assertEquals(ford.feel, Feel.Nothing);
    }
    @Test
    public void testFordFeel2() {
        System.out.println("Ford's feel2 test \n");
        ford.startFeelingWorry();
        assertEquals(ford.feel2, Feel.Worried);
    }
    @Test
    public void testFordSeeingAction() {
        System.out.println("Ford's action seeing planet test \n");
        ford.startSeeingPlanet();
        assertEquals(ford.place, Place.UnfamiliarPlanet);
    }
    @Test
    public void testFordStopSeeing() {
        System.out.println("Ford's action stop seeing test \n");
        ford.stopSeeing();
        assertEquals(ford.do_actions(), "Форд не видит ничего");
    }
    @Test
    public void testFordActionNOAdmire() {
        System.out.println("Ford's action admire \n");
        ford.stopFeelingEveryThing();
        assertEquals(ford.admire(), "Форд не восхищается и не воображает");
    }
    @Test
    public void testFordActionAdmire() {
        System.out.println("Ford's action admire \n");
        ford.startAdmire();
        ford.startImagine();
        fairy.startLiving();
        fairy.setLivingPlace(Place.Garden);
        assertEquals(ford.admire(), "Форду разве недостаточно любоваться и не воображать что феи водятся в саду");
    }


    /*
    Zafod's tests

    Его раздражало то, что Зафод пытается набить себе цену.
     */
    @Test
    public void testZafodAnnoyingFord(){
        zafod.startAnnoyingFord();
        zafod.startChangPrise();
        assertEquals(zafod.do_actions(), "Фордa раздражало что Задоф набивает себе цену ");
    }
    @Test
    public void testZafodStopActions(){
        zafod.stopChangePrice();
        assertEquals(zafod.do_actions(), "Задоф не набивает себе цену");
    }


    /*
    Margarita's tests

    Вся эта чепуха о Магратее казалась Форду ребячеством.
     */
    @Test
    public void testActionMargarita(){
        margarita.startGossip();
        assertEquals(margarita.do_actions(), "Форду козалось слухи о Маргарита ребячество ");
    }
    @Test
    public void testStoppingGossipMargarita(){
        margarita.stopGossip();
        assertEquals(margarita.do_actions(), "О Маргарите нет слухов");
    }


    /*
    Fairy's tests

    Разве недостаточно просто любоваться прекрасным садом,
    и не воображать при этом, что там водятся феи?
     */
    @Test
    public void testFairyLiving(){
        fairy.startLiving();
        assertEquals(fairy.action, Action.Living);
    }
    @Test
    public void testFairySetLivingPlace(){
        fairy.startLiving();
        fairy.setLivingPlace(Place.Garden);
        assertEquals(fairy.do_actions(), "феи водятся в саду");
    }
    @Test
    public void testFairyStopLiving(){
        fairy.stopLiving();
        assertEquals(fairy.place, Place.Nowhere);
    }

}
