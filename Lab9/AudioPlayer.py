class AudioPlayer:
    """
    Базовий клас AudioPlayer представляє функціональність аудіоплеєра.
    """

    def __init__(self, name, supported_formats, storage_capacity):
        """
        Ініціалізує аудіоплеєр.

        :param name: Назва аудіоплеєра.
        :param supported_formats: Список підтримуваних форматів файлів.
        :param storage_capacity: Ємність пам'яті у мегабайтах.
        """
        self.name = name
        self.supported_formats = supported_formats
        self.storage_capacity = storage_capacity
        self.is_on = False
        self.volume = 50  # Гучність від 0 до 100
        self.is_playing = False
        self.current_track = None

    def turn_on(self):
        """
        Увімкнення аудіоплеєра.
        """
        self.is_on = True
        print(f"Аудіоплеєр {self.name} увімкнено.")

    def turn_off(self):
        """
        Вимкнення аудіоплеєра.
        """
        self.is_on = False
        self.is_playing = False
        self.current_track = None
        print(f"Аудіоплеєр {self.name} вимкнено.")

    def play(self, track_name):
        """
        Відтворює аудіотрек.

        :param track_name: Назва треку.
        """
        if not self.is_on:
            print("Аудіоплеєр вимкнений!")
            return

        if self.is_playing:
            print("Уже виконується відтворення.")
            return

        self.current_track = track_name
        self.is_playing = True
        print(f"Відтворення треку: {track_name}")

    def stop(self):
        """
        Зупиняє відтворення.
        """
        if self.is_playing:
            print(f"Відтворення треку {self.current_track} зупинено.")
            self.is_playing = False
            self.current_track = None
        else:
            print("Відтворення не виконується.")

    def increase_volume(self):
        """
        Збільшує гучність.
        """
        if self.volume < 100:
            self.volume += 10
            print(f"Гучність збільшено: {self.volume}")
        else:
            print("Гучність вже на максимумі.")

    def decrease_volume(self):
        """
        Зменшує гучність.
        """
        if self.volume > 0:
            self.volume -= 10
            print(f"Гучність зменшено: {self.volume}")
        else:
            print("Гучність вже на мінімумі.")

    def get_status(self):
        """
        Повертає статус аудіоплеєра.
        """
        power_status = "увімкнений" if self.is_on else "вимкнений"
        playback_status = f"відтворює {self.current_track}" if self.is_playing else "не відтворює"
        return f"Плеєр {self.name}: {power_status}, {playback_status}, гучність: {self.volume}"