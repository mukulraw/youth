package com.youthlive.youthlive;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawer;

    ImageButton online , vlog , live , timeline , profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);

        online = (ImageButton) findViewById(R.id.live);
        vlog = (ImageButton)findViewById(R.id.vlog);
        live = (ImageButton)findViewById(R.id.golive);
        timeline = (ImageButton)findViewById(R.id.timeline);
        profile = (ImageButton)findViewById(R.id.profile);


        setSupportActionBar(toolbar);

        toolbar.setTitleTextColor(Color.WHITE);


        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawer = (DrawerLayout) findViewById(R.id.activity_main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open , R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , GoLive.class);
                startActivity(intent);

            }
        });


        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("asd" , "online clicked");

                toolbar.setTitle("Live Room");

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportFragmentManager().popBackStackImmediate();
                }

                Live frag1 = new Live();
                ft.replace(R.id.replace , frag1);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.commit();

            }
        });


        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("asd" , "online clicked");

                toolbar.setTitle("Timeline");

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportFragmentManager().popBackStackImmediate();
                }

                Timeline frag1 = new Timeline();
                ft.replace(R.id.replace , frag1);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.commit();

            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("asd" , "online clicked");

                toolbar.setTitle("Profile");

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportFragmentManager().popBackStackImmediate();
                }

                Profile frag1 = new Profile();
                ft.replace(R.id.replace , frag1);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.commit();

            }
        });


        vlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("asd" , "vlog clicked");

                toolbar.setTitle("Vlog");

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportFragmentManager().popBackStackImmediate();
                }

                Vlog frag1 = new Vlog();
                ft.replace(R.id.replace , frag1);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.commit();

            }
        });



        toolbar.setTitle("Live Room");
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Live frag1 = new Live();
        ft.replace(R.id.replace , frag1);
        //ft.addToBackStack(null);
        ft.commit();




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);//Menu Resource, Menu
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.notifications:

                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }


}
