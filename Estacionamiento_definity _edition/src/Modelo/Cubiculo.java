/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Cubiculo {
    private int numeroCubiculo;
    private String tipoCubiculo; // "Moto" o "Auto"
    private String estado; // "Libre", "Ocupado", "Reservado"
    private String dimensiones;

    public Cubiculo(int numeroCubiculo, String tipoCubiculo, String dimensiones) {
        this.numeroCubiculo = numeroCubiculo;
        this.tipoCubiculo = tipoCubiculo;
        this.dimensiones = dimensiones;
        this.estado = "Libre";
    }

    public int getNumeroCubiculo() {
        return numeroCubiculo;
    }

    public String getTipoCubiculo() {
        return tipoCubiculo;
    }

    public String getEstado() {
        return estado;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void reservarCubiculo() {
        if (estado.equals("Libre")) {
            this.estado = "Reservado";
        } else {
            System.out.println("El cubículo no está disponible para reservar.");
        }
    }

    public void liberarCubiculo() {
        this.estado = "Libre";
    }
}
