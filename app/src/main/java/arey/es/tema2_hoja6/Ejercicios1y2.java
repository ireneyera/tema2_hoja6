package arey.es.tema2_hoja6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Ejercicios1y2 extends AppCompatActivity {

    public static final String TAG = "Ejercicios1y2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        Intent anIntent;
        switch (id) {
            case R.id.plusEj1: anIntent = new Intent(Intent.ACTION_VIEW);
                anIntent.setData(Uri.parse("http://www.google.com"));
                startActivity(anIntent);
                return true;

            case R.id.callEj1: anIntent = new Intent(Intent.ACTION_DIAL);
                anIntent.setData(Uri.parse("tel:666777666"));
                startActivity(anIntent);
                return true;

            case R.id.firstEj1: Log.i(TAG, "Se ha llamado a la primera acción oculta"); return true;
            case R.id.secondEj1: Log.i(TAG, "Se ha llamado a la segunda acción oculta");
                anIntent = new Intent(this, Ejercicio4.class);
                startActivity(anIntent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
