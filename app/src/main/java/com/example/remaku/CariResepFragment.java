package com.example.remaku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CariResepFragment extends Fragment {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList dataModelArrayList = new ArrayList();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inputData("Ayam Bakar Madu", "artikel_1.html");
        inputData("Bakmi Ayam Jamur", "artikel_2.html");
        inputData("Bubble Tea", "artikel_3.html");
        inputData("Coklat Truffle", "artikel_4.html");
        inputData("Eggless Chocolate Mug Cake", "artikel_5.html");
        inputData("Lobster Bumbu Padang", "artikel_6.html");
        inputData("Spaghetti Aglio Olio", "artikel_7.html");
        inputData("Ramen Kuah Pedas", "artikel_8.html");
        inputData("Rendang Daging", "artikel_9.html");
        inputData("Sop Buah", "artikel_10.html");
        inputData("Tteokbokki", "artikel_11.html");
        inputData("Puding Brownis Coklat", "artikel_12.html");
        inputData("Pisang Bakar Coklat Keju", "artikel_13.html");
        inputData("Keto Martabak Terang Bulan", "artikel_14.html");
        inputData("Tongseng Kambing Istimewa", "artikel_15.html");
        //menampilkan data ke dalam recyclerView
        View view = inflater.inflate(R.layout.activity_cariresep, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(getActivity(), dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);
        return view;
    }

    public void inputData(String judul, String konten) {
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }


}
