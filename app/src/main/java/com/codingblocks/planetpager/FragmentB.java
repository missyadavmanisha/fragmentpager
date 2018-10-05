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
public class FragmentB extends Fragment {
    ArrayList<Imageclass> arrayList1=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList1.add(new Imageclass("Milkay Way", "The Milky Way is the","https://cdn.pixabay.com/photo/2015/11/04/20/59/milky-way-1023340__340.jpg"));
        arrayList1.add(new Imageclass("Andromeda Galaxy"," The Andromeda gala","https://cdn.pixabay.com/photo/2018/08/17/22/36/m31-3613931__340.jpg"));
        arrayList1.add(new Imageclass("Whirlpool Galaxy ","The Whirlpool Galaxy  Earth","https://thumb1.shutterstock.com/thumb_large/292820/285569396/stock-photo-spiral-galaxy-illustration-of-milky-way-285569396.jpg"));
        arrayList1.add(new Imageclass("Sombrero Galaxy","The Sombrero Ga ","https://thumb9.shutterstock.com/thumb_large/4301743/557777728/stock-photo-galaxy-and-nebula-elements-of-this-image-furnished-by-nasa-557777728.jpg"));
        arrayList1.add(new Imageclass("Triangulum Galaxy","The Triangulum Galaxy Earth ","https://thumb1.shutterstock.com/thumb_large/292820/285569396/stock-photo-spiral-galaxy-illustration-of-milky-way-285569396.jpg"));
        arrayList1.add(new Imageclass("Black Eye Galaxy","One of tthe bright core","https://www.123rf.com/photo_26955998_m3-star-cluster.html?fromid=M29HN2ZzTWNQazdhYnFjMXM4WHZjdz09"));
        /*arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));
        arrayList.add(new Imageclass(""));*/

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

        HetrogeneousAdapter hetrogenAdapter = new HetrogeneousAdapter(arrayList1, (AppCompatActivity) getActivity());

        recyclerView.setAdapter(hetrogenAdapter);
    }
}
