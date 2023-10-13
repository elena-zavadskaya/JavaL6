package ru.zavadskaya.springcourse;

import org.springframework.beans.factory.annotation.Value;

public class ClassicalMusic implements Music {
    @Value("${ClassicalMusic.name}")
    private String name;
    @Override
    public String getSong() {
        return name;
    }

}
