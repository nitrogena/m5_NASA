package mx.nitrogena.dadm.mod5.nasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import mx.nitrogena.dadm.mod5.nasa.data.ApodService;
import mx.nitrogena.dadm.mod5.nasa.data.Data;
import mx.nitrogena.dadm.mod5.nasa.model.APOD;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.d("build config", BuildConfig.URLDEBUG);

        final TextView tvCopyright = (TextView) findViewById(R.id.amain_tv_copyright);
        final TextView tvDate = (TextView) findViewById(R.id.amain_tv_date);
        final TextView tvExplanation = (TextView) findViewById(R.id.amain_tv_explanation);
        final TextView tvHdurl = (TextView) findViewById(R.id.amain_tv_hdurl);
        final TextView tvMediaType = (TextView) findViewById(R.id.amain_tv_mediaType);
        final TextView tvServiceVersion = (TextView) findViewById(R.id.amain_tv_serviceVersion);
        final TextView tvTitle = (TextView) findViewById(R.id.amain_tv_title);
        final TextView tvUrl = (TextView) findViewById(R.id.amain_tv_url);

        final ImageView ivImg = (ImageView) findViewById(R.id.amain_iv_img);


        ApodService apodService = Data.getRetrofitInstance().create(ApodService.class);
        //Call<APOD> callApodService = apodService.getTodayApod();
        //SE PUEDE USAR LA FORMA DE ARRIBA O LA DE ABAJO, ES LO MISMO
        Call<APOD> callApodService = apodService.getTodayApodWithQuery("sN0q0EGDwJer2FFc4ns7toCYkthNtvgmtuAjtEIV");
        callApodService.enqueue(new Callback<APOD>() {
            @Override
            public void onResponse(Call<APOD> call, Response<APOD> response) {
                //ESTAMOS OBTENIENDO LOS VALORES DEL JSON QUE USAMOS
                Log.d("LOG APOD: ", response.body().getTitle());

                tvCopyright.setText(response.body().getCopyright());
                tvDate.setText(response.body().getDate());
                tvExplanation.setText(response.body().getExplanation());
                tvHdurl.setText(response.body().getHdurl());
                tvMediaType.setText(response.body().getMediaType());
                tvServiceVersion.setText(response.body().getServiceVersion());
                tvTitle.setText(response.body().getTitle());
                tvUrl.setText(response.body().getUrl());


                String url1 = response.body().getUrl();


                Picasso.with(MainActivity.this).load(url1).into(ivImg);

            }

            @Override
            public void onFailure(Call<APOD> call, Throwable t) {

            }
        });


    }
}
