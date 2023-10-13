package ru.zavadskaya.springcourse;

import org.springframework.beans.factory.annotation.Value;

public class RockMusic implements Music {
    @Value("${RockMusic.name}")
    private String name;
    @Override
    public String getSong() {
        return name;
    }
}
