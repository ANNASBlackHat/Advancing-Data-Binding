package com.annasblackhat.advancingdatabinding.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.annasblackhat.advancingdatabinding.Content;
import com.annasblackhat.advancingdatabinding.R;
import com.annasblackhat.advancingdatabinding.adapter.PostAdapter;
import com.annasblackhat.advancingdatabinding.databinding.ActivityPostBinding;
import com.annasblackhat.advancingdatabinding.model.Post;

import java.util.List;

public class PostActivity extends AppCompatActivity {

    private List<Post> postList;
    private ActivityPostBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_post);
        binding.recView.setAdapter(new PostAdapter(new Content().getManyPost()));

        binding.fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PostActivity.this, AddPostActivity.class));
            }
        });
    }

}
