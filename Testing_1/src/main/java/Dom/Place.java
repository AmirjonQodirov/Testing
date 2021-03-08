package Dom;

public enum Place {

    UnfamiliarPlanet("незнакомую планету"),
    Nothing("нечего"),
    Nowhere("нигде"),
    Garden("саду");


    String str;
    Place(String str){
        this.str = str;
    }
}
