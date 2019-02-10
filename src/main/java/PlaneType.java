public enum PlaneType {

    BOEING747(50, 300),
    AIRBUS300(45, 280),
    HAWKER400(5, 100),
    CESSNA172(2, 20);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
