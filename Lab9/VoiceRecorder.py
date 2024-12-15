from AudioPlayer import AudioPlayer


class VoiceRecorder(AudioPlayer):
    """
    Клас VoiceRecorder розширює функціональність аудіоплеєра,
    додаючи можливість запису голосу.
    """

    def __init__(self, name, supported_formats, storage_capacity, max_recordings):
        """
        Ініціалізує диктофон.

        :param name: Назва диктофона.
        :param supported_formats: Список підтримуваних форматів файлів.
        :param storage_capacity: Ємність пам'яті у мегабайтах.
        :param max_recordings: Максимальна кількість записів.
        """
        super().__init__(name, supported_formats, storage_capacity)
        self.max_recordings = max_recordings
        self.recordings = []

    def start_recording(self, file_name):
        """
        Починає запис голосу.

        :param file_name: Ім'я файлу запису.
        """
        if len(self.recordings) >= self.max_recordings:
            print("Недостатньо місця для нового запису!")
            return

        print(f"Запис розпочато: {file_name}")
        self.recordings.append(file_name)

    def stop_recording(self):
        """
        Зупиняє запис голосу.
        """
        print("Запис зупинено.")

    def list_recorded_files(self):
        """
        Повертає список записаних файлів.
        """
        return self.recordings if self.recordings else "Немає записаних файлів."

    def delete_recording(self, file_name):
        """
        Видаляє записаний файл.

        :param file_name: Ім'я файлу для видалення.
        """
        if file_name in self.recordings:
            self.recordings.remove(file_name)
            print(f"Файл {file_name} видалено.")
        else:
            print(f"Файл {file_name} не знайдено.")

