/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamientonivel;

import java.awt.Panel;

/**
 *
 * @author vanes
 */
public class class_auto {
    
    private String RangoLog;
    //Atributos auto
    private String placa;
    private String tipo;
    private String marca;
    private int modelo;
    private String color;
    private String hora;
    private String fecha;

    //Atributos de usuario
    private String propietario;
    private int telefono;
    private String direccion;
    
    //Atributos del lugar
    private String disponibolidad;
    private int lugar;
    
    //Constructores
    //Pension
    public class_auto(String placa, String tipo, String marca, int modelo, String color, String hora, String fecha, String propietario, int telefono, String direccion, int lugar, String disponibolidad) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.hora = hora;
        this.fecha = fecha;
        this.propietario = propietario;
        this.telefono = telefono;
        this.direccion = direccion;
        this.lugar = lugar;
        this.disponibolidad = disponibolidad;
    }
    
    //Hora / fraccion
    public class_auto(String placa, String hora, String fecha, int lugar, String disponibolidad) {
        this.placa = placa;
        this.hora = hora;
        this.fecha = fecha;
        this.lugar = lugar;
        this.disponibolidad = disponibolidad;
    }

    public class_auto(int lugar, String disponibilidad) {
        this.lugar = lugar;
        this.disponibolidad=disponibilidad;
    }

    public class_auto(String RangoLog) {
        this.RangoLog = RangoLog;
    }

    public class_auto() {
    }
    
    
    
    //Getters and setters

    public String getRangoLog() {
        return RangoLog;
    }

    public void setRangoLog(String RangoLog) {
        this.RangoLog = RangoLog;
    }
    
    
    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDisponibolidad() {
        return disponibolidad;
    }

    public void setDisponibolidad(String disponibolidad) {
        this.disponibolidad = disponibolidad;
    }
    
    
    
    
}
