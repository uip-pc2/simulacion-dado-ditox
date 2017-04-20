package DadosApp;

import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DadoUIP> listado = new ArrayList<>();


        while(true) {
            int accion = 0;

            System.out.println("\nUSTED A INGRESADO AL SISTEMA DE DADOS AL AZAR UIP:");
            System.out.println("\nSeleccione una accion a ejecutar:");
            System.out.println("Utilice el numero 1 para: Lanzar un dado");
            System.out.println(" ");
            System.out.println("Utilice el numero 2 para: Mostrar todos los resultados de lanzamiento");
            System.out.println(" ");
            System.out.println("Utilice el numero 3 para: Salir del sistema de dados UIP");
            System.out.println(" ");

            try {
                System.out.print("ACCION A EJECUTAR: ");
                accion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("Error: Esta accion no existe.");
            }


            switch (accion) {
                case 1:
                    DadoUIP d = new DadoUIP();
                    int estado = d.lanzamiento();

                    if (estado == 0)
                        listado.add(d);
                    break;


                case 2:
                    if (listado.size() == 0)
                        System.out.println("Usted no realizo ningun lanzamiento ");
                    else System.out.println("\nLos resultados de lanzamiento son: "); {for (DadoUIP dd : listado) {

                    System.out.println(Math.round(dd.getAzar()));
                }
                }
                break;


                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Esta accion no existe");
            }
        }
    }
}
