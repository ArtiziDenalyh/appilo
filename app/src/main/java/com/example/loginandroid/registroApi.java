/*package com.example.loginandroid;
import com.example.loginandroid.Interfaz.PeticionUsuario;
import com.example.loginandroid.Model.Usuario;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class registroApi {
    public String error;
    public static String URL = "https://jnmlvuvn.lucusvirtual.es/api/auth/";
    public static Retrofit varRetro;

    public void registrar(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Contrasenia, String Contrasenia2, String FechaNacimiento) {
        varRetro = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        PeticionUsuario consApi = varRetro.create(PeticionUsuario.class);
        Usuario usu=new Usuario(Nombre, ApellidoPaterno, ApellidoMaterno, Correo,Contrasenia, Contrasenia2, FechaNacimiento);
        Call<Usuario> call = consApi.registrar(usu);
            call.enqueue(new Callback<Usuario>() {
                @Override
                public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                    try {
                        if (response.isSuccessful()) {
                            Usuario m = response.body();
                            System.out.println(call);
                            System.out.println(m.getName());
                            System.out.println(m.getEmail());

                        }
                    } catch (Exception ex) {
                        System.out.println("UWUn't " + ex);
                    }
               /* Usuario usu=response.body();
                String content="";
                content+="Nombre: "+usuario.getNombre()+"\n";
                content+="Apellido Paterno: "+usuario.getApellidoPaterno()+"\n";
                content+="Apellido Materno: "+usuario.getApellidoMaterno()+"\n";
                content+="Correo: "+usuario.getCorreo()+"\n";
                content+="Contraseña: "+usuario.getContrasenia()+"\n";
                content+="Fecha: nacimiento"+usuario.getFechaNacimiento()+"\n";*/
                //}

//                @Override
            /*    public void onFailure(Call<Usuario> call, Throwable t) {
                    error="¡Falló!";
                }
            });

    }
}*/