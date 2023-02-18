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
public class Fragment2 extends Fragment {
    int counter = 0;
    View view;
    ImageView defter;
    TextView text;
    Button satinal;
    Button arttir;
    Button azalt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, container, false);
        defter = (ImageView) view.findViewById(R.id.defter);
        satinal = (Button) view.findViewById(R.id.satinal);
        text = (TextView) view.findViewById(R.id.text);
        arttir = (Button) view.findViewById(R.id.arttir);
        azalt = (Button) view.findViewById(R.id.azalt);
        arttir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                text.setText(Integer.toString(counter));
            }
        });
        azalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                text.setText(Integer.toString(counter));
            }
        });
        satinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ürün sepete eklendi", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}


