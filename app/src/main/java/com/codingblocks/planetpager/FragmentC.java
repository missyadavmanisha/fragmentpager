package com.codingblocks.planetpager;



import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
public class FragmentC extends Fragment {
    ArrayList<Imageclass> arrayList=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        arrayList.add(new Imageclass("Aquarius","While one of the biggest, most famous, and oldest named constellations","https://content.artofmanliness.com/uploads/2014/07/AquariusCC.jpg"));
        arrayList.add(new Imageclass("Aquila" ,"This constellation lies in the Milky Way band, and its most prominent star is Altair","https://content.artofmanliness.com/uploads/2014/07/AquilaCC.jpg"));
        arrayList.add(new Imageclass("Aries" ,"Aries is formed by just 4 (sometimes 5) visible stars","https://content.artofmanliness.com/uploads/2014/07/AriesCC.jpg"));
        arrayList.add(new Imageclass("Canis Major" ,"Canis Major represents the famed Greek dog Laelaps. ","https://content.artofmanliness.com/uploads/2014/07/CanisMajorCC.jpg"));
        arrayList.add(new Imageclass("Cassiopeia" ,"Cassiopeia is one of the most easily recognizable constellations in the night sky come fall and early winter","https://content.artofmanliness.com/uploads/2014/07/CassiopeiaCC.jpg"));
        arrayList.add(new Imageclass("Cygnus " ,"The constellation may also have gotten its name from the tale of Phaethon and Cycnus","https://content.artofmanliness.com/uploads/2014/07/CygnusCC.jpg"));
        arrayList.add(new Imageclass("Gemini" ,"Gemini represents the twins Castor and Pollux.","https://content.artofmanliness.com/uploads/2014/07/GeminiCC.jpg"));
        arrayList.add(new Imageclass("Leo" ,"Leo has been a great lion in the night sky across almost all mythological traditions","https://content.artofmanliness.com/uploads/2014/07/LeoCC.jpg"));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_a,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        HetrogeneousAdapter hetrogeneousAdapter = new HetrogeneousAdapter(arrayList, (AppCompatActivity) getActivity());

        recyclerView.setAdapter(hetrogeneousAdapter);

    }
}
