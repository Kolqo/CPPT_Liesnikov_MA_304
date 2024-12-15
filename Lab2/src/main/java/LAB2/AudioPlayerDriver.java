package LAB2;

import java.io.IOException;

/**
 * Клас AudioPlayerDriver є точкою входу в програму.
 * Він демонструє основні операції з аудіоплеєром шляхом виклику різних методів.
 */
public class AudioPlayerDriver {
    /**
     * Точка входу в програму. Демонструє роботу з телевізором шляхом виклику різних методів.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        try {
            AudioPlayer audioPlayer = new AudioPlayer();

            audioPlayer.addTrack(new Track("Пісня 1", "Виконавець 1", 180));
            audioPlayer.addTrack(new Track("Пісня 2", "Виконавець 3", 180));
            audioPlayer.addTrack(new Track("Пісня 3", "Виконавець 1", 180));
            audioPlayer.play();
            audioPlayer.nextTrack();
            audioPlayer.previousTrack();
            audioPlayer.changeVolume(23);
            audioPlayer.chargeBattery(10);
            audioPlayer.findTrack("Пісня 1");
            audioPlayer.createRandomPlaylist(2);
            audioPlayer.stop();
            audioPlayer.removeTrack("Пісня 3");

            audioPlayer.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}
