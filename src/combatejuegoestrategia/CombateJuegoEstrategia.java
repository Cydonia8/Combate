
package combatejuegoestrategia;

import java.util.Scanner;
import combatejuegoestrategia.Especiales;


public class CombateJuegoEstrategia {

    
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
        int n_jugadores = 2;
        
        String[]puntos_nombres = {"fuerza","fe","determinación","influjo","astucia"};
        String[]atributos = {"ataque","vida","defensa","mana"};
        
        int[]puntos_j1 = {10,10,10,10,10};
        int[]puntos_j2 = {10,10,10,10,10};
        int[][] tabla_puntuacion = new int[n_jugadores][atributos.length];
        
        int[]jugador1 = new int[atributos.length];
        int[]jugador2 = new int[atributos.length];
        String nombre_p1, nombre_p2;
        
        //Introducción de datos del primer personaje
        do{
            System.out.println("¿Qué nombre quieres para tu personaje? ");
            nombre_p1 = teclado.next();
        }while(nombre_p1.equals(""));
        
        final String[] clases ={"Moradores del Sendero", "Puros de Cuerpo y Alma", "Guardianes de Saturno"};
        String clase_p1;
        int opcion;
        
        do{
            System.out.println("\nEscoge, sabiamente, una de las siguientes clases.");
            System.out.println("1. " + clases[0]);
            System.out.println("2. " + clases[1]);
            System.out.println("3. " + clases[2]);
            System.out.print("Clase: ");
            opcion = teclado.nextInt();
        }while(opcion != 1 && opcion != 2 && opcion != 3);
        clase_p1 = clases[opcion-1];
        String avatar_p1;
        
        switch(opcion){
            case 1:
                avatar_p1 = Especiales.avatar_moradores();
                break;
            case 2:
                avatar_p1 = Especiales.avatar_puros();
                break;
            case 3:
                avatar_p1 = Especiales.avatar_protectores();
                break;
        }
        
        int puntos_totales = 200;
        int puntos_restantes = 200;
        int puntos_asignados;
        
        System.out.println(Especiales.mensajeRepartoPuntos(nombre_p1, puntos_totales, clases));
        
        for (int i = 0; i < puntos_nombres.length; i++) {
            System.out.println("Te quedan "+puntos_restantes+" por asignar.");
            do{
                System.out.println("Puntos que asignarás a "+puntos_nombres[i]);
                puntos_asignados = teclado.nextInt();
            }while(puntos_asignados < 0 || puntos_asignados > puntos_restantes || puntos_asignados + puntos_j1[i] > 100);
            puntos_j1[i]+= puntos_asignados;
            puntos_restantes -= puntos_asignados;
        }
        
        //Introducción de datos del segundo personaje
        do{
            System.out.println("¿Qué nombre quieres para tu personaje? ");
            nombre_p2 = teclado.next();
        }while(nombre_p2.equals(""));
        String clase_p2;
        do{
            System.out.println("\nEscoge, sabiamente, una de las siguientes clases.");
            System.out.println("1. " + clases[0]);
            System.out.println("2. " + clases[1]);
            System.out.println("3. " + clases[2]);
            System.out.print("Clase: ");
            opcion = teclado.nextInt();
        }while(opcion != 1 && opcion != 2 && opcion != 3);
        clase_p2 = clases[opcion-1];
        String avatar_p2;
        
        switch(opcion){
            case 1:
                avatar_p2 = Especiales.avatar_moradores();
                break;
            case 2:
                avatar_p2 = Especiales.avatar_puros();
                break;
            case 3:
                avatar_p2 = Especiales.avatar_protectores();
                break;
        }
        
        puntos_totales = 200;
        puntos_restantes = 200;
        puntos_asignados = 0;
        
        System.out.println(Especiales.mensajeRepartoPuntos(nombre_p2, puntos_totales, clases));
        
        for (int i = 0; i < puntos_nombres.length; i++) {
            System.out.println("Te quedan "+puntos_restantes+" por asignar.");
            do{
                System.out.println("Puntos que asignarás a "+puntos_nombres[i]);
                puntos_asignados = teclado.nextInt();
            }while(puntos_asignados < 0 || puntos_asignados > puntos_restantes || puntos_asignados + puntos_j2[i] > 100);
            puntos_j2[i]+= puntos_asignados;
            puntos_restantes -= puntos_asignados;
        }
        
        //Configuración de los atributos para el primer personaje INCLUIR UN ARRAY CON LOS LÍMITES PARA CADA PARÁMETRO
        
        for (int i = 0; i < atributos.length; i++) {
            switch(clase_p1){
                case "Moradores del Sendero":
                    if(puntos_j1[i] >= 10 && puntos_j1[i] <= 44){
                        jugador1[0] += puntos_j1[i]/12;
                        jugador1[1] += puntos_j1[i]/12;
                        jugador1[2] += puntos_j1[i] /11;
                        jugador1[3] += 0;
                    }else if(puntos_j1[i] >= 45 && puntos_j1[i] <= 74){
                        jugador1[0] += puntos_j1[i]/10;
                        jugador1[1] += puntos_j1[i] /10;
                        jugador1[2] += puntos_j1[i]/9;
                        jugador1[3] += 0;
                    }else{
                        jugador1[0] += puntos_j1[i]/8;
                        jugador1[1] += puntos_j1[i]/8;
                        jugador1[2] += puntos_j1[i]/8;
                        jugador1[3] += 0;
                    }
                    break;
                case "Puros de Cuerpo y Alma":
                    if(puntos_j1[i] >= 10 && puntos_j1[i] <= 44){
                        jugador1[0] += puntos_j1[i]/10;
                        jugador1[1] += puntos_j1[i]/10;
                        jugador1[2] += puntos_j1[i] /9;
                        jugador1[3] += 0;
                    }else if(puntos_j1[i] >= 45 && puntos_j1[i] <= 74){
                        jugador1[0] += puntos_j1[i]/9;
                        jugador1[1] += puntos_j1[i] /9;
                        jugador1[2] += puntos_j1[i]/8;
                        jugador1[3] += 0;
                    }else{
                        jugador1[0] += puntos_j1[i]/7;
                        jugador1[1] += puntos_j1[i]/7;
                        jugador1[2] += puntos_j1[i]/7;
                        jugador1[3] += 0;
                    }
                    break;
                case "Guardianes de Saturno":
                    if(puntos_j1[i] >= 10 && puntos_j1[i] <= 44){
                        jugador1[0] += puntos_j1[i]/12;
                        jugador1[1] += puntos_j1[i]/12;
                        jugador1[2] += puntos_j1[i] /11;
                        jugador1[3] += 0;
                    }else if(puntos_j1[i] >= 45 && puntos_j1[i] <= 74){
                        jugador1[0] += puntos_j1[i]/10;
                        jugador1[1] += puntos_j1[i] /10;
                        jugador1[2] += puntos_j1[i]/9;
                        jugador1[3] += 0;
                    }else{
                        jugador1[0] += puntos_j1[i]/8;
                        jugador1[1] += puntos_j1[i]/8;
                        jugador1[2] += puntos_j1[i]/8;
                        jugador1[3] += 0;
                    }
            }
            
        }
        
        //Configuración de los atributos para el segundo personaje
        
        for (int i = 0; i < atributos.length; i++) {
            switch(clase_p2){
                case "Moradores del Sendero":
                    if(puntos_j2[i] >= 10 && puntos_j2[i] <= 44){
                        jugador2[0] += puntos_j2[i]/12;
                        jugador2[1] += puntos_j2[i]/12;
                        jugador2[2] += puntos_j2[i] /11;
                        jugador2[3] += 0;
                    }else if(puntos_j2[i] >= 45 && puntos_j2[i] <= 74){
                        jugador2[0] += puntos_j2[i]/10;
                        jugador2[1] += puntos_j2[i] /10;
                        jugador2[2] += puntos_j2[i]/9;
                        jugador2[3] += 0;
                    }else{
                        jugador2[0] += puntos_j2[i]/8;
                        jugador2[1] += puntos_j2[i]/8;
                        jugador2[2] += puntos_j2[i]/8;
                        jugador2[3] += 0;
                    }
                    break;
                case "Puros de Cuerpo y Alma":
                    if(puntos_j2[i] >= 10 && puntos_j2[i] <= 44){
                        jugador2[0] += puntos_j2[i]/10;
                        jugador2[1] += puntos_j2[i]/10;
                        jugador2[2] += puntos_j2[i] /9;
                        jugador2[3] += 0;
                    }else if(puntos_j2[i] >= 45 && puntos_j2[i] <= 74){
                        jugador2[0] += puntos_j2[i]/9;
                        jugador2[1] += puntos_j2[i] /9;
                        jugador2[2] += puntos_j2[i]/8;
                        jugador2[3] += 0;
                    }else{
                        jugador2[0] += puntos_j2[i]/7;
                        jugador2[1] += puntos_j2[i]/7;
                        jugador2[2] += puntos_j2[i]/7;
                        jugador2[3] += 0;
                    }
                    break;
                case "Guardianes de Saturno":
                    if(puntos_j2[i] >= 10 && puntos_j2[i] <= 44){
                        jugador2[0] += puntos_j2[i]/12;
                        jugador2[1] += puntos_j2[i]/12;
                        jugador2[2] += puntos_j2[i] /11;
                        jugador2[3] += 0;
                    }else if(puntos_j2[i] >= 45 && puntos_j2[i] <= 74){
                        jugador2[0] += puntos_j2[i]/10;
                        jugador2[1] += puntos_j2[i] /10;
                        jugador2[2] += puntos_j2[i]/9;
                        jugador2[3] += 0;
                    }else{
                        jugador2[0] += puntos_j2[i]/8;
                        jugador2[1] += puntos_j2[i]/8;
                        jugador2[2] += puntos_j2[i]/8;
                        jugador2[3] += 0;
                    }
            }
            
        }
        
        
        
        
        
    }
    
}
