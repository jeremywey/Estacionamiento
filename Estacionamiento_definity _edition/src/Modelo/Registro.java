/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

public class Registro {
    private Persona persona;
    private Vehiculo vehiculo;
    private Cubiculo cubiculo;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;

    public Registro(Persona persona, Vehiculo vehiculo, Cubiculo cubiculo, LocalDateTime fechaHoraEntrada) {
        this.persona = persona;
        this.vehiculo = vehiculo;
        this.cubiculo = cubiculo;
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public void registrarSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public Persona getPersona() {
        return persona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cubiculo getCubiculo() {
        return cubiculo;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "persona=" + persona.getNombre() +
                ", vehiculo=" + vehiculo.getMatricula() +
                ", cubiculo=" + cubiculo.getNumeroCubiculo() +
                ", fechaHoraEntrada=" + fechaHoraEntrada +
                ", fechaHoraSalida=" + (fechaHoraSalida != null ? fechaHoraSalida : "Aún en el estacionamiento") +
                '}';
    }
}

