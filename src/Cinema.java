public class Cinema {

    private String name;
    private String location;
    private int capacity;

    public Cinema(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    public int getCapacity() {
        return capacity;
    }

    public void displayInfo() {
        System.out.println("Кинотеатр: " + name);
        System.out.println("Место: " + location);
        System.out.println("Вместимость: " + capacity);
    }
}
