/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import Modelo.Estacionamiento;
import Modelo.Estudiante;
import Modelo.Funcionario;
import Modelo.Persona;
import Modelo.Vehiculo;
import Modelo.Visitante;
import modelo.*;
import java.util.Scanner;

public class Chocotaco {
    private static Estacionamiento estacionamiento = new Estacionamiento();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menu de Estacionamiento ---");
            System.out.println("1. Registrar Funcionario");
            System.out.println("2. Registrar Estudiante");
            System.out.println("3. Registrar Visitante");
            System.out.println("4. Registrar Vehiculo");
            System.out.println("5. Registrar Entrada");
            System.out.println("6. Registrar Salida");
            System.out.println("7. Mostrar Registros");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    registrarFuncionario();
                    break;
                case 2:
                    registrarEstudiante();
                    break;
                case 3:
                    registrarVisitante();
                    break;
                case 4:
                    registrarVehiculo();
                    break;
                case 5:
                    registrarEntrada();
                    break;
                case 6:
                    registrarSalida();
                    break;
                case 7:
                    mostrarRegistros();
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no válida.");
            }
        }
    }

    private static void registrarFuncionario() {
        System.out.print("Ingrese el nombre del funcionario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la identificacion del funcionario: ");
        String identificacion = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nombre, identificacion);
        estacionamiento.agregarPersonaAutorizada(funcionario);
        System.out.println("Funcionario registrado exitosamente.");
    }

    private static void registrarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la identificacion del estudiante: ");
        String identificacion = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, identificacion);
        estacionamiento.agregarPersonaAutorizada(estudiante);
        System.out.println("Estudiante registrado exitosamente.");
    }

    private static void registrarVisitante() {
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la identificacion del visitante: ");
        String identificacion = scanner.nextLine();

        Visitante visitante = new Visitante(nombre, identificacion);
        estacionamiento.agregarPersonaAutorizada(visitante);
        System.out.println("Visitante registrado exitosamente.");
    }

    private static void registrarVehiculo() {
        System.out.print("Ingrese la matrícula del vehiculo: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el tipo de vehiculo (Moto/Auto): ");
        String tipoVehiculo = scanner.nextLine();

        Vehiculo vehiculo = new Vehiculo(matricula, marca, tipoVehiculo);
        System.out.println("vehiculo registrado exitosamente.");
    }

    private static void registrarEntrada() {
        System.out.print("Ingrese la identificacion de la persona: ");
        String identificacion = scanner.nextLine();

        Persona persona = buscarPersonaPorIdentificacion(identificacion);
        if (persona != null) {
            System.out.print("Ingrese la matricula del vehículo: ");
            String matricula = scanner.nextLine();
            Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);

            if (vehiculo != null) {
                estacionamiento.registrarEntrada(persona, vehiculo);
            } else {
                System.out.println("Vehiculo no encontrado.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void registrarSalida() {
        System.out.print("Ingrese la identificacion de la persona: ");
        String identificacion = scanner.nextLine();

        Persona persona = buscarPersonaPorIdentificacion(identificacion);
        if (persona != null) {
            estacionamiento.registrarSalida(persona);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void mostrarRegistros() {
        estacionamiento.mostrarRegistros();
    }

    private static Persona buscarPersonaPorIdentificacion(String identificacion) {
        for (Persona persona : estacionamiento.getListaPersonasAutorizadas()) {
            if (persona.getIdentificacion().equals(identificacion)) {
                return persona;
            }
        }
        return null;
    }

    private static Vehiculo buscarVehiculoPorMatricula(String matricula) {
 
        return null; 
    }
}

