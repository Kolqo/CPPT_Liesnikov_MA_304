package LAB6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Параметризований клас, що реалізує земельну ділянку
 * @param <T> тип об'єктів, що розміщуються на ділянці
 */
public class LandPlot<T> {
    private List<T> objects;
    private double area;
    private String address;
    private String ownerName;

    /**
     * Конструктор класу LandPlot
     * @param area площа ділянки в квадратних метрах
     * @param address адреса ділянки
     * @param ownerName власник ділянки
     */
    public LandPlot(double area, String address, String ownerName) {
        this.objects = new ArrayList<>();
        this.area = area;
        this.address = address;
        this.ownerName = ownerName;
    }

    /**
     * Додає об'єкт на ділянку
     * @param object об'єкт для розміщення
     * @return true якщо об'єкт додано успішно
     */
    public boolean addObject(T object) {
        return objects.add(object);
    }

    /**
     * Видаляє об'єкт з ділянки
     * @param object об'єкт для видалення
     * @return true якщо об'єкт видалено успішно
     */
    public boolean removeObject(T object) {
        return objects.remove(object);
    }

    /**
     * Знаходить мінімальний елемент на ділянці за заданим компаратором
     * @param comparator компаратор для порівняння елементів
     * @return мінімальний елемент або null якщо ділянка порожня
     */
    public T findMinElement(Comparator<T> comparator) {
        if (objects.isEmpty()) {
            return null;
        }
        return Collections.min(objects, comparator);
    }

    /**
     * Перевіряє наявність об'єкта на ділянці
     * @param object об'єкт для пошуку
     * @return true якщо об'єкт знайдено
     */
    public boolean containsObject(T object) {
        return objects.contains(object);
    }

    /**
     * Повертає кількість об'єктів на ділянці
     * @return кількість об'єктів
     */
    public int getObjectCount() {
        return objects.size();
    }

    /**
     * Очищає ділянку від усіх об'єктів
     */
    public void clear() {
        objects.clear();
    }

    /**
     * Повертає площу ділянки
     * @return площа в квадратних метрах
     */
    public double getArea() {
        return area;
    }

    /**
     * Повертає всі об'єкти на ділянці
     * @return список об'єктів
     */
    public List<T> getAllObjects() {
        return new ArrayList<>(objects);
    }
}