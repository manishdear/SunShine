package com.unofficialcoder.sunshine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeatherData = findViewById(R.id.tv_weather_data);

        String[] weatherData = {"Haaa", "Huuuu"};

        for (String data: weatherData){
            mWeatherData.append(data +"\n\n\n");
        }
    }
}
