/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import Modelo.*;

public class Chocotaco {
    public static void main(String[] args) {
        // Crear el estacionamiento
        Estacionamiento estacionamiento = new Estacionamiento();

        // Crear y agregar cubículos
        Cubiculo cubiculo1 = new Cubiculo(1, "Auto", "5x3");
        Cubiculo cubiculo2 = new Cubiculo(2, "Moto", "2x2");
        estacionamiento.agregarCubiculo(cubiculo1);
        estacionamiento.agregarCubiculo(cubiculo2);

        // Crear un Funcionario
        Funcionario funcionario = new Funcionario("Juan Pérez", "123456789");

        // Crear un Vehículo
        Vehiculo vehiculo = new Vehiculo("ABC-123", "Toyota", "Auto");

        // Agregar persona autorizada
        estacionamiento.agregarPersonaAutorizada(funcionario);

        // Registrar la entrada del vehículo
        estacionamiento.registrarEntrada(funcionario, vehiculo);

        // Mostrar todos los registros
        estacionamiento.mostrarRegistros();

        // Registrar la salida del vehículo
        estacionamiento.registrarSalida(funcionario);

        // Mostrar todos los registros nuevamente
        estacionamiento.mostrarRegistros();
    }
}
