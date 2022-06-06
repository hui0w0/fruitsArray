package sg.edu.rp.c346.id21016163.fruits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";


        String text = "Fruits\n";
        text += "=====\n";

        for(int x = 0; x < fruits.length; x++){
            text += fruits[x] + "\n";
        }
        tv.setText(text);

    }
}