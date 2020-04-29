package com.google.androidthings.education.mtg;


import android.util.Log;

import java.util.Random;

import static com.google.androidthings.education.mtg.Led.ALL;
import static com.google.androidthings.education.mtg.Led.BLUE;
import static com.google.androidthings.education.mtg.Led.CYAN;
import static com.google.androidthings.education.mtg.Led.GREEN;
import static com.google.androidthings.education.mtg.Led.ORANGE;
import static com.google.androidthings.education.mtg.Led.RED;
import static com.google.androidthings.education.mtg.Led.VIOLET;
import static com.google.androidthings.education.mtg.Led.WHITE;
import static com.google.androidthings.education.mtg.Led.YELLOW;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.A;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.B;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.C;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.D;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.E;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.F;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.G;


/**
 * My Device!
 */

public class MyDevice {
    private static final String TAG = MyDevice.class.getSimpleName();

    private Led light;
    private Display display;
    private MusicPlayer music;

    public MyDevice(Display display, MusicPlayer music, Led light) {
        this.display = display;
        this.music = music;
        this.light = light;
    }

    public static void pause(double pauseTimeSec) {
        try {
            Thread.sleep((long)(pauseTimeSec * 1000.0));
        } catch (InterruptedException e) {
            Log.e(TAG, "Failed to sleep", e);
        }
    }

    /** 여기서부터 시작 */

    public void 내코드() {

        // 1. 디스플레이 코딩. 주의: 네 글자 영어 혹은 숫자만 가능
        가위바위보();

        //얼레리꼴레리();
        // 2. 불 코딩
        // light.on(1);
        // light.on(2, CYAN);

        // 3. 음악
        // music.play(C);

         //데모();
        // 예제();
    }

    void 가위바위보 () {
        music.play(A);
        pause(0.3);
        music.stop();
        music.play(A);
        pause(0.2);
        music.stop();
        music.play(A);
        pause(0.25);
        music.stop();
        music.play(A);
        pause(0.25);
        music.stop();
        music.play(A);
        pause(0.3);
        music.stop();
        music.play(G);
        pause(0.35);
        music.play(A);
        display.show("SCIS");
        pause(0.2);
        display.clear();
        music.play(G);
        pause(0.2);
        music.play(E);
        display.show("ROCK");
        pause(0.2);
        display.clear();
        music.play(G);
        pause(0.2);
        music.play(A);
        display.show("PAPE");
        pause(0.35);
        music.stop();
    }

    void 얼레리꼴레리 (){
        music.play(A);
        pause(0.2);
        music.stop();
        music.play(B);
        pause(0.25);
        music.stop();
        music.play(G);
        pause(0.3);
        music.stop();
        music.play(A);
        pause(0.2);
        music.stop();
        music.play(A);
        pause(0.25);
        music.stop();
        music.play(G);
        pause(0.3);
        music.stop();
        music.play(E);
        pause(0.2);
        music.stop();
        music.play(E);
        pause(0.25);
        music.stop();
        music.play(D);
        pause(0.3);
        music.stop();
        music.play(E);
        pause(0.2);
        music.stop();
        music.play(E);
        pause(0.25);
        music.stop();
        music.play(D);
        pause(0.3);
        music.stop();

    }

    void 예제() {
        // two arguments
        light.on(ALL, RED);

        // 도레미파솔
        music.play(C);
        pause(0.5);
        music.stop();
        music.play(D);
        pause(1);
        music.stop();
        music.play(E);
        pause(1);
        music.stop();
        music.play(F);
        pause(1);
        music.stop();
        music.play(G);
        pause(1);
        music.stop();

        // Simple show
        display.show("LOVE");
        pause(3);
        display.clear();
    }

    // DEMO 코드
    void 데모() {
        light.on(0, RED);
        light.on(1, ORANGE);
        light.on(2, YELLOW);
        light.on(3, GREEN);
        light.on(4, CYAN);
        light.on(5, BLUE);
        light.on(6, VIOLET);
        pause(1);

        light.on(0, WHITE);
        light.on(1, RED);
        light.on(2, ORANGE);
        light.on(3, YELLOW);
        light.on(4, GREEN);
        light.on(5, CYAN);
        light.on(6, BLUE);
        pause(1);

        light.on(0, WHITE);
        light.on(1, WHITE);
        light.on(2, RED);
        light.on(3, ORANGE);
        light.on(4, YELLOW);
        light.on(5, GREEN);
        light.on(6, BLUE);
        pause(1);

        light.on(0, WHITE);
        light.on(1, WHITE);
        light.on(2, WHITE);
        light.on(3, RED);
        light.on(4, ORANGE);
        light.on(5, YELLOW);
        light.on(6, GREEN);
        pause(1);

        light.on(0, WHITE);
        light.on(1, WHITE);
        light.on(2, WHITE);
        light.on(3, WHITE);
        light.on(4, RED);
        light.on(5, ORANGE);
        light.on(6, YELLOW);
        pause(1);

        light.on(0, WHITE);
        light.on(1, WHITE);
        light.on(2, WHITE);
        light.on(3, WHITE);
        light.on(4, WHITE);
        light.on(5, RED);
        light.on(6, ORANGE);
        pause(1);

        light.on(0, WHITE);
        light.on(1, WHITE);
        light.on(2, WHITE);
        light.on(3, WHITE);
        light.on(4, WHITE);
        light.on(5, WHITE);
        light.on(6, RED);
        pause(1);

        light.on(ALL, WHITE);
        pause(1);

        display.show("NABI");
        pause(1);

        display.show("ABIY");
        pause(0.5);

        display.show("BIYA");
        pause(0.5);

        music.playAll(0.5,
                G, E, E, E, F, D, D, D, C, D, E, F, G, G, G, G,
                G, E, E, E, F, D, D, D, C, E, G, G, E, E, E, E);
    }

    void musicAndLight(MusicPlayer.Note note) {
        int diff = note.value - C.value;
        light.on(diff, WHITE);
        music.play(note);
        pause(1);
        light.off(diff);
        music.stop();
    }
}
