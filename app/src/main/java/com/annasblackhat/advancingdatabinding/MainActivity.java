package com.annasblackhat.advancingdatabinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.annasblackhat.advancingdatabinding.model.Post;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_post);

        Post post = new Post();
        post.setImg("https://specials-images.forbesimg.com/imageserve/604358102/960x0.jpg?fit=scale");
        post.setTitle("What Is The Best Way To Learn Machine Learning Without Taking Any Online Courses?");
        post.setAdmin("Destission");
        post.setTgl("Wednesday, 29 January 2017");
        post.setContent("The Deep Learning field has dramatically expanded in the last few years, to the point where it’s not realistic to grok all the subfields of Deep Learning in a short amount of time. I recommend diving deep into one particular subfield, and then it becomes easier to learn the other subfields once you’ve mastered one area. These fields do not have that much in common anymore, besides the fact that they all utilize the expressive power of deep learning to learn tasks end-to-end, and are of a generally experimental flavor (rather than theoretical Computer Science).");
        post.setLikeCount(2320);

    }
}
