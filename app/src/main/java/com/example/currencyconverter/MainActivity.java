package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText valor = findViewById(R.id.edit_value);
        valor.getText();


        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textLibra = findViewById(R.id.text_libra);
        this.mViewHolder.buttonCalculate = findViewById(R.id.buttonCalculate);


        this.mViewHolder.buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = mViewHolder.editValue.getText().toString();
                if ("".equals(value)){
                    Toast.makeText(getApplicationContext(),getString( R.string.informe_valor),Toast.LENGTH_LONG).show();
                } else{

                }
            }
        });


    }

    private  static class ViewHolder{
        EditText editValue;
        TextView textDolar;
        TextView textLibra;
        Button buttonCalculate;

    }

}
