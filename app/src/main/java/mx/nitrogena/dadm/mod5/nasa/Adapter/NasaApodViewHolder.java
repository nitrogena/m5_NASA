package mx.nitrogena.dadm.mod5.nasa.Adapter;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mx.nitrogena.dadm.mod5.nasa.R;

/**
 * Created by Alumno on 05/08/2016.
 */
public class NasaApodViewHolder extends RecyclerView.ViewHolder{

    //CON BIND VIEW YA NO TENGO QUE USAR EL METODO A MANITA
   /* @BindView(R.id.alistcv_tv_id) TextView tvId;

    @BindView(R.id.alistcv_tv_sol) TextView tvSol;
    @BindView(R.id.alistcv_tv_earthDate) TextView tvEarthDate;*/

    @BindView(R.id.alistcv_tv_camera_fullName) TextView tvCameraFullName;


    //@BindView(R.id.alistcv_iv_img) ImageView ivImg;
    @BindView(R.id.alistcv_iv_img) SimpleDraweeView ivImg;


//HACER RECICLAJE Y HACER ASOCIACION DE VISTAS
    //NO DEBE HABER MAS
    public NasaApodViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
