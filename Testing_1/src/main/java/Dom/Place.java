package Dom;

public enum Place {

    UnfamiliarPlanet("незнакомую планету"),
    Nothing("нечего"),
    Garden("саду");


    String str;
    Place(String str){
        this.str = str;
    }
}
