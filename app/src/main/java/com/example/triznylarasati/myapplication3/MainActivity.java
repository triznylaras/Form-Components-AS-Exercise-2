package com.example.triznylarasati.myapplication3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_component2);
        Button submit_btn2 = (Button) findViewById(R.id.submit_btn2);
        Button exit_btn = (Button) findViewById(R.id.exit_btn);
        final CheckBox ckbox1 = (CheckBox) findViewById(R.id.ckbox1);
        final CheckBox ckbox2 = (CheckBox) findViewById(R.id.ckbox2);
        CheckBox ckbox3 = (CheckBox) findViewById(R.id.ckbox3);

        submit_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(ckbox1.isChecked()){
                    Toast.makeText(MainActivity.this, "Kucing", Toast.LENGTH_SHORT).show();
                }
                else if (ckbox2.isChecked()){
                    Toast.makeText(MainActivity.this, "Kelinci", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Burung", Toast.LENGTH_SHORT).show();
                }
            }
        });
        exit_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showDialog();
            }
        });
        private void showDialog(){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
        //judul dialog
        alert.setTitle("Keluar dari aplikasi ini?");

        //set pesan dari dialog
        alert.setMessage("Klik Yes untuk keluar");
        alert.setIcon(R.mipmap.ic_launcher);
        alert.setCancelable(false);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                //jika tombol diklik maka aplikasi akan tertutup
                Toast.makeText(MainActivity.this, "Tombol Yes diklik", Toast.LENGTH_SHORT).show();
            }
        });
        alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });
        alert.show();
    }
    });
}
