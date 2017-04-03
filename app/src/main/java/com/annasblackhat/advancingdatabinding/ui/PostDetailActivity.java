package com.annasblackhat.advancingdatabinding.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.annasblackhat.advancingdatabinding.R;
import com.annasblackhat.advancingdatabinding.databinding.ActivityPostDetailBinding;
import com.annasblackhat.advancingdatabinding.model.Post;

public class PostDetailActivity extends AppCompatActivity {

    private Post post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPostDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_post_detail);

        post = (Post) getIntent().getSerializableExtra(Intent.EXTRA_TEXT);
        binding.setPost(post);
        binding.setActivity(this);
    }

    public void like(View v){
        if(!post.isLiked()){
            post.setLiked(true);
            post.setLikeCount(post.getLikeCount()+1);
        }
    }
}
