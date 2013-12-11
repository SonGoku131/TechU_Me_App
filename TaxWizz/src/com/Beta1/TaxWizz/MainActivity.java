package com.Beta1.TaxWizz;

import com.Beta.taxwizz.R;
import com.Beta.taxwizz.R.id;
import com.Beta.taxwizz.R.layout;
import com.Beta.taxwizz.R.menu;
import com.Beta.taxwizz.R.string;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity  extends Activity{

    /**
     * The serialization (saved instance state) Bundle key representing the
     * current dropdown position.
     */
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   
    }

   
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }





   

   
}
