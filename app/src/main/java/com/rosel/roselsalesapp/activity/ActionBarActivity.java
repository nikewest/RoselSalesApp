package com.rosel.roselsalesapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.MenuItem;

/**
 * Created by nikiforovnikita on 13.04.2017.
 */

public class ActionBarActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        if(getActionBar()!=null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
