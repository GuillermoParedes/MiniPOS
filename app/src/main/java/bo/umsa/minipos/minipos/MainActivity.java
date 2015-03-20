package bo.umsa.minipos.minipos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    // En un vector las imagenes del archivo
    int articulos[] = {
            R.drawable.ven001,
            R.drawable.ven002,
            R.drawable.ven003,
            R.drawable.ven004,
            R.drawable.ven005,
            R.drawable.ven006
    };
    // Los precios de las imagenes en el mismo orden que los articulos
    int precios[] = {950, 880, 120, 2800, 650, 520 };

    int position; // posicion de las imagenes
    ImageView articulosImg ; //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articulosImg = (ImageView) findViewById(R.id.carrusel);
        articulosImg.setImageResource(articulos[0]);
        position = 0;

    }

    public void siguiente(View view){
        articulosImg = (ImageView) findViewById(R.id.carrusel);
        position = this.position;
        Toast.makeText(this,position,Toast.LENGTH_SHORT).show();
        switch (position){
            case  0 :
                position = position++;
                articulosImg.setImageResource(articulos[position]);
                break;
            case 1 :
                position = position++;
                articulosImg.setImageResource(articulos[position]);
                break;
            case 2 :
                position = position++;
                articulosImg.setImageResource(articulos[position]);
                break;
            case 3 :
                position = position++;
                articulosImg.setImageResource(articulos[position]);
                break;
            case 4 :
                position = position++;
                articulosImg.setImageResource(articulos[position]);
                break;
            case 5 :
                position = position++;
                articulosImg.setImageResource(articulos[position]);
                break;
            case 6 :
                position = 0;
                articulosImg.setImageResource(articulos[position]);
                break;
        }

    }
}
