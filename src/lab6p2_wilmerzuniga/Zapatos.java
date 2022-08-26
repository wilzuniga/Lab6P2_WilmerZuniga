
package lab6p2_wilmerzuniga;

public class Zapatos extends Cosa{
    int Talla;
    String DescripcionSuela;
    int Comodidad;

    public Zapatos() {
    }

    public Zapatos(char Talla, String DescripcionSuela, int Comodidad, String Descripcion, String Marca, String Tamaño, int Calidad, Personas Persona, java.awt.Color Color) {
        super(Descripcion, Marca, Tamaño, Calidad, Persona, Color);
        this.Talla = Talla;
        this.DescripcionSuela = DescripcionSuela;
        this.Comodidad = Comodidad;
    }

    public int getTalla() {
        return Talla;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    public String getDescripcionSuela() {
        return DescripcionSuela;
    }

    public void setDescripcionSuela(String DescripcionSuela) {
        this.DescripcionSuela = DescripcionSuela;
    }

    public int getComodidad() {
        return Comodidad;
    }

    public void setComodidad(int Comodidad) {
        this.Comodidad = Comodidad;
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

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "Talla=" + Talla + ", DescripcionSuela=" + DescripcionSuela + ", Comodidad=" + Comodidad + '}';
    }
    
    
    
}
