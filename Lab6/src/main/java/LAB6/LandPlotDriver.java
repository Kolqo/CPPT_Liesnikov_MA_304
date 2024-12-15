package LAB6;

/**
 * Клас-драйвер для демонстрації роботи класу LandPlot.
 * Цей клас містить метод main, який демонструє функціональність класу LandPlot для зберігання будівель і рослин.
 *
 * @version 1.0
 */
public class LandPlotDriver {

    /**
     * Головний метод програми.
     * Створює ділянки для будівель та рослин, додає до них об'єкти,
     * виконує пошук об'єктів з найменшими характеристиками,
     * а також демонструє можливості видалення та перевірки наявності об'єктів.
     *
     * @param args масив рядків, який може містити аргументи командного рядка (не використовується)
     */
    public static void main(String[] args) {
        // Створюємо ділянку для будівель
        LandPlot<Building> buildingPlot = new LandPlot<>(1000.0, "Main Street 1", "John Doe");

        // Додаємо будівлі
        buildingPlot.addObject(new Building("House", 150.0, 2));
        buildingPlot.addObject(new Building("Garage", 50.0, 1));
        buildingPlot.addObject(new Building("Shed", 20.0, 1));

        // Знаходимо будівлю з найменшою площею
        Building minBuilding = buildingPlot.findMinElement(Building::compareTo);
        System.out.println("Будівля з найменшою площею: " + minBuilding);

        // Створюємо ділянку для рослин
        LandPlot<Plant> gardenPlot = new LandPlot<>(500.0, "Garden Avenue 5", "Jane Smith");

        // Додаємо рослини
        gardenPlot.addObject(new Plant("Oak", 10.5, 50));
        gardenPlot.addObject(new Plant("Apple Tree", 4.2, 15));
        gardenPlot.addObject(new Plant("Pine", 8.7, 30));

        // Знаходимо найнижчу рослину
        Plant minPlant = gardenPlot.findMinElement(Plant::compareTo);
        System.out.println("Найнижча рослина: " + minPlant);

        // Демонструємо інші методи
        System.out.println("Кількість будівель на ділянці: " + buildingPlot.getObjectCount());
        System.out.println("Площа будівельної ділянки: " + buildingPlot.getArea() + " м²");

        // Видаляємо об'єкт
        buildingPlot.removeObject(minBuilding);
        System.out.println("Кількість будівель після видалення: " + buildingPlot.getObjectCount());

        // Перевіряємо наявність рослини
        Plant searchPlant = new Plant("Oak", 10.5, 50);
        System.out.println("Наявність дуба на ділянці: " + gardenPlot.containsObject(searchPlant));
    }
}