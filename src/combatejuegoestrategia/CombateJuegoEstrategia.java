
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
        String nombre;
        String[] clases_escogidas = new String[n_jugadores];
        HashMap<String,String> clases_jugadores = new HashMap<>();
        
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
            clases_escogidas[i] = clases[opcion-1];
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
                
        //Configuración de los atributos para los personajes
        //Estas variables controlan los índices de los arrays de ponderaciones de cada clase
       
        for (int i = 0; i < n_jugadores; i++) {
            for (int j = 0; j < atributos.length; j++) {
                switch(clases_escogidas[i]){
                    case "Moradores del Sendero":
                        if(tabla_puntos_asignados[i][j] >= 10 && tabla_puntos_asignados[i][j] <= 44){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/10;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/10;
                        }else if(tabla_puntos_asignados[i][j] >= 45 && tabla_puntos_asignados[i][j] <= 74){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/8;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/8;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/9;
                        }else{
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/8;
                        }
                        break;
                    case "Puros de Cuerpo y Alma":
                        if(tabla_puntos_asignados[i][j] >= 10 && tabla_puntos_asignados[i][j] <= 44){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/10;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/35;
                        }else if(tabla_puntos_asignados[i][j] >= 45 && tabla_puntos_asignados[i][j] <= 74){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/8;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/33;
                        }else{
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/8;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/32;
                        }
                        break;
                    case "Guardianes de Saturno":
                        if(tabla_puntos_asignados[i][j] >= 10 && tabla_puntos_asignados[i][j] <= 44){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/15;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/8;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/10;
                        }else if(tabla_puntos_asignados[i][j] >= 45 && tabla_puntos_asignados[i][j] <= 74){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/14;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/9;
                        }else{
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/13;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/5;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/9;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/8;
                        }
                        break;
                }
            }
        }
        
        
        System.out.println(Especiales.muestraAtributos(atributos, tabla_atributos));
        
        int turno_ataque,turno_defensa, rondas;
        int puntos_vitalidad_p1, puntos_vitalidad_p2;
        int ataque, defensa, impacto;
        
        turno_ataque = 0;
        turno_defensa = 1;
        rondas = 0;
        do{
            rondas++;
            System.out.println("¡Turno del jugador "+turno_ataque+"!");
            
            ataque = aleatorio.nextInt(tabla_atributos[turno_ataque][0]);
            defensa = aleatorio.nextInt(tabla_atributos[turno_defensa][2]);
            
            if(ataque > defensa){
                System.out.println("¡Gana el atacante!");
                impacto = ataque - defensa;
                tabla_atributos[turno_defensa][1]-=impacto;
            }else{
                System.out.println("¡Gana el defensor!");
            }             
            
            turno_ataque++;
            turno_defensa--;
            if(rondas % 2 == 0){
                turno_ataque = 0;
                turno_defensa = 1;
            }
            puntos_vitalidad_p1 = tabla_atributos[0][1];
            puntos_vitalidad_p2 = tabla_atributos[1][1];
        }while(puntos_vitalidad_p1 > 0 && puntos_vitalidad_p2 > 0);
        
        if(puntos_vitalidad_p1 > puntos_vitalidad_p2){
            System.out.println("Victoria del jugador 1");
        }else{
            System.out.println("Victoria del jugador 2");
        }
        System.out.println(puntos_vitalidad_p1);
        System.out.println(puntos_vitalidad_p2);
        
    }
    
}
