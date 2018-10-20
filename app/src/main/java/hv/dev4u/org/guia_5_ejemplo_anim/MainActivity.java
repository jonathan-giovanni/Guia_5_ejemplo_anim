package hv.dev4u.org.guia_5_ejemplo_anim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import hv.dev4u.org.guia_5_ejemplo_anim.fragmentos.PrimerFragmento;
import hv.dev4u.org.guia_5_ejemplo_anim.fragmentos.SegundoFragmento;
import hv.dev4u.org.guia_5_ejemplo_anim.fragmentos.TercerFragmento;

public class MainActivity extends AppCompatActivity {


    TextView etiqueta;
    Animation animacion1,animacion2;
    boolean cambio_horizontal=true;

    ArrayList<Fragment> listaFragmentos;

    ViewPager pager;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        etiqueta = findViewById(R.id.etiqueta);

        animacion1 = AnimationUtils.loadAnimation(this,R.anim.transicion_horizontal);
        animacion1.setDuration(3000);
        animacion1.setFillAfter(true);

        animacion2 = AnimationUtils.loadAnimation(this,R.anim.transicion_horizontal2);
        animacion2.setDuration(3000);
        animacion2.setFillAfter(true);

        etiqueta.setOnClickListener(click->{
            if(cambio_horizontal==true)
                etiqueta.startAnimation(animacion1);
            else
                etiqueta.startAnimation(animacion2);

            cambio_horizontal = !cambio_horizontal;
        });

        */

        pager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.navigation);

        pager.setAdapter(new MyViewPager(getSupportFragmentManager()));

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int opc = 0;

                if(menuItem.getItemId()==R.id.option_search){
                   opc=0;
                }
                if(menuItem.getItemId()==R.id.option_shop){
                    opc=1;
                }
                if(menuItem.getItemId()==R.id.option_profile){
                    opc=2;
                }


                pager.setCurrentItem(opc);
                return true;
            }
        });


    }



    class MyViewPager extends FragmentPagerAdapter {

        public MyViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0: // Fragment # 0 - This will show FirstFragment

                    return new PrimerFragmento();
                case 1: // Fragment # 0 - This will show FirstFragment different title

                    return new SegundoFragmento();
                case 2: // Fragment # 1 - This will show SecondFragment
                    
                    return new TercerFragmento();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
