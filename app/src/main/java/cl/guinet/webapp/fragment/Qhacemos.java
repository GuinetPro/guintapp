package cl.guinet.webapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cl.guinet.webapp.R;
import cl.guinet.webapp.adapter.TecAdapter;
import cl.guinet.webapp.modelo.Tecnologia;

/**
 * Created by ricardo.gutierrez on 11/08/2016.
 */
public class Qhacemos extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;
    private RecyclerView recyclerView;

    public static Qhacemos newInstance() {
        Bundle args = new Bundle();
        Qhacemos fragment = new Qhacemos();
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

        Tecnologia tec1 = new Tecnologia("Ruby on Rails","ejemplo de descripsion","");
        Tecnologia tec2 = new Tecnologia("Android","ejemplo de descripsion","");
        Tecnologia tec3 = new Tecnologia("Php","ejemplo de descripsion","");

        List<Tecnologia> ListaRec = new ArrayList<>();
        ListaRec.add(tec1);
        ListaRec.add(tec2);
        ListaRec.add(tec3);

        View rootView = inflater.inflate(R.layout.my_recycler_view, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        TecAdapter adapter = new TecAdapter(ListaRec);
        recyclerView.setAdapter(adapter);


        return rootView;
    }
}

