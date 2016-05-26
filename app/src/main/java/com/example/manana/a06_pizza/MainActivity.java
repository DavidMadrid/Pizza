package com.example.manana.a06_pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Pizza>pizzas = TiposPizzas.MenuPizzas();
        ListView lvPizzas= (ListView) findViewById(R.id.lvPizzas);
        findViewById(R.id.btnIngredientes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,IngredientesActivity.class);
                MainActivity.this.startActivityForResult(intent, 0);
//comitdadsadadadadsad
            }
        });
        PizzasArrayAdapter adapter = new PizzasArrayAdapter();
       lvPizzas.setAdapter(adapter);



    }
}
