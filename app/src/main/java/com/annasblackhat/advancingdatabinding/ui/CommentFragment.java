package com.annasblackhat.advancingdatabinding.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.annasblackhat.advancingdatabinding.databinding.FragmentCommentBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommentFragment extends Fragment {


    public CommentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentCommentBinding binding = FragmentCommentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

}
