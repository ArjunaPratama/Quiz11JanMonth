package com.arjuna.quiz11janmonth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBulan;
    TextView txtHasil;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id widget
        etBulan = (EditText)findViewById(R.id.etBulan);
        btnHasil = (Button) findViewById(R.id.btnHasil);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nMonth = etBulan.getText().toString();
                if (nMonth.equalsIgnoreCase("Januari")){
                    txtHasil.setText("Bulan Ke 1");
                }else if (nMonth.equalsIgnoreCase("Februari")){
                    txtHasil.setText("Bulan Ke 2");
                }else if (nMonth.equalsIgnoreCase("Maret")){
                    txtHasil.setText("Bulan Ke 3");
                }else if (nMonth.equalsIgnoreCase("April")){
                    txtHasil.setText("Bulan Ke 4");
                }else if (nMonth.equalsIgnoreCase("Mei")){
                    txtHasil.setText("Bulan Ke 5");
                }else if (nMonth.equalsIgnoreCase("Juni")) {
                    txtHasil.setText("Bulan Ke 6");
                }else if (nMonth.equalsIgnoreCase("Juli")) {
                    txtHasil.setText("Bulan Ke 7");
                }else if (nMonth.equalsIgnoreCase("Agustus")) {
                    txtHasil.setText("Bulan Ke 8");
                }else if (nMonth.equalsIgnoreCase("September")) {
                    txtHasil.setText("Bulan Ke 9");
                }else if (nMonth.equalsIgnoreCase("Oktober")) {
                    txtHasil.setText("Bulan Ke 10");
                }else if (nMonth.equalsIgnoreCase("November")) {
                    txtHasil.setText("Bulan Ke 11");
                }else if (nMonth.equalsIgnoreCase("Desember")) {
                    txtHasil.setText("Bulan Ke 12");
                }
            }
        });
    }
}
