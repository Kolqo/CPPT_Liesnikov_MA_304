package LAB6;

/**
 * Клас, що представляє рослину
 */
class Plant implements Comparable<Plant> {
    private String species;
    private double height;
    private int age;

    /**
     * Конструктор класу Plant
     * @param species вид рослини
     * @param height висота рослини в метрах
     * @param age вік рослини в роках
     */
    public Plant(String species, double height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Plant{species='" + species + "', height=" + height +
                ", age=" + age + "}";
    }

    @Override
    public int compareTo(Plant other) {
        return Double.compare(this.height, other.height);
    }
}
