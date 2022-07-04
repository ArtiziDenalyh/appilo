package com.example.loginandroid.Model;

public class Usuario {
    private int ID;
    private int id;
    private String name;
    private String lastname_pat;
    private String lastname_mat;
    private String apPat;
    private String apMat;
    private String email;
    private String password;
    private String contrasenia2;
    private String fechaNacimiento;
    private String fecha_nacimiento;
    private String codigoConfirmacion;
    private String code;
    private String validate;
    private String tokenRecovery;
    private String create_at;
    private String update_at;
    private String estatus;

    private String status;
    private String mensaje;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public Usuario() {
    }

    public Usuario(int ID, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String contrasenia, String contrasenia2, String fechaNacimiento, String status, String codigoConfirmacion, String tokenRecovery, String create_at, String update_at, String estatus, String mensaje) {
        this.ID = ID;
        this.name = nombre;
        this.lastname_pat = apellidoPaterno;
        this.lastname_mat = apellidoMaterno;
        this.email = correo;
        this.password = contrasenia;
        this.contrasenia2 = contrasenia2;
        this.fechaNacimiento = fechaNacimiento;
        this.status = status;
        this.codigoConfirmacion = codigoConfirmacion;
        this.tokenRecovery = tokenRecovery;
        this.create_at = create_at;
        this.update_at = update_at;
        this.estatus = estatus;
        this.mensaje = mensaje;
    }
    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String contrasenia, String contrasenia2, String fechaNacimiento) {
        this.name = nombre;
        this.lastname_pat = apellidoPaterno;
        this.lastname_mat = apellidoMaterno;
        this.email = correo;
        this.password = contrasenia;
        this.contrasenia2 = contrasenia2;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(int ID, int id, String name, String lastname_pat, String lastname_mat, String apPat, String apMat, String email, String password, String contrasenia2, String fechaNacimiento, String feecha_nacimiento, String codigoConfirmacion, String code, String tokenRecovery, String create_at, String update_at, String estatus, String status, String mensaje, String message) {
        this.ID = ID;
        this.id = id;
        this.name = name;
        this.lastname_pat = lastname_pat;
        this.lastname_mat = lastname_mat;
        this.apPat = apPat;
        this.apMat = apMat;
        this.email = email;
        this.password = password;
        this.contrasenia2 = contrasenia2;
        this.fechaNacimiento = fechaNacimiento;
        this.fecha_nacimiento = feecha_nacimiento;
        this.codigoConfirmacion = codigoConfirmacion;
        this.code = code;
        this.tokenRecovery = tokenRecovery;
        this.create_at = create_at;
        this.update_at = update_at;
        this.estatus = estatus;
        this.status = status;
        this.mensaje = mensaje;
        this.message = message;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname_pat() {
        return lastname_pat;
    }

    public void setLastname_pat(String lastname_pat) {
        this.lastname_pat = lastname_pat;
    }

    public String getLastname_mat() {
        return lastname_mat;
    }

    public void setLastname_mat(String lastname_mat) {
        this.lastname_mat = lastname_mat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContrasenia2() {
        return contrasenia2;
    }

    public void setContrasenia2(String contrasenia2) {
        this.contrasenia2 = contrasenia2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodigoConfirmacion() {
        return codigoConfirmacion;
    }

    public void setCodigoConfirmacion(String codigoConfirmacion) {
        this.codigoConfirmacion = codigoConfirmacion;
    }

    public String getTokenRecovery() {
        return tokenRecovery;
    }

    public void setTokenRecovery(String tokenRecovery) {
        this.tokenRecovery = tokenRecovery;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
