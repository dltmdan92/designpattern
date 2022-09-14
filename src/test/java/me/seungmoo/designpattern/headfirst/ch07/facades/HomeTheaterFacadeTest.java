package me.seungmoo.designpattern.headfirst.ch07.facades;

import me.seungmoo.designpattern.headfirst.ch07.theater.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTheaterFacadeTest {

    @Test
    @DisplayName("퍼사드 패턴 테스트")
    void testDrive() {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new StreamingPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        homeTheaterFacade.watchMovie("인다아나 존스:레이더스");
        homeTheaterFacade.endMovie();
    }

}