package me.seungmoo.designpattern.headfirst.ch07.facades;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch07.theater.*;

/**
 * 퍼사드 패턴
 * 여러가지 하위 시스템들을 조합 및 구성하여
 * 클라이언트가 사용하기 편한 API를 제공한다.
 *
 * 클라이언트는 퍼사드 클래스를 호출하고
 * 세부 로직은 퍼사드 클래스가 알아서 처리하는 식으로 담당한다.
 */
@RequiredArgsConstructor
public class HomeTheaterFacade {
    private final Amplifier amp;
    private final Tuner tuner;
    private final StreamingPlayer player;
    private final Projector projector;
    private final TheaterLights lights;
    private final Screen screen;
    private final PopcornPopper popper;

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비 중");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("홈시어터를 끄는 중");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
