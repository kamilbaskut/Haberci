package tr.daily.all.news.mobilApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
//uygulama açıldıktan sonra gösterilen ekran . oncreate -> on start 200ms mainactivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


    }

    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //do something
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();

            }
        }, 2000 );//time in milisecond
    }
}
