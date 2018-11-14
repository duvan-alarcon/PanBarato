package com.example.duvan.panbarato;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivityNavigation extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            fragmentTransaction= fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.iGeneral:
                    GeneralFragment generalFragment= new GeneralFragment();
                    fragmentTransaction.replace(R.id.framelayout, generalFragment).commit();
                    return true;
                case R.id.iBuscar:

                    BuscarFragment buscarFragment= new BuscarFragment();
                    fragmentTransaction.replace(R.id.framelayout, buscarFragment).commit();
                    return true;
                case R.id.iNotificaciones:

                    NotificacionFragment notificacionFragment= new NotificacionFragment();
                    fragmentTransaction.replace(R.id.framelayout, notificacionFragment).commit();
                    return true;
                case R.id.iPerfil:

                    PerfilFragment perfilFragment= new PerfilFragment();
                    fragmentTransaction.replace(R.id.framelayout, perfilFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction= fragmentManager.beginTransaction();

        GeneralFragment generalFragment= new GeneralFragment();
        fragmentTransaction.add(android.R.id.content, generalFragment).commit();




    }

}
