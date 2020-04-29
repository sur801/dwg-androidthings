/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.androidthings.education.mtg;
import android.util.Log;
import android.view.ViewDebug;
import android.app.Activity;
import java.util.Random;
import android.graphics.*;
import android.os.*;

import android.view.ViewDebug;
import android.widget.ImageView;
import android.widget.LinearLayout;


import static com.google.androidthings.education.mtg.Led.CYAN;
import static com.google.androidthings.education.mtg.MusicPlayer.Note;
import static com.google.androidthings.education.mtg.Led.ALL;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.A;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.E;
import static com.google.androidthings.education.mtg.MusicPlayer.Note.G;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private Led light;
    private Display display;
    private MusicPlayer music;
    private MyDevice myDevice;
    int res;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        final ImageView imgview = (ImageView)findViewById(R.id.random);


        display = new Display();
        music = new MusicPlayer();
        light = new Led();
        myDevice = new MyDevice(display, music, light);
        if (light.open() && display.open() && music.open()) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable(){
                        @Override
                        public void run() {

                            Random random = new Random();
                            res = random.nextInt(3);

                            String r = Integer.toString(res);
                            myDevice.가위바위보();

                            if(res == 0) {
                                imgview.setImageResource(R.drawable.rock);
                            }
                            else if(res == 1) {
                                imgview.setImageResource(R.drawable.scissor);
                            }
                            else {
                                imgview.setImageResource(R.drawable.paper);
                            }

                            //myDevice.내코드();
                            //myDevice.sing();
                            //light.on(2,CYAN);
                            //music.play(Note.A);
                            //music.stop();
                        }
                    });
                }
            }).start();
        } else {
            finish();
        }

    }







    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        light.close();
        display.close();
        music.close();
    }
}
