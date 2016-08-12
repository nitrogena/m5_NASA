package mx.nitrogena.dadm.mod5.nasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;

public class DetailActivity extends AppCompatActivity {

    //USANDO LA CLASE DE BUTTER KNIFE
    @BindView(R.id.adetail_tv_cameraFullName)
    TextView tvCameraFullName;
    @BindView(R.id.adetail_tv_earthDate) TextView tvEarthDate;
    @BindView(R.id.adetail_tv_class) TextView tvClass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        /*
        String cameraFullname = getIntent().getExtras().getString("cameraFullname");
        String earthDate = getIntent().getExtras().getString("earthdate");
        String strClass = getIntent().getExtras().getString("class");

        tvCameraFullName.setText(cameraFullname);
        tvEarthDate.setText(earthDate);
        tvClass.setText(strClass);
        */

    }
}
