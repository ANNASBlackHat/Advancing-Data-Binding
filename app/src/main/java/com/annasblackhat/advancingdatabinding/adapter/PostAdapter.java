package com.annasblackhat.advancingdatabinding.adapter;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.annasblackhat.advancingdatabinding.databinding.ListItemPostBinding;
import com.annasblackhat.advancingdatabinding.model.Post;
import com.annasblackhat.advancingdatabinding.ui.PostDetailActivity;

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
        ListItemPostBinding binding = ListItemPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolderPost(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolderPost holder, int position) {
        holder.postBinding.setPost(postList.get(position));
        holder.postBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    class ViewHolderPost extends RecyclerView.ViewHolder{

        //ViewDataBinding binding;
        ListItemPostBinding postBinding;

        public ViewHolderPost(final View itemView) {
            super(itemView);
            //binding = DataBindingUtil.bind(itemView);
            postBinding = DataBindingUtil.bind(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), PostDetailActivity.class);
                    intent.putExtra(Intent.EXTRA_TEXT, postList.get(getLayoutPosition()));
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
