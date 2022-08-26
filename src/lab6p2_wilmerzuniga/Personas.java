package lab6p2_wilmerzuniga;

public class Personas {
    long Id;
    String Nombre;
    int Edad;
    String Genero;
    String EstadoCivil;
    int Altura;
    double Peso;

    public Personas() {
    }

    public Personas(long Id, String Nombre, int Edad, String Genero, String EstadoCivil, int Altura, double Peso) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.EstadoCivil = EstadoCivil;
        this.Altura = Altura;
        this.Peso = Peso;
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

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Personas{" + "Id=" + Id + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Genero=" + Genero + ", EstadoCivil=" + EstadoCivil + ", Altura=" + Altura + ", Peso=" + Peso + '}';
    }
    
    
    
}
