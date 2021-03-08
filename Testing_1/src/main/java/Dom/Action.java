package Dom;

public enum Action {

    Looking("видит "),
    Admire("любоваться "),
    Living("водятся "),
    Nothing("нечего"),
    Imagine("воображать "),
    ChargePrice("набивает себе цену ");

    String str;
    Action(String str){
        this.str=str;
    }

}
