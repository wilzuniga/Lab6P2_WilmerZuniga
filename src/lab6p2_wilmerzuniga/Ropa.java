
package lab6p2_wilmerzuniga;

public class Ropa extends Cosa{
    char Talla;
    String Tela;
    String Pais;

    public Ropa() {
    }

    public Ropa(char Talla, String Tela, String Pais, String Descripcion, String Marca, String Tamaño, int Calidad, Personas Persona, java.awt.Color Color) {
        super(Descripcion, Marca, Tamaño, Calidad, Persona, Color);
        this.Talla = Talla;
        this.Tela = Tela;
        this.Pais = Pais;
    }

    public char getTalla() {
        return Talla;
    }

    public void setTalla(char Talla) {
        this.Talla = Talla;
    }

    public String getTela() {
        return Tela;
    }

    public void setTela(String Tela) {
        this.Tela = Tela;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
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
        return "Ropa{" + "Talla=" + Talla + ", Tela=" + Tela + ", Pais=" + Pais + '}';
    }
    
    
}
