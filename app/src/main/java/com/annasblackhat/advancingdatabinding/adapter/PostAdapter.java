package com.annasblackhat.advancingdatabinding.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.annasblackhat.advancingdatabinding.R;
import com.annasblackhat.advancingdatabinding.model.Post;

import java.util.List;

/**
 * Created by annasblackhat on 24/03/17.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolderPost> {

    private List<Post> postList;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public ViewHolderPost onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolderPost(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_post, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolderPost holder, int position) {

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    class ViewHolderPost extends RecyclerView.ViewHolder{

        public ViewHolderPost(View itemView) {
            super(itemView);
        }
    }
}
