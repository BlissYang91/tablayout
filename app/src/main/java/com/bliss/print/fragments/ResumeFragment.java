package com.bliss.print.fragments;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bliss.print.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResumeFragment extends Fragment {
    private String mFrom;

    public ResumeFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String from){
        ResumeFragment resumeFragment = new ResumeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from",from);
        resumeFragment.setArguments(bundle);
        return resumeFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            mFrom = (String) getArguments().get("from");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resume, container, false);
    }

}
