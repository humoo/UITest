package com.humo.uitest.snackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.humo.uitest.R;

/**
 * @author zhxumao
 *         Created on 2018/5/28 0028 23:37.
 */

public class SnacbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_snack_main);


    }

    /**
     * 简单用法
     *
     * @param view
     */
    public void clickSimple(View view) {
        Snackbar.make(view, "Snackbar!", Snackbar.LENGTH_LONG).show();
    }

    /**
     * snackbar with action
     */
    public void withAction(View view) {
        Snackbar.make(view, "Snackbar!", Snackbar.LENGTH_LONG).setAction("action here", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SnacbarActivity.this, "click snackbar action", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }


    public void withColorAction(View view) {
        Snackbar.make(view,"snackbar",Snackbar.LENGTH_LONG).setAction("action here", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SnacbarActivity.this, "click snackbar action", Toast.LENGTH_SHORT).show();
            }
        }).setActionTextColor(Color.GREEN).show();
    }
}
