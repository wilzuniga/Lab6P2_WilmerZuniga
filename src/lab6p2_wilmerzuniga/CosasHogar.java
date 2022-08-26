package lab6p2_wilmerzuniga;

public class CosasHogar extends Cosa{
    String Instrucciones;
    String Lugar;
    String Garantia;

    public CosasHogar() {
    }

    public CosasHogar(String Instrucciones, String Lugar, String Garantia, String Descripcion, String Marca, String Tamaño, int Calidad, Personas Persona, java.awt.Color Color) {
        super(Descripcion, Marca, Tamaño, Calidad, Persona, Color);
        this.Instrucciones = Instrucciones;
        this.Lugar = Lugar;
        this.Garantia = Garantia;
    }

    public String getInstrucciones() {
        return Instrucciones;
    }

    public void setInstrucciones(String Instrucciones) {
        this.Instrucciones = Instrucciones;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
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
        return "CosasHogar{" + "Instrucciones=" + Instrucciones + ", Lugar=" + Lugar + ", Garantia=" + Garantia + '}';
    }
    
    
}
