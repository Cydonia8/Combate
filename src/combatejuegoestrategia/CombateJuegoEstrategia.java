
package combatejuegoestrategia;

import java.util.Scanner;
import combatejuegoestrategia.Especiales;
import java.util.HashMap;
import java.util.Random;


public class CombateJuegoEstrategia {

    
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int n_jugadores = 2;
        
        String[]puntos_nombres = {"Fuerza","Fe","Determinación","Influjo","Astucia"};
        String[]atributos = {"Ataque","Vida","Defensa","Mana"};
        final String[] clases ={"Moradores del Sendero", "Puros de Cuerpo y Alma", "Guardianes de Saturno"};
        
        int[]puntos_j1 = {10,10,10,10,10};
        int[]puntos_j2 = {10,10,10,10,10};
        int[][] tabla_atributos = new int[n_jugadores][atributos.length];
        int[][] tabla_puntos_asignados = new int[n_jugadores][puntos_nombres.length];
        String[]nombres_jugadores = new String[n_jugadores];
        
        int[]jugador1 = {0,0,0,0};
        int[]jugador2 = {0,0,0,0};
        String nombre_p1, nombre_p2;
        String nombre;
        HashMap<String,String> clases_jugadores = new HashMap<>();
        
        int[]ponderaciones_moradores={10,9,8,30,29,28,10,9,8,10,9,8,16,15,15};
        int[]ponderaciones_puros={10,9,8,10,9,8,30,29,28,40,39,38,16,15,15};
        int[]ponderaciones_guardianes={10,9,8,25,24,23,15,14,13,10,9,8,13,12,11};
        
        //Introducción de datos de los personajes
        for (int i = 0; i < n_jugadores; i++) {
                    
            do{
                System.out.println("¿Qué nombre quieres para tu personaje? ");
                nombre = teclado.next();
            }while(nombre.equals(""));
            nombres_jugadores[i] = nombre;
          
            int opcion;

            do{
                System.out.println("\nEscoge, sabiamente, una de las siguientes clases.");
                System.out.println("1. " + clases[0]);
                System.out.println("2. " + clases[1]);
                System.out.println("3. " + clases[2]);
                System.out.print("Clase: ");
                opcion = teclado.nextInt();
            }while(opcion != 1 && opcion != 2 && opcion != 3);
            String avatar = "";

            switch(opcion){
                case 1:
                    avatar = Especiales.avatar_moradores();
                    break;
                case 2:
                    avatar = Especiales.avatar_puros();
                    break;
                case 3:
                    avatar = Especiales.avatar_protectores();
                    break;
            }
            clases_jugadores.put(nombres_jugadores[i], avatar);

            int puntos_totales = 200;
            int puntos_restantes = 200;
            int puntos_asignados;

            System.out.println(Especiales.mensajeRepartoPuntos(puntos_totales, clases));

            for (int j = 0; j < puntos_nombres.length; j++) {
                System.out.println("Te quedan "+puntos_restantes+" por asignar.");
                do{
                    System.out.println("Puntos que asignarás a "+puntos_nombres[j]);
                    puntos_asignados = teclado.nextInt();
                }while(puntos_asignados < 0 || puntos_asignados > puntos_restantes || puntos_asignados + tabla_puntos_asignados[i][j] > 100);
                tabla_puntos_asignados[i][j]+= puntos_asignados;
                puntos_restantes -= puntos_asignados;
            }

        }
        
        
        //Configuración de los atributos para el primer personaje INCLUIR UN ARRAY CON LOS LÍMITES PARA CADA PARÁMETRO
        //Estas variables controlan los índices de los arrays de ponderaciones de cada clase
       
        
//        for (int i = 0; i < n_jugadores; i++) {
//            for (int j = 0; j < atributos.length; j++) {
//                
//            }
//            
//        }
        
//        for (int i = 0; i < atributos.length; i++) {
//            switch(clase_p1){
//                case "Moradores del Sendero":
//                    if(puntos_j1[i] >= 10 && puntos_j1[i] <= 44){
//                        jugador1[0] += puntos_j1[i]/10;
//                        jugador1[1] += puntos_j1[i]/9;
//                        jugador1[2] += puntos_j1[i]/9;
//                        jugador1[3] += puntos_j1[i]/10;
//                        System.out.println(jugador1[0]);
//                    }else if(puntos_j1[i] >= 45 && puntos_j1[i] <= 74){
//                        jugador1[0] += puntos_j1[i]/10;
//                        jugador1[1] += puntos_j1[i] /10;
//                        jugador1[2] += puntos_j1[i]/9;
//                        jugador1[3] += puntos_j1[i]/9;
//                    }else{
//                        jugador1[0] += puntos_j1[i]/10;
//                        jugador1[1] += puntos_j1[i]/10;
//                        jugador1[2] += puntos_j1[i]/9;
//                        jugador1[3] += puntos_j1[i]/11;
//                    }
//                    break;
//                case "Puros de Cuerpo y Alma":
//                    if(puntos_j1[i] >= 10 && puntos_j1[i] <= 44){
//                        jugador1[0] += puntos_j1[i]/ponderaciones_puros[j];
//                        jugador1[1] += puntos_j1[i]/ponderaciones_puros[j];
//                        jugador1[2] += puntos_j1[i] /ponderaciones_puros[j];
//                        jugador1[3] += puntos_j1[i] /ponderaciones_puros[j];
//                    }else if(puntos_j1[i] >= 45 && puntos_j1[i] <= 74){
//                        jugador1[0] += puntos_j1[i]/ponderaciones_puros[k];
//                        jugador1[1] += puntos_j1[i] /ponderaciones_puros[k];
//                        jugador1[2] += puntos_j1[i]/ponderaciones_puros[k];
//                        jugador1[3] += puntos_j1[i]/ponderaciones_puros[k];
//                    }else{
//                        jugador1[0] += puntos_j1[i]/ponderaciones_puros[z];
//                        jugador1[1] += puntos_j1[i]/ponderaciones_puros[z];
//                        jugador1[2] += puntos_j1[i]/ponderaciones_puros[z];
//                        jugador1[3] += puntos_j1[i]/ponderaciones_puros[z];
//                    }
//                    break;
//                case "Guardianes de Saturno":
//                    if(puntos_j1[i] >= 10 && puntos_j1[i] <= 44){
//                        jugador1[0] += puntos_j1[i]/ponderaciones_guardianes[j];
//                        jugador1[1] += puntos_j1[i]/ponderaciones_guardianes[j];
//                        jugador1[2] += puntos_j1[i] /ponderaciones_guardianes[j];
//                        jugador1[3] += puntos_j1[i] /ponderaciones_guardianes[j];
//                    }else if(puntos_j1[i] >= 45 && puntos_j1[i] <= 74){
//                        jugador1[0] += puntos_j1[i]/ponderaciones_guardianes[k];
//                        jugador1[1] += puntos_j1[i] /ponderaciones_guardianes[k];
//                        jugador1[2] += puntos_j1[i]/ponderaciones_guardianes[k];
//                        jugador1[3] += puntos_j1[i]/ponderaciones_guardianes[k];
//                    }else{
//                        jugador1[0] += puntos_j1[i]/ponderaciones_guardianes[z];
//                        jugador1[1] += puntos_j1[i]/ponderaciones_guardianes[z];
//                        jugador1[2] += puntos_j1[i]/ponderaciones_guardianes[z];
//                        jugador1[3] += puntos_j1[i]/ponderaciones_guardianes[z];
//                    }
//                    break;
//            }
//            j++;
//            k++;
//            z++;
//            
//        }
//        
//        //Configuración de los atributos para el segundo personaje
//        j= 0;
//        k = 1;
//        z = 2;
//        for (int i = 0; i < atributos.length; i++) {
//            switch(clase_p2){
//                case "Moradores del Sendero":
//                    if(puntos_j2[i] >= 10 && puntos_j2[i] <= 44){
//                        jugador2[0] += puntos_j2[i]/ponderaciones_moradores[j];
//                        jugador2[1] += puntos_j2[i]/ponderaciones_moradores[j];
//                        jugador2[2] += puntos_j2[i] /ponderaciones_moradores[j];
//                        jugador2[3] += puntos_j2[i] /ponderaciones_moradores[j];
//                    }else if(puntos_j2[i] >= 45 && puntos_j2[i] <= 74){
//                        jugador2[0] += puntos_j2[i]/ponderaciones_moradores[k];
//                        jugador2[1] += puntos_j2[i] /ponderaciones_moradores[k];
//                        jugador2[2] += puntos_j2[i]/ponderaciones_moradores[k];
//                        jugador2[3] += puntos_j2[i]/ponderaciones_moradores[k];
//                    }else{
//                        jugador2[0] += puntos_j2[i]/ponderaciones_moradores[z];
//                        jugador2[1] += puntos_j2[i]/ponderaciones_moradores[z];
//                        jugador2[2] += puntos_j2[i]/ponderaciones_moradores[z];
//                        jugador2[3] += puntos_j2[i]/ponderaciones_moradores[z];
//                    }
//                    break;
//                case "Puros de Cuerpo y Alma":
//                    if(puntos_j2[i] >= 10 && puntos_j2[i] <= 44){
//                        jugador2[0] += puntos_j2[i]/ponderaciones_puros[j];
//                        jugador2[1] += puntos_j2[i]/ponderaciones_puros[j];
//                        jugador2[2] += puntos_j2[i] /ponderaciones_puros[j];
//                        jugador2[3] += puntos_j2[i] /ponderaciones_puros[j];
//                    }else if(puntos_j2[i] >= 45 && puntos_j2[i] <= 74){
//                        jugador2[0] += puntos_j2[i]/ponderaciones_puros[k];
//                        jugador2[1] += puntos_j2[i] /ponderaciones_puros[k];
//                        jugador2[2] += puntos_j2[i]/ponderaciones_puros[k];
//                        jugador2[3] += puntos_j2[i]/ponderaciones_puros[k];
//                    }else{
//                        jugador2[0] += puntos_j2[i]/ponderaciones_puros[z];
//                        jugador2[1] += puntos_j2[i]/ponderaciones_puros[z];
//                        jugador2[2] += puntos_j2[i]/ponderaciones_puros[z];
//                        jugador2[3] += puntos_j2[i]/ponderaciones_puros[z];
//                    }
//                    break;
//                case "Guardianes de Saturno":
//                    if(puntos_j2[i] >= 10 && puntos_j2[i] <= 44){
//                        jugador2[0] += puntos_j2[i]/ponderaciones_guardianes[j];
//                        jugador2[1] += puntos_j2[i]/ponderaciones_guardianes[j];
//                        jugador2[2] += puntos_j2[i] /ponderaciones_guardianes[j];
//                        jugador2[3] += puntos_j2[i] /ponderaciones_guardianes[j];
//                    }else if(puntos_j2[i] >= 45 && puntos_j2[i] <= 74){
//                        jugador2[0] += puntos_j2[i]/ponderaciones_guardianes[k];
//                        jugador2[1] += puntos_j2[i] /ponderaciones_guardianes[k];
//                        jugador2[2] += puntos_j2[i]/ponderaciones_guardianes[k];
//                        jugador2[3] += puntos_j2[i]/ponderaciones_guardianes[k];
//                    }else{
//                        jugador2[0] += puntos_j2[i]/ponderaciones_guardianes[z];
//                        jugador2[1] += puntos_j2[i]/ponderaciones_guardianes[z];
//                        jugador2[2] += puntos_j2[i]/ponderaciones_guardianes[z];
//                        jugador2[3] += puntos_j2[i]/ponderaciones_guardianes[z];
//                    }
//            }
//            j++;
//            k++;
//            z++;
//            
//        }
//        System.out.println(Especiales.muestraAtributos(atributos, jugador1));
        
        int turno = 0;
        int puntos_vitalidad_p1, puntos_vitalidad_p2;
        int ataque, defensa;
//        do{
//            turno++;
//            System.out.println("¡Turno del jugador "+turno+"!");
//            
//            if(turno == 2){
//                turno = 0;
//            }
//            puntos_vitalidad_p1 = jugador1[1];
//            puntos_vitalidad_p2 = jugador2[1];
//        }while(puntos_vitalidad_p1 > 0 && puntos_vitalidad_p2 > 0);
        
        
        
        
        
    }
    
}
