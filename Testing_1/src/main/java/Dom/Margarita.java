package Dom;

public class Margarita implements Human {
    String name;
    Ford ford;
    Feel feel;

    public Margarita(Ford ford) {
        this.name = "Маргарита ";
        this.ford = ford;
    }

    public void startGossip() {
        this.feel = Feel.Childish;
    }


    @Override
    public String do_actions() {
        if (feel == null) {
            return "О Маргарите нет слухов";
        } else {
            return ford.name + "у козалось слухи о " + name + feel.str;
        }
    }
}
