package main.materialdesign.spm.materialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sibaprasad.mohanty on 10/3/2015.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;
    protected TextView textView;

    public CustomViewHolder(View view) {
        super(view);
        this.imageView = (ImageView) view.findViewById(R.id.flag);
        this.textView = (TextView) view.findViewById(R.id.title);
    }
}

