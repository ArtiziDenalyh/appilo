package com.example.loginandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginandroid.Interfaz.PeticionUsuario;
import com.example.loginandroid.Model.Usuario;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class LoginActivity extends AppCompatActivity {
    public Retrofit varRetro;
    public String status;
    public Button  btn_login;
    public TextInputEditText txtCorreo;
    public TextInputEditText txtContrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.btnIniciarSesion);
        txtCorreo = (TextInputEditText) findViewById(R.id.in_correo);
        txtContrasenia = (TextInputEditText) findViewById(R.id.in_contrasenia1);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtCorreo.getText().length() == 0){
                    txtCorreo.setError("Se requiere que ingrese un correo");

                }else if(txtContrasenia.getText().length() == 0){
                    txtContrasenia.setError("Se requiere que ingrese su contraseña");
                }else{
                    varRetro = new Retrofit.Builder()
                            .baseUrl("https://viqoxwhm.lucusvirtual.es/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    PeticionUsuario peticion = varRetro.create(PeticionUsuario.class);
                    Usuario usuario = new Usuario();
                    usuario.setEmail(txtCorreo.getText().toString());
                    usuario.setPassword(txtContrasenia.getText().toString());
                    Call<Usuario> login = peticion.verificarUsuario(usuario);
                    login.enqueue(new Callback<Usuario>() {
                        @Override
                        public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                            Usuario usuario = response.body();
                            if (!response.isSuccessful()){
                                Toast.makeText(getApplicationContext(), "Error: " + response.code() + "correo o contraseña invalida", Toast.LENGTH_LONG).show();
                            }else{
                                if(usuario.getStatus().equals("Verificado")){
                                    String content = "";
                                    content+= usuario.getName()+"\t";
                                    content+= usuario.getLastname_pat()+"\t";
                                    content+= usuario.getLastname_mat()+"\t";
                                    Toast.makeText(getApplicationContext(), "Bienvenido "+ content, Toast.LENGTH_LONG).show();
                                    Intent newIntent = new Intent(getApplicationContext(), pokeApi.class);
                                    startActivity(newIntent);
                                }else if(usuario.getStatus().equals("error")){
                                    String content = "";
                                    content+= usuario.getMensaje();
                                    Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
                                }
                            }

                        }

                        @Override
                        public void onFailure(Call<Usuario> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "Error algo salio mal", Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        });
    }
    public void irRegistro(View view){
        Toast.makeText(getApplicationContext(), "Cargando...", Toast.LENGTH_LONG).show();
        /*Intent i = new Intent(LoginActivity.this, RegistroActivity.class);
        startActivity(i);*/
        Intent newIntent = new Intent(getApplicationContext(), RegistroActivity.class);
        startActivity(newIntent);
    }
}