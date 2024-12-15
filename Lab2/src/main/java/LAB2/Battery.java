package LAB2;

/**
 * Клас Battery представляє батарею, яка має можливість заряджатися і відображати рівень заряду.
 */
public class Battery {
    private int charge;

    /**
     * Конструктор за замовчуванням, який ініціалізує заряд на рівні 100.
     */
    public Battery() {
        this.charge = 100;
    }

    /**
     * Конструктор, який ініціалізує заряд з заданим значенням.
     * Заряд обмежується діапазоном від 0 до 100.
     * @param capacity початковий рівень заряду
     */
    public Battery(int capacity) {
        this.charge = Math.max(0, Math.min(100, capacity));
    }

    /**
     * Заряджає батарею на задану кількість.
     * Заряд не перевищує 100.
     * @param amount кількість заряду для додавання
     */
    public void charge(int amount) {
        this.charge = Math.min(100, this.charge + amount);
    }

    /**
     * Повертає поточний рівень заряду батареї.
     * @return рівень заряду батареї
     */
    public int getCharge() {
        return charge;
    }
}
