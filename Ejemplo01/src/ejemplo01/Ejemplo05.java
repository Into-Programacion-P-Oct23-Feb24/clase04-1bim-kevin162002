/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Kevin Cristopher";
        String apellidoEstudiante = "Vicente Abad";
        int nacimiento = 1983;
        
        /*System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento); */
        System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);
        /*
        /n sirve sirve para caracteres de una nueva linea y /t sirve como un tabulador
        
        
        */
    }
}
