package Dom;

public class Margarita implements Human{
    String name;
    Ford ford;
    Feel feel;

    public Margarita() {
        this.name = "Маргарита ";
        this.ford = new Ford();
        this.feel = Feel.Childish;
    }

    @Override
    public String do_actions() {
        return ford.name + "у козалось слухи о " + name + feel.str;
    }
}
