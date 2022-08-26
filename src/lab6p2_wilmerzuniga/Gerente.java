package lab6p2_wilmerzuniga;

public class Gerente extends Personas{

    String Usuario;
    String Contraseña;
    String Cargo;

    public Gerente() {
    }

    public Gerente(String Usuario, String Contraseña, String Cargo, long Id, String Nombre, int Edad, String Genero, String EstadoCivil, int Altura, int Peso) {
        super(Id, Nombre, Edad, Genero, EstadoCivil, Altura, Peso);
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Cargo = Cargo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Gerente{" + "Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Cargo=" + Cargo + '}';
    }
    
    
    

}
