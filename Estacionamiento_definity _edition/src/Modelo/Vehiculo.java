/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String tipoVehiculo; // "Moto" o "Auto"

    public Vehiculo(String matricula, String marca, String tipoVehiculo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
}
