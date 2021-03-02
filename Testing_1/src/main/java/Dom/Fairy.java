package Dom;


public class Fairy implements Creatures{

    Action action;
    String name;
    Place place;

    public Fairy() {
        this.name = "феи ";
        this.action = Action.Living;
        this.place = Place.Garden;
    }


    @Override
    public String do_actions() {
        return name + action.str + "в " + place.str;
    }
}
