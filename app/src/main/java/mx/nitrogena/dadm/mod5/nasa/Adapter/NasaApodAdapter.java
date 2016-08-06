package mx.nitrogena.dadm.mod5.nasa.Adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import mx.nitrogena.dadm.mod5.nasa.R;
import mx.nitrogena.dadm.mod5.nasa.model.APOD;
import mx.nitrogena.dadm.mod5.nasa.model.Photo;

/**
 * Created by Alumno on 05/08/2016.
 */
public class NasaApodAdapter extends RecyclerView.Adapter<NasaApodViewHolder>{

    private List<Photo> lstFotos;

    public NasaApodAdapter(List<Photo> photos) {
        this.lstFotos = photos;
    }



    @Override
    public NasaApodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //CREO INSTANCIA y se le pone el inflater que es como un setcontetView, le digo que xml se va usar
        //inflate regresa una vista
        //contexto: donde vamos a utilizar las cosas
        return new NasaApodViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(NasaApodViewHolder holder, int position) {
        //QUE METODO SE USARA EN LAS VISTAS, SE USARA EN EL RECYCLER VIEW
        /*
        APOD apod = lstAPOD.get(position);
        if (apod.getMediaType().equals("image")){
            Picasso.with(holder.ivImg.getContext())
                    .load(apod.getUrl())
                    .into(holder.ivImg);
        }
        holder.tvTitle.setText(apod.getTitle());
*/

        /*
        List<Photo> photos = new ArrayList<Photo>();
        photos = response.body().getPhotos();

        photos.get(0);
        */
        Photo foto = lstFotos.get(position);
        holder.ivImg.setImageURI(foto.getImgSrc());

        /*Picasso.with(holder.ivImg.getContext())
                    .load(foto.getImgSrc())
                    .into(holder.ivImg);*/



        holder.tvCameraFullName.setText(foto.getCamera().getFullName());

    }

    @Override
    public int getItemCount() {
        return lstFotos != null? lstFotos.size() : 0;
    }
}
