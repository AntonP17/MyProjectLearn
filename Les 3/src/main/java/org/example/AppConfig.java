package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Попробовал через анотации , создал вот класс чтобы он определял биныы
@Configuration
public class AppConfig {

    // бин для рок музыки
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    // бин для музыкального плеера
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic());
    }
}