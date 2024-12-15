from VoiceRecorder import VoiceRecorder

if __name__ == "__main__":
    # Створюємо диктофон
    recorder = VoiceRecorder("Sony Zoom H1", ["MP3", "WAV"], 128, 10)

    # Перевіряємо початковий статус
    print("\n1. Початковий статус:")
    print(recorder.get_status())

    # Вмикаємо диктофон
    print("\n2. Вмикаємо диктофон:")
    recorder.turn_on()

    # Відтворюємо музику
    print("\n3. Відтворення музики:")
    recorder.play("audio_track.mp3")

    # Запис голосу
    print("\n4. Запис голосу:")
    recorder.start_recording("lecture.wav")

    # Зупиняємо запис
    print("\n5. Зупинення запису:")
    recorder.stop_recording()

    # Переглядаємо збережені файли
    print("\n6. Список записаних файлів:")
    print(recorder.list_recorded_files())

    # Видаляємо файл
    print("\n7. Видалення запису:")
    recorder.delete_recording("lecture.wav")

    # Збільшуємо гучність
    print("\n8. Збільшення гучності:")
    recorder.increase_volume()

    # Зупиняємо відтворення
    print("\n9. Зупинка відтворення:")
    recorder.stop()

    # Вимикаємо диктофон
    print("\n10. Вимикаємо диктофон:")
    recorder.turn_off()
    print(recorder.get_status())