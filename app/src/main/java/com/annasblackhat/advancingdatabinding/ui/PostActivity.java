package com.annasblackhat.advancingdatabinding.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.annasblackhat.advancingdatabinding.R;
import com.annasblackhat.advancingdatabinding.model.Post;

import java.util.List;

public class PostActivity extends AppCompatActivity {

    private List<Post> postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

    }

}
