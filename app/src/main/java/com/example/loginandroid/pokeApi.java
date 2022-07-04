package com.example.loginandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginandroid.Interfaz.PeticionUsuario;
import com.example.loginandroid.Model.Pokemon;
import com.example.loginandroid.Model.Stats;
import com.example.loginandroid.Model.Usuario;

import java.io.InputStream;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class pokeApi extends AppCompatActivity {

    private Button btn;
    public Retrofit varRetro;
    EditText txtUserPokeName;
    /* Recursos */

    TextView txtPoke;
    private ImageView imgPoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_api);
        btn = (Button) findViewById(R.id.btn);
        txtUserPokeName = (EditText) findViewById(R.id.txtUserPokeName);
        txtPoke = (TextView) findViewById(R.id.textView3);
    }

    public void onClickAPI(View view){

        String userPokeName = txtUserPokeName.getText().toString();
        if(userPokeName.length() == 0){
            txtUserPokeName.setError("Ingrese el nombre del  pokemon");
        }else{
            varRetro = new Retrofit.Builder()
                    .baseUrl("https://pokeapi.co/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            PeticionUsuario peticionPokemon = varRetro.create(PeticionUsuario.class);
            Call<Pokemon> pokemon = peticionPokemon.getPokemon(userPokeName);
            pokemon.enqueue(new Callback<Pokemon>() {
                @Override
                public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                    if (!response.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Error intentalo de nuevo", Toast.LENGTH_LONG).show();
                    }else{
                        String poke = "";
                        Pokemon pokemon = response.body();
                        poke +="ID: "+pokemon.getId()+"\n";
                        poke +="Nombre: "+pokemon.getName()+"\n";
                        poke +="Altura: "+pokemon.getName()+"\n";
                        poke +="peso: "+pokemon.getName()+"\n";
                        poke +="Estadistica: \n";
                        poke +="HP: "+ Integer.toString(pokemon.getStats().get(0).getBase_stat())+"\n";
                        poke +="Ataque: "+ Integer.toString(pokemon.getStats().get(1).getBase_stat())+"\n";
                        poke +="Defensa: "+Integer.toString(pokemon.getStats().get(2).getBase_stat())+"\n";
                        poke +="Ataque especial: "+ Integer.toString(pokemon.getStats().get(3).getBase_stat())+"\n";
                        poke +="Velocidad: "+ Integer.toString(pokemon.getStats().get(4).getBase_stat())+"\n";
                        txtPoke.setText(poke);
                    }
                }
                @Override
                public void onFailure(Call<Pokemon> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "Error intentalo de nuevo", Toast.LENGTH_LONG).show();
                }
            });
        }
    }


}