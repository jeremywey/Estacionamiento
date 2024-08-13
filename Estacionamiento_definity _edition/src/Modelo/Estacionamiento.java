/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Cubiculo> listaCubiculos;
    private ArrayList<Persona> listaPersonasAutorizadas;
    private ArrayList<Registro> listaRegistros;
    
    public Estacionamiento() {
        this.listaCubiculos = new ArrayList<>();
        this.listaPersonasAutorizadas = new ArrayList<>();
        this.listaRegistros = new ArrayList<>();
    }

    public void agregarPersonaAutorizada(Persona persona) {
        listaPersonasAutorizadas.add(persona);
    }

    public void agregarCubiculo(Cubiculo cubiculo) {
        listaCubiculos.add(cubiculo);
    }

    public Cubiculo buscarCubiculoDisponible(String tipoVehiculo) {
        for (Cubiculo cubiculo : listaCubiculos) {
            if (cubiculo.getTipoCubiculo().equals(tipoVehiculo) && cubiculo.getEstado().equals("Libre")) {
                return cubiculo;
            }
        }
        return null;
    }

    public void asignarCubiculo(Persona persona, Vehiculo vehiculo) {
        Cubiculo cubiculo = buscarCubiculoDisponible(vehiculo.getTipoVehiculo());
        if (cubiculo != null) {
            cubiculo.reservarCubiculo();
            System.out.println("Cubículo asignado a " + persona.getNombre() + ": " + cubiculo.getNumeroCubiculo());
        } else {
            System.out.println("No hay cubículos disponibles para " + vehiculo.getTipoVehiculo());
        }
    }

    public void liberarCubiculo(int numeroCubiculo) {
        for (Cubiculo cubiculo : listaCubiculos) {
            if (cubiculo.getNumeroCubiculo() == numeroCubiculo) {
                cubiculo.liberarCubiculo();
                System.out.println("Cubículo " + numeroCubiculo + " liberado.");
                return;
            }
        }
        System.out.println("Cubículo no encontrado.");
    }
    
    public void registrarEntrada(Persona persona, Vehiculo vehiculo) {
        Cubiculo cubiculo = buscarCubiculoDisponible(vehiculo.getTipoVehiculo());
        if (cubiculo != null) {
            cubiculo.reservarCubiculo();
            Registro registro = new Registro(persona, vehiculo, cubiculo, LocalDateTime.now());
            listaRegistros.add(registro);
            System.out.println("Entrada registrada: " + registro);
        } else {
            System.out.println("No hay cubículos disponibles para " + vehiculo.getTipoVehiculo());
        }
    }
    
     public void registrarSalida(Persona persona) {
        for (Registro registro : listaRegistros) {
            if (registro.getPersona().equals(persona) && registro.getFechaHoraSalida() == null) {
                registro.registrarSalida(LocalDateTime.now());
                liberarCubiculo(registro.getCubiculo().getNumeroCubiculo());
                System.out.println("Salida registrada: " + registro);
                return;
            }
        }
        System.out.println("No se encontró un registro de entrada para " + persona.getNombre());
    }
     
      public void mostrarRegistros() {
        for (Registro registro : listaRegistros) {
            System.out.println(registro);
        }
    }
}

