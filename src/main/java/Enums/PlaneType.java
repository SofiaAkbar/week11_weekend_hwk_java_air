package Enums;

public enum PlaneType {

    BOEING474(500, 30000),
    AIRBUS(2, 25000),
    LEARJET23(300, 18000),
    CIRRUSSR22(280, 15000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
