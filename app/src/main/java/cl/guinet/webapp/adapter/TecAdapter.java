package cl.guinet.webapp.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.guinet.webapp.R;
import cl.guinet.webapp.modelo.Tecnologia;

/**
 * Created by ricardo.gutierrez on 12/08/2016.
 */
public class TecAdapter extends RecyclerView.Adapter<TecAdapter.TecViewHolder>{


    private List<Tecnologia> tecnologias;

    public TecAdapter(List<Tecnologia> tecs){
        this.tecnologias = tecs;
    }

    @Override
    public int getItemCount() {
        return tecnologias.size();
    }


    @Override
    public TecViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tec, viewGroup, false);
        TecViewHolder pvh = new TecViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(TecViewHolder tec, int i) {
        tec.title.setText(tecnologias.get(i).getTitle());
        tec.description.setText(tecnologias.get(i).getDescription());


        Picasso.with(tec.image.getContext()).load( R.drawable.rails ).into(tec.image);
        //tec.image.setImageResource(tecnologias.get(i).getImage());
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    public static class TecViewHolder extends RecyclerView.ViewHolder {
        private CardView cv;
        private TextView title;
        private TextView description;
        private ImageView image;

        public TecViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }

}
