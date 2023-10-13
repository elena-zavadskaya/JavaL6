package ru.zavadskaya.springcourse;

import org.springframework.beans.factory.annotation.Value;

public class RapMusic implements Music {
    @Value("${RapMusic.name}")
    private String name;
    @Override
    public String getSong() {
        return name;
    }
}
