package mx.nitrogena.dadm.mod5.nasa.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mx.nitrogena.dadm.mod5.nasa.R;

/**
 * Created by Alumno on 05/08/2016.
 */
public class NasaApodViewHolder extends RecyclerView.ViewHolder{

    //CON BIND VIEW YA NO TENGO QUE USAR EL METODO A MANITA
    @BindView(R.id.amain_tv_copyright) TextView tvCopyright;
    @BindView(R.id.amain_tv_date) TextView tvDate;
    @BindView(R.id.amain_tv_explanation) TextView tvExplanation;
    // @BindView(R.id.amain_tv_hdurl) TextView tvHdurl;
    @BindView(R.id.amain_tv_mediaType) TextView tvMediaType;
    @BindView(R.id.amain_tv_serviceVersion) TextView tvServiceVersion;
    @BindView(R.id.amain_tv_title) TextView tvTitle;
    //@BindView(R.id.amain_tv_url) TextView tvUrl;
    @BindView(R.id.amain_iv_img) ImageView ivImg;


//HACER RECICLAJE Y HACER ASOCIACION DE VISTAS
    //NO DEBE HABER MAS
    public NasaApodViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
