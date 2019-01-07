package com.jesse_galloway.bottomnavigation.ui.fragsample;

import android.arch.lifecycle.ViewModel;
import android.support.v4.app.Fragment;
import android.util.Log;

public class FragSampleViewModel extends ViewModel {

    // TODO: Implement the ViewModel
    public FragSampleViewModel() {
    }

    void doAction(String str) {
        Log.e("ViewModel","Action:" + str);
    }
}
