package Dom;

public class Ford implements Human {
    String name;
    Feel feel;
    Feel feel2;
    Place place;
    Place place2;
    Action action;
    Fairy fairy;
    Action action2;
    Action action3;


    public Ford() {
        this.name = "Форд";
        this.feel = Feel.Excitement;
        this.place = Place.UnfamiliarPlanet;
        this.action = Action.Looking;
        this.place2 = Place.Nothing;
        this.feel2 = Feel.Worried;
        this.fairy = new Fairy();
        this.action2 = Action.Admire;
        this.action3 = Action.Imagine;
    }

    public String admire(){
        return name + "у разве недостаточно " +  action2.str + "и не " + action3.str + "что " + fairy.do_actions();
    }

    @Override
    public String do_actions() {
        return name + " " + feel.str + "но его " + feel2.str + "что он " + action.str + place.str + " и больше " + place2.str;
    }
}
