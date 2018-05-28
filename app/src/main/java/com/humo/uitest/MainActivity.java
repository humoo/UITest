package com.humo.uitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.humo.uitest.snackbar.SnacbarActivity;
import com.humo.uitest.utils.ActivitySwitchUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSnackbar(View view) {
        ActivitySwitchUtil.openNewActivity(this, SnacbarActivity.class);
    }

    public void clickTextInputLayout(View view) {
    }

    public void clickTabLayout(View view) {
    }

    public void clickNavigation(View view) {
    }

    public void clickFloatingActionButton(View view) {
    }

    public void clickCoordinatorLayout(View view) {
    }

    public void clickCollapsingToolbarLayout(View view) {
    }

    public void clickBottomSheetBehavior(View view) {
    }
}
