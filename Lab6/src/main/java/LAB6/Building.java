package LAB6;

/**
 * Клас, що представляє будівлю
 */
class Building implements Comparable<Building> {
    private String name;
    private double area;
    private int floors;

    /**
     * Конструктор класу Building
     * @param name назва будівлі
     * @param area площа забудови
     * @param floors кількість поверхів
     */
    public Building(String name, double area, int floors) {
        this.name = name;
        this.area = area;
        this.floors = floors;
    }

    public double getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "Building{name='" + name + "', area=" + area +
                ", floors=" + floors + "}";
    }

    @Override
    public int compareTo(Building other) {
        return Double.compare(this.area, other.area);
    }
}