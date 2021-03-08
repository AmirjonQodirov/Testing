package Dom;

public class Margarita implements Human {
    public String name;
    public Ford ford;
    public Feel feel;

    public Margarita(Ford ford) {
        this.name = "Маргарита ";
        this.ford = ford;
    }

    public void startGossip() {
        this.feel = Feel.Childish;
    }

    public void stopGossip() {
        this.feel = null;
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
