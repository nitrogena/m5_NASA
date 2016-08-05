package mx.nitrogena.dadm.mod5.nasa.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import mx.nitrogena.dadm.mod5.nasa.model.APOD;

/**
 * Created by Alumno on 05/08/2016.
 */
public class NasaApodAdapter extends RecyclerView.Adapter<NasaApodViewHolder>{

    private List<APOD> lstAPOD;

    @Override
    public NasaApodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(NasaApodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
