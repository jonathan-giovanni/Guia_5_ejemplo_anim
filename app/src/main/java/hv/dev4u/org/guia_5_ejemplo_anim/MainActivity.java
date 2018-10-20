package hv.dev4u.org.guia_5_ejemplo_anim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView etiqueta;
    Animation animacion1,animacion2;
    boolean cambio_horizontal=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}
