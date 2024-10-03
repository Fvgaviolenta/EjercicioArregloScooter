package problemaarreglosscooter;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class ProblemaArreglosScooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puesto jefe = new Puesto("A01", "Jefe de piso");
        Puesto trabajador = new Puesto("B02", "Bodegero");
        
        Empleado emple1 = new Empleado("1-2", "Oscar Martinez", "M", 5, 37, jefe);
        Empleado emple2 = new Empleado("1-9", "Fernando Costa", "M", 2, 57, trabajador);
        Empleado emple3 = new Empleado("1-K", "Matias de Leon", "M", 6, 30, trabajador);
        Empleado emple4 = new Empleado("1-7", "Martin Peñaloza", "M", 1, 33, trabajador);
        Empleado emple5 = new Empleado("1-8", "Maria Gutierrez", "F", 4, 31, trabajador);
        Empleado[] empleadosDispo = {emple1,emple2,emple3,emple4,emple5};
        
        Empresa empresa = new Empresa();
        Scanner lectura = new Scanner(System.in);
        Scanner buscaRut = new Scanner(System.in);
        
        
        do {
            System.out.println("---MENU---");
            System.out.println("1. Sistema de gestion de empleados");
            System.out.println("2. Mostrar informacion de empleados");
            System.out.println("3. Buscar empleado listado");
            System.out.println("4. Eliminar empleado de la lista");
            System.out.println("5. Salir");
            
            System.out.println("Ingresar una opcion: ");
            switch(lectura.nextInt()){
                case 1 -> {
                    System.out.println("\n***SISTEMA DE GESTION DE EMPLEADOS DE EMPRESA***\n");
                    System.out.println("Ingrese RUT de trabajador que desea agregar: ");
                    String busca = buscaRut.next();

                    if (empresa.busacarEmpleado(busca)) {
                        System.out.println("El empleado con RUT " + busca + " si se encuentra registrado.");
                    } else {
                        System.out.println("Empleado con RUT " + busca + " no se encuentra registrado...");
                        System.out.println("Iniciado proceso de registro de empleado");

                        Empleado empleadoAgregar = null;
                        for (Empleado emple : empleadosDispo) {
                            if(emple.getRut().equals(busca)){
                                empleadoAgregar = emple;
                                break;
                            }
                        }

                        if(empleadoAgregar != null){
                            empresa.agregar(empleadoAgregar);
                            System.out.println("Empleado con RUT " + busca + " fue ingresado con exito\n");
                        } else {
                            System.out.println("No se encontro un empleado con el RUT ingresado\n");
                        }
                        
                    }
                }
                case 2 -> {
                    if (empresa.listaEmpleados.isEmpty()){
                        System.out.println("Lista de empleados vacia, intentelo mas tarde");
                    } else {
                        empresa.listarEmpleado();
                    }
                }
                case 3 -> {
                    if (empresa.listaEmpleados.isEmpty()){
                        System.out.println("Lista de empleados vacia, intentelo mas tarde\n");
                    } else {
                        System.out.println("Ingrese el rut que desea buscar: ");
                        String busca = buscaRut.next();
                        if(empresa.busacarEmpleado(busca)){
                            for (Empleado emple : empresa.listaEmpleados) {
                                if(emple.getRut().equals(busca)){
                                    System.out.println(emple.toString());
                                }
                            }
                        } else {
                            System.out.println("Rut no coincide\n");
                        }
                       
                    }
                
                }
                case 4 ->{
                    if(empresa.listaEmpleados.isEmpty()){
                        System.out.println("Lista vacia intentelo mas tarde\n");
                    } else {
                        System.out.println("Ingrese el RUT que desea eliminar de la lista: ");
                        String busca = buscaRut.next();
                        if (empresa.busacarEmpleado(busca)){
                            for (Empleado emple : empresa.listaEmpleados) {
                                if(emple.getRut().equals(busca)){
                                    empresa.listaEmpleados.remove(emple);
                                    System.out.println("Empleado removido con exito\n");
                                }
                            } 
                        } else {
                            System.out.println("Rut no coicide\n");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del sistema\n");
                    return;
                }
                default -> System.out.println("Opcion fuera de rango\n");
    }
    } while (true);
}}
