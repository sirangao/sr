package app.SR;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private ArrayList<String> locations;
    private ArrayList<String> schools;

    public SettingsActivity(){
        locations = new ArrayList<>();
        schools = new ArrayList<>();

        locations.add("Cupertino");
        locations.add("San Jose");
        locations.add("San Francisco");
        locations.add("Palo Alto");
        locations.add("Mountain View");
        locations.add("Sunnyvale");

        schools.add("Monta Vista");
        schools.add("Lynbrook");
        schools.add("Cupertino");
        schools.add("Homestead");
        schools.add("Fremont");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // for city
        Spinner citySpinner = findViewById(R.id.city_spinner);
        citySpinner.setOnItemSelectedListener(this);

        ArrayAdapter<?> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, locations);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citySpinner.setAdapter(ad);


        // for school
        Spinner schoolSpinner = findViewById(R.id.school_spinner);
        schoolSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<?> ad2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, schools);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        schoolSpinner.setAdapter(ad2);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id){
        Toast.makeText(getApplicationContext(), locations.get(position), Toast.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), schools.get(position), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0){}
}