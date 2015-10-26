package main.materialdesign.spm.materialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import main.materialdesign.recycle.ObjectCountry;

/**
 * Created by sibaprasad.mohanty on 10/3/2015.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerHolder> {

    private List<ObjectCountry> contactList;

    public RecyclerViewAdapter(List<ObjectCountry> contactList) {
        this.contactList = contactList;
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(RecyclerHolder contactViewHolder, int i) {
        ObjectCountry ci = contactList.get(i);
        contactViewHolder.textViewCountry.setText(ci.getName());
        contactViewHolder.textViewPopulation.setText(ci.getPop());
        contactViewHolder.textViewRank.setText(ci.getRank());

        if(i%5==0)
            contactViewHolder.imageView.setImageResource(R.drawable.img1);
        else  if(i%5==1)
            contactViewHolder.imageView.setImageResource(R.drawable.img2);
        else  if(i%5==2)
            contactViewHolder.imageView.setImageResource(R.drawable.img3);
        else  if(i%5==3)
            contactViewHolder.imageView.setImageResource(R.drawable.img4);
        else  if(i%5==4)
            contactViewHolder.imageView.setImageResource(R.drawable.img5);

    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.itemview_recycler, viewGroup, false);

        return new RecyclerHolder(itemView);
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder {

        public TextView textViewCountry;
        public TextView textViewPopulation;
        public TextView textViewRank;
        protected ImageView imageView;

        public RecyclerHolder(View v) {
            super(v);
            textViewCountry =  (TextView) v.findViewById(R.id.country);
            textViewPopulation = (TextView)  v.findViewById(R.id.population);
            textViewRank = (TextView)  v.findViewById(R.id.rank);
            imageView = (ImageView) v.findViewById(R.id.flag);
        }
    }
}
