package com.jesse_galloway.bottomnavigation.ui.fragsample;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jesse_galloway.bottomnavigation.R;

public class FragSampleFragment1 extends Fragment{

    private FragSampleViewModel mViewModel;

    public static FragSampleFragment1 newInstance() {
        return new FragSampleFragment1();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_frag_sample_fragment1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragSampleViewModel.class);
        mViewModel.doAction("Fragment 1 message to ViewModel");
    }
}