package kz.example.finalproject;

import static com.bumptech.glide.load.resource.bitmap.TransformationUtils.centerCrop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;

import kz.example.finalproject.databinding.ActivityOtbasyBinding;

public class OtbasyActivity extends AppCompatActivity {


    View hview;
    ImageView imageView;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityOtbasyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOtbasyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.appBarOtbasy.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_ana, R.id.nav_user)
                .setOpenableLayout(drawer)
                .build();

        hview =  navigationView.getHeaderView(0);


        Intent intent = getIntent();
        String uEmail = intent.getStringExtra("email");
        String uName = intent.getStringExtra("name");
        String uPass = intent.getStringExtra("password");


        TextView textViewUsername = (TextView) hview.findViewById(R.id.username);
        TextView textViewUserEmail = (TextView) hview.findViewById(R.id.email);
        ImageView user_image = (ImageView) hview.findViewById(R.id.imageView);
        textViewUsername.setText(uName);
        textViewUserEmail.setText(uEmail);

        Glide.with(this)
                .load("https://www.pexels.com/photo/positive-bearded-young-indian-guy-in-turban-4307869/")
                .centerCrop()
                .placeholder(R.drawable.baseline_account_circle_24)
                .into(user_image);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_otbasy);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.otbasy, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_otbasy);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}