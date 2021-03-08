package Dom;


public class Fairy implements Creatures{

    Action action;
    String name;
    Place place;

    public Fairy() {
        this.name = "феи ";
        this.action = Action.Nothing;
    }

    public void startLiving(Action action){
        this.action = action;
    }

    public void setLivingPlace(Place place){
        this.place = place;
    }

    public void stopLiving(){
        this.place = Place.Nowhere;
    }

    @Override
    public String do_actions() {
        return name + action.str + "в " + place.str;
    }
}
