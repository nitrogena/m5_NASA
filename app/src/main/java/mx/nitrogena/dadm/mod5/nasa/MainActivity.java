package mx.nitrogena.dadm.mod5.nasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        ApodService apodService = Data.getRetrofitInstance().create(ApodService.class);
        //Call<APOD> callApodService = apodService.getTodayApod();
        //SE PUEDE USAR LA FORMA DE ARRIBA O LA DE ABAJO, ES LO MISMO
        Call<APOD> callApodService = apodService.getTodayApodWithQuery("sN0q0EGDwJer2FFc4ns7toCYkthNtvgmtuAjtEIV");
        callApodService.enqueue(new Callback<APOD>() {
            @Override
            public void onResponse(Call<APOD> call, Response<APOD> response) {
                //ESTAMOS OBTENIENDO LOS VALORES DEL JSON QUE USAMOS
                Log.d("LOG APOD: ", response.body().getTitle());
            }

            @Override
            public void onFailure(Call<APOD> call, Throwable t) {

            }
        });


    }
}
