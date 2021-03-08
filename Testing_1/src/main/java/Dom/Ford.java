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


    public Ford(Fairy fairy) {
        this.name = "Форд";
        this.place2 = Place.Nothing;
        this.fairy = fairy;
    }

    public void startAdmire(){
        this.action2 = Action.Admire;
    }
    public void startImagine(){
        this.action3 = Action.Imagine;
    }

    public void startSeeingPlanet(){
        this.action = Action.Looking;
        this.place = Place.UnfamiliarPlanet;
    }

    public void stopSeeing(){
        this.action = Action.Nothing;
        this.place = place2;
    }

    public void startFeelingExcitement(){
        this.feel = Feel.Excitement;
    }

    public void startFeelingWorry(){
        this.feel2 = Feel.Worried;
    }

    public void stopFeelingEveryThing(){
        this.feel = Feel.Nothing;
    }


    public String admire(){
        if(action2==Action.Admire && action3 == Action.Imagine){
            return name + "у разве недостаточно " +  action2.str + "и не " + action3.str + "что " + fairy.do_actions();
        }else{
            return "Форд не восхищается и не воображает";
        }
    }

    @Override
    public String do_actions() {
        if(feel == Feel.Excitement && feel2==Feel.Worried && action==Action.Nothing && place==Place.UnfamiliarPlanet){
            return name + " " + feel.str + "но его " + feel2.str + "что он " + action.str + place.str + " и больше " + place2.str;
        }else if (this.action == Action.Nothing && this.place == Place.Nothing){
            return "Форд не видит ничего";
        }else if (this.feel == Feel.Nothing){
            return "Форд нечего не чувствует";
        }else{
            return "Форд что то делает";
        }
    }
}
