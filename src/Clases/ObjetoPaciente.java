package Clases;
public class ObjetoPaciente{
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private int numeroTelefono;
    private Long numeroMovil;
    private String direccion;
    private String genero;
    private String correo;
    private String fechaNacimiento;
    private int edad;
    private String estadoCivil;
    private int paisNacimiento;
    private int ciudadNacimiento;
    private String profesion;
    private String tipoSangre;
    private String fechaIngreso;
    private int eps;
    private String formaPago;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private String franquicia;
    private String numeroCheque;
    private String banco;
    private String foto;
    private String estado;
    //CONSTRUCTOR
    public ObjetoPaciente(String tipoDocumento,String numeroDocumento,String nombres,String primerApellido,String segundoApellido,int numeroTelefono,long numeroMovil,String direccion,String genero,String correo,String fechaNacimiento,int edad,String estadoCivil,int paisNacimiento,int ciudadNacimiento,String profesion,String tipoSangre,String fechaIngreso,int eps,String formaPago,String numeroTarjeta,String tipoTarjeta,String franquicia,String numeroCheque,String banco,String foto,String estado){
        this.tipoDocumento=tipoDocumento;
        this.numeroDocumento=numeroDocumento;
        this.nombres=nombres;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
        this.numeroTelefono=numeroTelefono;
        this.numeroMovil=numeroMovil;
        this.direccion=direccion;
        this.genero=genero;
        this.correo=correo;
        this.fechaNacimiento=fechaNacimiento;
        this.edad=edad;
        this.estadoCivil=estadoCivil;
        this.paisNacimiento=paisNacimiento;
        this.ciudadNacimiento=ciudadNacimiento;
        this.profesion=profesion;
        this.tipoSangre=tipoSangre;
        this.fechaIngreso=fechaIngreso;
        this.eps=eps;
        this.formaPago=formaPago;
        this.numeroTarjeta=numeroTarjeta;
        this.tipoTarjeta=tipoTarjeta;
        this.franquicia=franquicia;
        this.numeroCheque=numeroCheque;
        this.banco=banco;
        this.foto=foto;
        this.estado=estado;}
    //GETTERS y SETTERS
    public String getTipoDocumento(){
        return tipoDocumento;}
    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;}
    public String getNumeroDocumento(){
        return numeroDocumento;}
    public void setNumeroDocumento(String numeroDocumento){
        this.numeroDocumento = numeroDocumento;}
    public String getNombres(){
        return nombres;}
    public void setNombres(String nombres){
        this.nombres = nombres;}
    public String getPrimerApellido(){
        return primerApellido;}
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;}
    public String getSegundoApellido(){
        return segundoApellido;}
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido = segundoApellido;}
    public int getNumeroTelefono(){
        return numeroTelefono;}
    public void setNumeroTelefono(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;}
    public Long getNumeroMovil(){
        return numeroMovil;}
    public void setNumeroMovil(Long numeroMovil){
        this.numeroMovil = numeroMovil;}
    public String getDireccion(){
        return direccion;}
    public void setDireccion(String direccion){
        this.direccion = direccion;}
    public String getGenero(){
        return genero;}
    public void setGenero(String genero){
        this.genero = genero;}
    public String getCorreo(){
        return correo;}
    public void setCorreo(String correo){
        this.correo = correo;}
    public String getFechaNacimiento(){
        return fechaNacimiento;}
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;}
    public int getEdad(){
        return edad;}
    public void setEdad(int edad){
        this.edad = edad;}
    public String getEstadoCivil(){
        return estadoCivil;}
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;}
    public int getPaisNacimiento(){
        return paisNacimiento;}
    public void setPaisNacimiento(int paisNacimiento){
        this.paisNacimiento = paisNacimiento;}
    public int getCiudadNacimiento(){
        return ciudadNacimiento;}
    public void setCiudadNacimiento(int ciudadNacimiento){
        this.ciudadNacimiento = ciudadNacimiento;}
    public String getProfesion(){
        return profesion;}
    public void setProfesion(String profesion){
        this.profesion = profesion;}
    public String getTipoSangre(){
        return tipoSangre;}
    public void setTipoSangre(String tipoSangre){
        this.tipoSangre = tipoSangre;}
    public String getFechaIngreso(){
        return fechaIngreso;}
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;}
    public int getEps(){
        return eps;}
    public void setEps(int eps){
        this.eps = eps;}
    public String getFormaPago(){
        return formaPago;}
    public void setFormaPago(String formaPago){
        this.formaPago = formaPago;}
    public String getNumeroTarjeta(){
        return numeroTarjeta;}
    public void setNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;}
    public String getTipoTarjeta(){
        return tipoTarjeta;}
    public void setTipoTarjeta(String tipoTarjeta){
        this.tipoTarjeta = tipoTarjeta;}
    public String getFranquicia(){
        return franquicia;}
    public void setFranquicia(String franquicia){
        this.franquicia = franquicia;}
    public String getNumeroCheque(){
        return numeroCheque;}
    public void setNumeroCheque(String numeroCheque){
        this.numeroCheque = numeroCheque;}
    public String getBanco(){
        return banco;}
    public void setBanco(String banco){
        this.banco = banco;}
    public String getFoto(){
        return foto;}
    public void setFoto(String foto){
        this.foto = foto;}
    public String getEstado(){
        return estado;}
    public void setEstado(String estado){
        this.estado = estado;}    
}
