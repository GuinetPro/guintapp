package cl.guinet.webapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.guinet.webapp.R;

/**
 * Created by ricardo.gutierrez on 11/08/2016.
 */
public class Contacto extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static Contacto newInstance() {
        Bundle args = new Bundle();
        Contacto fragment = new Contacto();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.que_hacemos, container, false);
        return view;
    }
}
