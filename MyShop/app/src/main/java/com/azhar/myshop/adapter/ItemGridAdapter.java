package com.azhar.myshop.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.azhar.myshop.R;
import com.azhar.myshop.model.CategoryModel;

import java.util.List;

/**
 * Created by Azhar Rivaldi on 01/12/2019.
 */

public class ItemGridAdapter extends RecyclerView.Adapter<ItemGridAdapter.Holdr> {
    List<CategoryModel> data;

    public ItemGridAdapter(List<CategoryModel> data) {
        this.data = data;
    }

    @SuppressLint("InflateParams")
    @Override
    public Holdr onCreateViewHolder(ViewGroup p1, int p2) {
        return new Holdr(LayoutInflater.from(p1.getContext()).inflate(R.layout.item_grid, null));
    }

    @Override
    public void onBindViewHolder(Holdr holdr, int pos) {
        CategoryModel cat = data.get(pos);
        holdr.title.setText(cat.title);
        holdr.ic_cat.setImageResource(cat.icres);
        if (pos % 2 == 1) {
            holdr.divider.setVisibility(View.GONE);
        } else holdr.divider.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Holdr extends RecyclerView.ViewHolder {
        TextView title;
        ImageView ic_cat;
        View divider;

        public Holdr(View view) {
            super(view);
            title = view.findViewById(R.id.itemcardTextView1);
            ic_cat = view.findViewById(R.id.itemcardImageView1);
            divider = view.findViewById(R.id.itemcardView1);
        }
    }
}
