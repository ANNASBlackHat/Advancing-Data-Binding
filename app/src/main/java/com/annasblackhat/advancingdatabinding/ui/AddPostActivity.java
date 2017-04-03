package com.annasblackhat.advancingdatabinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.annasblackhat.advancingdatabinding.R;
import com.annasblackhat.advancingdatabinding.databinding.ActivityAddPostBinding;
import com.annasblackhat.advancingdatabinding.model.Post;

public class AddPostActivity extends AppCompatActivity {

    ActivityAddPostBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_post);
        binding.setPost(new Post());
        binding.setActivity(this);
    }

    public void save(View v, Post post){
        //process saving data
        System.out.println("xxx category : "+post.getCategory());
        System.out.println("xxx title : "+post.getTitle());
        System.out.println("xxx content : "+post.getContent());
    }

}
