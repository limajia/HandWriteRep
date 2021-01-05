package com.docker.handwrite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.docker.handwrite.handeventbus.EventBusActivity;

/**
 * @author docker
 */
public class MainActivity extends AppCompatActivity {

    private Button mEventBusBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEventBusBtn = findViewById(R.id.event_bus_btn);
        //1.handEventBus
        mEventBusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventBusActivity.class);
                startActivity(intent);
            }
        });
    }
}