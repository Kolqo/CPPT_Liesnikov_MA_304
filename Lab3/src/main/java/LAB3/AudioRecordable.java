package LAB3;

import java.io.IOException;

/**
 * Інтерфейс {@code AudioRecordable} представляє пристрої, здатні записувати аудіо.
 * Класи, що реалізують цей інтерфейс, повинні надавати методи для початку, зупинки та збереження запису.
 */
interface AudioRecordable {

    /**
     * Починає запис аудіо.
     *
     * @throws IOException якщо виникає помилка введення/виведення під час початку запису.
     */
    void startRecording() throws IOException;

    /**
     * Зупиняє запис аудіо.
     *
     * @throws IOException якщо виникає помилка введення/виведення під час зупинки запису.
     */
    void stopRecording() throws IOException;

    /**
     * Зберігає записане аудіо у файл.
     *
     * @param filename назва файлу, куди буде збережено запис.
     * @throws IOException якщо виникає помилка введення/виведення під час збереження запису.
     */
    void saveRecording(String filename) throws IOException;
}
