package app.SR;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button contButton = (Button)findViewById(R.id.cont_button);

        if(contButton != null){
            contButton.setOnClickListener((View.OnClickListener)(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                }
            }));
        }
    }
}