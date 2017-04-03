package com.annasblackhat.advancingdatabinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by annasblackhat on 25/03/17.
 */

public class CustomBinding {
    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String imgUrl){
        Glide.with(view.getContext())
                .load(imgUrl)
                .into(view);
    }
}
