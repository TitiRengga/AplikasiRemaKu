package com.example.remaku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.remaku.DataAdapter;
import com.example.remaku.DataModel;
import com.example.remaku.R;

import java.util.ArrayList;

public class CariResepActivity extends AppCompatActivity {

    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList dataModelArrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cariresep);

        //membuat data yang akan ditampilkan dalam list
        //file .html mengambil di folder assets
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
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this, dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        /*//menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0, headerModel);*/

    }

    //fungsi input
    public void inputData(String judul, String konten) {
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

}