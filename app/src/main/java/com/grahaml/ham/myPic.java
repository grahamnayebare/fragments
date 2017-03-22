package com.grahaml.ham;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.PopupMenu;


/**
 * A simple {@link Fragment} subclass.
 */
public class myPic extends Fragment {
    ImageView selectedImage;
    Button b;

    public myPic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        View view= inflater.inflate(R.layout.fragment_my_pic, container, false);

      selectedImage=(ImageView)view.findViewById(R.id.imageView2);

       setHasOptionsMenu(true);
        // Inflate the layout for this fragment
        return view;
    }



}
