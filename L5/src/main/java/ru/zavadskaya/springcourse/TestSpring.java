package ru.zavadskaya.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();
    }
}

/*
Создать новый вариант проекта или перенести старый на JavaConfig.
То есть ваш проект должен подтягивать конфигурацию Bean из java файла, а не из файла xml.
Бины должны создаваться через фабричный метод.
Одному из бинов(например музыкальному плееру) нужно добавить методы при создании объекта и при удалении объекта(логика может быть просто вывод)
Один бин нужно сделать именованным и в main обратиться по имени.
 */
