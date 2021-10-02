package AirlineEmployee;

import Enums.Rank;

public abstract class AirlineEmployee {

    private String name;
    private Rank rank;

    public AirlineEmployee(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank(){
        return this.rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }


}
