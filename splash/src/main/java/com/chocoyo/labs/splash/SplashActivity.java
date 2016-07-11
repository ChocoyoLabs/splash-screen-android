package com.chocoyo.labs.splash;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // set status bar color
        setStatusBarColor();

        // set logo
        setLogo();

        // open activity
        String className = getString(R.string.chocoyo_labs_splash_class_name);
        BackgroundTask backgroundTask = new BackgroundTask(this, className);
        backgroundTask.execute();
    }

    private void setStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            // set colorPrimaryDark
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.white));
        }
    }

    private void setLogo() {
        // get drawable name from strings.xml
        String drawableName = getString(R.string.chocoyo_labs_splash_drawable_name);

        // get id from resource based drawable name
        int id = getResources().getIdentifier(drawableName, "drawable", getPackageName());

        // instance Drawable based id
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), id, null);

        // instance ImageView from layout
        ImageView imageView = (ImageView) findViewById(R.id.chocoyo_labs_splash_logo);

        // set Drawable to imageView
        imageView.setImageDrawable(drawable);
    }

}
