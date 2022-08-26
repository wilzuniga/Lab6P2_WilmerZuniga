package lab6p2_wilmerzuniga;

import java.awt.Color;

public class Cosa {
    String Descripcion;
    String Marca;
    String Tamaño;
    int Calidad;
    Personas Persona;
    Color Color;

    public Cosa(String Descripcion, String Marca, String Tamaño, int Calidad, Personas Persona, Color Color) {
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Tamaño = Tamaño;
        this.Calidad = Calidad;
        this.Persona = Persona;
        this.Color = Color;
    }

    public Cosa() {
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getCalidad() {
        return Calidad;
    }

    public void setCalidad(int Calidad) {
        this.Calidad = Calidad;
    }

    public Personas getPersona() {
        return Persona;
    }

    public void setPersona(Personas Persona) {
        this.Persona = Persona;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Cosa{" + "Descripcion=" + Descripcion + ", Marca=" + Marca + ", Tama\u00f1o=" + Tamaño + ", Calidad=" + Calidad + ", Persona=" + Persona + ", Color=" + Color + '}';
    }

    
    
}
