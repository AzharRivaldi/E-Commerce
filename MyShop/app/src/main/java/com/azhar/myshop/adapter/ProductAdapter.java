package com.azhar.myshop.adapter;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.azhar.myshop.R;
import com.azhar.myshop.model.ProductModel;
import com.loopj.android.image.SmartImageView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azhar Rivaldi on 01/12/2019.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.Holdr> {
    List<ProductModel> data = new ArrayList<ProductModel>();

    private float mWidth, mHeight;

    public ProductAdapter(List<ProductModel> data, Context ctx) {
        this.data = data;
        DisplayMetrics dm = ctx.getResources().getDisplayMetrics();
        mWidth = dm.widthPixels / ctx.getResources().getDimension(R.dimen.grid_width);
        mHeight = dm.heightPixels / ctx.getResources().getDimension(R.dimen.grid_height);
    }

    @Override
    public Holdr onCreateViewHolder(ViewGroup p1, int p2) {
        return new Holdr(LayoutInflater.from(p1.getContext()).inflate(R.layout.item_product, null));
    }

    @Override
    public void onBindViewHolder(Holdr holdr, int pos) {
        ProductModel cat = data.get(pos);
        holdr.name.setText(cat.name);
        holdr.img.setImageUrl(cat.img);
        holdr.store.setText(cat.store);
        holdr.price.setText(_priceFormat("" + cat.price));
        holdr.priceold.setText(_priceFormat("" + cat.price_old));
        holdr.priceold.setPaintFlags(holdr.priceold.getPaintFlags() | android.graphics.Paint.STRIKE_THRU_TEXT_FLAG);
        holdr.ratingbar.setRating(cat.rating);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Holdr extends RecyclerView.ViewHolder {
        TextView name, price, priceold, discount, store;
        SmartImageView img;
        RatingBar ratingbar;

        public Holdr(final View view) {
            super(view);
            view.post(new Runnable() {
                @Override
                public void run() {
                    ViewGroup.LayoutParams lp = view.getLayoutParams();
                    lp.height = (int) mHeight;
                    lp.width = (int) mWidth;
                    view.setLayoutParams(lp);
                }
            });
            name = view.findViewById(R.id.itemproductTextViewName);
            price = view.findViewById(R.id.itemproductTextViewPrice);
            priceold = view.findViewById(R.id.itemproductTextViewPold);
            discount = view.findViewById(R.id.itemproductTextViewDisc);
            store = view.findViewById(R.id.itemproductTextViewStore);
            img = view.findViewById(R.id.itemproductImageView1);
            ratingbar = view.findViewById(R.id.itemproductRatingBar1);
        }
    }

    private static String _priceFormat(String s) {
        double parsed = Double.parseDouble(s);
        String formatted = NumberFormat.getCurrencyInstance().format(parsed);
        return formatted;
    }
}
