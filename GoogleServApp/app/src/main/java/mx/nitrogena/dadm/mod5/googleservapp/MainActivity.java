package mx.nitrogena.dadm.mod5.googleservapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.amain_btn_maps).setOnClickListener(this);
        findViewById(R.id.amain_btn_admob).setOnClickListener(this);
        findViewById(R.id.amain_btn_picker).setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.amain_btn_maps:
                mostrarMapa();
                break;
            case R.id.amain_btn_admob:
                adMob();
                break;
            case R.id.amain_btn_picker:
                irLocationPicker();
                break;
        }
    }

    private void mostrarMapa() {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    private void adMob() {
        Intent intent = new Intent(MainActivity.this, AdMobActivity.class);
        startActivity(intent);
    }

    private void irLocationPicker() {
    }

    //location PICKER
    @Override

    ForResult(new PlacePicker.IntentBuilder().build(MainActivity.this), PLACE_PICKER_REQUEST);
    ayServiceRep
    race();
    ayServicesNot
    race();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PLACE_PICKER_REQUEST) {
            if (data != null) {
                Place place = PlacePicker.getPlace(MainActivity.this, data);
                Toast.makeText(MainActivity.this, place.getAdress() ,Toast.LENGTH_SHORT).show();
            }
        }
    }

    /*admob es para publicar anuncios y ganar dinero*/



}
