package Adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sumit.animalplanet.ColorSchemes;
import com.example.sumit.animalplanet.R;

import java.util.ArrayList;

public class ColorViewAdapter extends RecyclerView.Adapter<ColorViewAdapter.ViewHolder> {
        private ArrayList<ColorSchemes> colorSchemes;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public  View mView;
        public ViewHolder(View v) {
            super(v);
            mView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ColorViewAdapter(ArrayList<ColorSchemes> myDataset) {
        colorSchemes = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ColorViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.color_pallet, parent, false);
        // set the view's size, margins, paddings and layout parameters

        TextView tv = (TextView) v.findViewById(R.id.color_card);
        tv.setPadding(10,10,10,10);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ColorSchemes colorScheme = colorSchemes.get(position);
        int color = Color.argb(255, colorScheme.red, colorScheme.green, colorScheme.blue);
        TextView tv = (TextView) holder.itemView.findViewById(R.id.color_card);
        tv.setBackgroundColor(color);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return colorSchemes.size();
    }
}
