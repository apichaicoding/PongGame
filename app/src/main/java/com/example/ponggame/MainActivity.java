package com.example.ponggame;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Point;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mPongGame = new PongGame(this, size.x, size.y);
        setContentView(mPongGame);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPongGame.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPongGame.pause();
    }
}