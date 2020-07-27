package com.puhor.test_ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    public static String[] elements, item_element1, item_element2, item_element3;

    DrawerLayout drawer;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        populateData();

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void populateData()
    {
        Elements element1 = new Elements("Element1");
        Elements element2 = new Elements("Element2");
        Elements element3 = new Elements("Element3");
        elements = new String[]{element1.getElement_title(), element2.getElement_title(), element3.getElement_title()};

        Items item1 = new Items("Item1_1");
        Items item2 = new Items("Item1_2");
        Items item13 = new Items("Item1_3");
        item_element1 = new String[]{item1.getItem_title(),item2.getItem_title(), item13.getItem_title()};

        Items item3 = new Items("Item2_1");
        Items item4 = new Items("Item2_2");
        Items item5 = new Items("Item2_3");
        Items item6 = new Items("Item2_4");
        Items item7 = new Items("Item2_5");
        Items item8 = new Items("Item2_6");
        item_element2 = new String[]{item3.getItem_title(),item4.getItem_title(),item5.getItem_title(),item6.getItem_title(),item7.getItem_title(),item8.getItem_title()};

        Items item9 = new Items("Item3_1");
        Items item10 = new Items("Item3_2");
        Items item11 = new Items("Item3_3");
        Items item12 = new Items("Item3_4");
        item_element3 = new String[]{item9.getItem_title(), item10.getItem_title(), item11.getItem_title(), item12.getItem_title()};
    }
}