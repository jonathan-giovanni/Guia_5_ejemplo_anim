package hv.dev4u.org.guia_5_ejemplo_anim.fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hv.dev4u.org.guia_5_ejemplo_anim.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TercerFragmento extends Fragment {


    public TercerFragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tercer_fragmento, container, false);
    }

}
