# splash-screen-android
Chocoyo Labs Android Library for Splash Screen

Add to **AndroidManifest.xml**.

    <activity
      android:name="com.chocoyo.labs.splash.SplashActivity"
      android:configChanges="keyboardHidden|orientation"
      android:theme="@style/AppTheme.NoActionBar">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity>

Add to **styles.xml**

    <style name="AppTheme.NoActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
    </style>

Add to **strings.xml**

    <string name="chocoyo_labs_splash_class_name">you.pachkage.MainActivity</string>
