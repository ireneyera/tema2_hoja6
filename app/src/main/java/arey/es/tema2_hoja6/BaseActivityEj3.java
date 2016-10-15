package arey.es.tema2_hoja6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivityEj3 extends AppCompatActivity {

    public static final String TAG = "Ejercicio3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // No necesario
        //setContentView(R.layout.activity_base_ej3);
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
            case R.id.secondEj1: Log.i(TAG, "Se ha llamado a la segunda acción ocula"); return true;
            case R.id.openEj12: anIntent = new Intent(this, Ejercicios1y2_paraEj3.class);
                startActivity(anIntent);
                Log.i(TAG, "Se ha a la activity 1 y 2");
                return true;
            case R.id.openEj3: anIntent = new Intent(this, Ejercicio3.class);
                startActivity(anIntent);
                Log.i(TAG, "Se ha a la activity 3");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
