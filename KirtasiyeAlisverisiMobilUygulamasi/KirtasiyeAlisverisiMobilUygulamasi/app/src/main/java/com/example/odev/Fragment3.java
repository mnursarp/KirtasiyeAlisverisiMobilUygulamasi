package com.example.odev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Fragment;

public class Fragment3 extends Fragment {
    int counter = 0;
    View view;
    ImageView kitap;
    TextView text3;
    Button satinal3;
    Button arttir3;
    Button azalt3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_3, container, false);
        kitap = (ImageView) view.findViewById(R.id.kitap);
        satinal3 = (Button) view.findViewById(R.id.satinal3);
        text3 = (TextView) view.findViewById(R.id.text3);
        arttir3 = (Button) view.findViewById(R.id.arttir3);
        azalt3 = (Button) view.findViewById(R.id.azalt3);
        arttir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                text3.setText(Integer.toString(counter));
            }
        });
        azalt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                text3.setText(Integer.toString(counter));
            }
        });
        satinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ürün sepete eklendi", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

