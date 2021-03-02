package Dom;

public class Zafod implements Human{

    String name;
    Ford ford;
    Feel feel;
    Action action;

    public Zafod() {
        this.name = "Задоф ";
        this.action = Action.ChargePrice;
        this.ford = new Ford();
        this.feel = Feel.Annoy;

    }

    @Override
    public String do_actions() {
        return ford.name + "a " + feel.str + "что " + name + action.str;
    }
}

