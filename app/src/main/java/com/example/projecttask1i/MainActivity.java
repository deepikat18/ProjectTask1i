package com.example.projecttask1i;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new FragmentDashBoard())
                    .commit();
        }

        // Initialize the toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize the navigation drawer
        drawerLayout = findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );

        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        // Initialize the navigation view
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                // Handle navigation view item clicks here
                int id = menuItem.getItemId();

                if (id == R.id.home){
                    replaceFragment(new FragmentDashBoard());

                    //relativeLayout.setVisibility(View.INVISIBLE);
                }
                else if (id == R.id.activity1){
                    replaceFragment(new Menu1Fragment());

                    //relativeLayout.setVisibility(View.INVISIBLE);
                }
                else if (id == R.id.activity2){
                    replaceFragment(new Menu2Fragment());

                    //relativeLayout.setVisibility(View.INVISIBLE);


                }
                else if (id == R.id.activity3){
                    replaceFragment(new Menu3Fragment());

                    //relativeLayout.setVisibility(View.INVISIBLE);


                }
                else if (id == R.id.activity4){
                    replaceFragment(new Menu4Fragment());

                    // relativeLayout.setVisibility(View.INVISIBLE);


                }
                else if (id == R.id.activity5){
                    replaceFragment(new Menu5Fragment());

                    // relativeLayout.setVisibility(View.INVISIBLE);

                }
                else {
                    replaceFragment(new Menu6Fragment());

                }

                // Close the drawer after handling the click
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
//            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//            startActivity(intent);
            super.onBackPressed();


            }
        }
}