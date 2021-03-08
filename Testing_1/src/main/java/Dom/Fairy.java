package Dom;


public class Fairy implements Creatures{

    public Action action;
    public String name;
    public Place place;

    public Fairy() {
        this.name = "феи ";
        this.action = Action.Nothing;
    }

    public void startLiving(){
        this.action = Action.Living;
    }

    public void setLivingPlace(Place place){
        this.place = place;
    }

    public void stopLiving(){
        this.place = Place.Nowhere;
        this.action  = Action.Nothing;
    }

    @Override
    public String do_actions() {
        return name + action.str + "в " + place.str;
    }
}
