package mx.nitrogena.dadm.mod5.nasa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    //USANDO LA CLASE DE BUTTER KNIFE
    @BindView(R.id.adetail_tv_cameraFullName)
    TextView tvCameraFullName;
    @BindView(R.id.adetail_tv_earthDate) TextView tvEarthDate;
    @BindView(R.id.adetail_tv_roverLandingdate) TextView tvRoverLandingdate;

    //SimpleDraweeView
    @BindView(R.id.adetail_iv_img)
    ImageView ivImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

/**/
        Bundle bdlExtras = getIntent().getExtras();

        String cameraFullname = bdlExtras.getString("cameraFullname");
        String earthDate = bdlExtras.getString("earthdate");
        String imgSrc = bdlExtras.getString("img");
        String roverLandingdate = bdlExtras.getString("roverLandingdate");

        Log.d("logDetail - titulo: ", cameraFullname);
        Log.d("logDetail - imgSrc: ", imgSrc);

        //String cameraFullname = getIntent().getExtras().getString("cameraFullname");
        //String earthDate = getIntent().getExtras().getString("earthdate");
        //String strClass = getIntent().getExtras().getString("class");



/**/
        tvCameraFullName.setText("camera full name: "+cameraFullname);
        tvEarthDate.setText("earth date: " + earthDate);

        Picasso.with(DetailActivity.this).load(imgSrc).into(ivImg);

        tvRoverLandingdate.setText("rover landing date: " + roverLandingdate);

        findViewById(R.id.adetail_btn_regresar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.adetail_btn_regresar:
                irLista();
                break;

        }
    }

    private void irLista() {
        Intent intent = new Intent(DetailActivity.this, ListActivity.class);
        startActivity(intent);
    }
}
