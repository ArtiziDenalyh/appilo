package com.example.loginandroid.Interfaz;

import com.example.loginandroid.Model.Pokemon;
import com.example.loginandroid.Model.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PeticionUsuario {
    @POST("registro")
    Call<Usuario> registrar(@Body Usuario usuario/*@Query("nombre") String nombre,
                                  @Query("apellidoPaterno") String paterno,
                                  @Query("apellidoMaterno") String materno,
                                  @Query("correo") String correo,
                                  @Query("contrasenia") String contrasenia,
                                  @Query("contrasenia2") String contrasenia2,
                                  @Query("fechaNacimiento") String fecha_Nacimiento*/);

    @POST("api/user/login")
    Call<Usuario> verificarUsuario(@Body Usuario usuario);

    @GET("api/v2/pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String name);

    /*@POST("recuperarContrasenia")
    Call<Usuario> recuperar(@Query("correo") String correo);

    @POST("codigo")
    Call<Usuario> codigo(@Query("codigo") String codigo);

    @POST("cambio/codigo")
    Call<Usuario> cambio(@Query("codigo") String codigo,
                         @Query("contrasenia") String contrasenia,
                         @Query("contrasenia2") String contrasenia2);*/
}
