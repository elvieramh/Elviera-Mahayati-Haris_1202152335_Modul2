package android.example.com.myfood;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                    Intent x = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(x);
                    finish();
            }
        },2500); //Script ini berguna untuk mengatur lamanya splashscreen akan tampil selama 2,5 detik
    }


}
