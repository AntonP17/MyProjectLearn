package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(player.playMusic());

        System.out.println(player.getName());
        System.out.println(player.getVolume());
        System.out.println();
        context.close();

    }
}
