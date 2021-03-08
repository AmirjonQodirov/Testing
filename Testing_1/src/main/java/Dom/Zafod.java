package Dom;

public class Zafod implements Human{

    String name;
    Ford ford;
    Feel feel;
    Action action;

    public Zafod(Ford ford) {
        this.name = "Задоф ";
        this.ford = ford;
    }

    public void startChangPrise(){
        this.action = Action.ChargePrice;
    }

    public void startAnnoyingFord(){
        this.feel = Feel.Annoy;
    }


    @Override
    public String do_actions() {
        if(feel == Feel.Annoy && action == Action.ChargePrice){
            return ford.name + "a " + feel.str + "что " + name + action.str;
        }else if(action != Action.ChargePrice){
            return "Задоф не набивает себе цену";
        }else{
            return ford.name + "a не раздражало что " + name + action.str;
        }
    }
}

