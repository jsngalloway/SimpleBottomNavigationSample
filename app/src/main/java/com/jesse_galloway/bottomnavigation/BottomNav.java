package com.jesse_galloway.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.jesse_galloway.bottomnavigation.ui.fragsample.FragSampleFragment1;
import com.jesse_galloway.bottomnavigation.ui.fragsample.FragSampleFragment2;

public class BottomNav extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_1:
                    Log.e("Bottom Nav","moved to frag1");
                    Fragment fragment1 = new FragSampleFragment1();
                    switchFrag(fragment1);
                    return true;

                case R.id.navigation_2:
                    Log.e("Bottom Nav","moved to frag2");
                    Fragment fragment2 = new FragSampleFragment2();
                    switchFrag(fragment2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Fragment fragment = new FragSampleFragment1();
        switchFrag(fragment);
    }

    public void switchFrag(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment, fragment.toString());
        fragmentTransaction.commit();
    }

}
