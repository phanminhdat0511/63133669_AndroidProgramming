package ntu_63133669.cau2_appvatly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnSpeed, btnTime, btnDistance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimView();
        btnDistance.setOnClickListener(moveDistance);
        btnSpeed.setOnClickListener(moveSpeed);
        btnTime.setOnClickListener(moveTime);
    }

    View.OnClickListener moveSpeed = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SpeedActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener moveTime = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TimeActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener moveDistance = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, DistanceActivity.class);
            startActivity(intent);
        }
    };

    void TimView(){
        btnSpeed = (Button) findViewById(R.id.speed);
        btnTime = (Button) findViewById(R.id.time);
        btnDistance = (Button) findViewById(R.id.distance);
    }
}