
package lab6p2_wilmerzuniga;

/**
 *
 * @author wilme
 */
public class Personita extends Personas{
    String Ocupacion;
    String Horario;
    int Semanas;
    int Sueldo;

    public Personita() {
    }

    public Personita(long Id, String Nombre, int Edad, String Genero, String EstadoCivil, int Altura, int Peso) {
        super(Id, Nombre, Edad, Genero, EstadoCivil, Altura, Peso);
    }

    public Personita(String Ocupacion, String Horario, int Semanas, int Sueldo, long Id, String Nombre, int Edad, String Genero, String EstadoCivil, int Altura, int Peso) {
        super(Id, Nombre, Edad, Genero, EstadoCivil, Altura, Peso);
        this.Ocupacion = Ocupacion;
        this.Horario = Horario;
        this.Semanas = Semanas;
        this.Sueldo = Sueldo;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getSemanas() {
        return Semanas;
    }

    public void setSemanas(int Semanas) {
        this.Semanas = Semanas;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
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
        return "Personita{" + "Ocupacion=" + Ocupacion + ", Horario=" + Horario + ", Semanas=" + Semanas + ", Sueldo=" + Sueldo + '}';
    }
    
    
    
}
