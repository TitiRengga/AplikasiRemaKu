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
        inputData("Ayam Bakar Bumbu Bali", "artikel_1.html");
        inputData("Sate Ayam Srepeh", "artikel_2.html");
        inputData("Pizza Sosis Jumbo (Tanpa Ulen)", "artikel_3.html");
        inputData("Nasgor Mawut (Mawut Sayur)", "artikel_4.html");
        inputData("Fuyung Hai", "artikel_5.html");
        inputData("Lobster Bumbu Padang", "artikel_6.html");
        inputData("Sop Iga Sapi", "artikel_7.html");
        inputData("Opor Ayam Kampung", "artikel_8.html");
        inputData("Bebek Goreng Sambel Ijo", "artikel_9.html");
        inputData("Soto Ayam Kampung", "artikel_10.html");
        inputData("Bakso Ayam", "artikel_11.html");
        inputData("Ikan Gurame Bakar", "artikel_12.html");
        inputData("Pisang Bakar Coklat Keju", "artikel_13.html");
        inputData("Keto Martabak Terang Bulan", "artikel_14.html");
        inputData("Ingkung Ayam Kampung", "artikel_15.html");
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
