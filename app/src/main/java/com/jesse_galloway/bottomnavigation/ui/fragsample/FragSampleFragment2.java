package com.jesse_galloway.bottomnavigation.ui.fragsample;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jesse_galloway.bottomnavigation.R;

public class FragSampleFragment2 extends Fragment {

    private FragSampleViewModel mViewModel;

    public static FragSampleFragment2 newInstance() {
        return new FragSampleFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_frag_sample_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragSampleViewModel.class);
        mViewModel.doAction("Fragment 2 message to ViewModel");
    }
}