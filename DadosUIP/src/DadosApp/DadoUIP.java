package DadosApp;

public class DadoUIP {

    private Integer numeroalazar;


    public DadoUIP() {

        this.numeroalazar = 1 + (int)(Math.random() * ((6 - 1) + 1));
    }


    public Integer getAzar() {
        return numeroalazar;
    }


    public int lanzamiento() {
        System.out.println("\nResultado de dados al azar UIP");
        double probabilidad_Azar = Math.random();
        System.out.println("El numero del dado es: " +numeroalazar);
        System.out.println("\nFue incluido en los resultados de lanzamiento ");

        return 0;
    }
}
