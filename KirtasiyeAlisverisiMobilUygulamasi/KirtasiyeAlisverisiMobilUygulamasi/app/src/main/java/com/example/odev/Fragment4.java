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

public class Fragment4 extends Fragment {
    int counter = 0;
    View view;
    ImageView kalem;
    TextView text4;
    Button satinal4;
    Button arttir4;
    Button azalt4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_4, container, false);
        kalem = (ImageView) view.findViewById(R.id.kalem);
        satinal4 = (Button) view.findViewById(R.id.satinal4);
        text4 = (TextView) view.findViewById(R.id.text4);
        arttir4 = (Button) view.findViewById(R.id.arttir4);
        azalt4 = (Button) view.findViewById(R.id.azalt4);

        arttir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                text4.setText(Integer.toString(counter));
            }
        });
        azalt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                text4.setText(Integer.toString(counter));
            }
        });
        satinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ürün sepete eklendi", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

