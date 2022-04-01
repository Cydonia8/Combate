
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
        int[]puntos_vida = new int[n_jugadores];
        
        String[]puntos_nombres = {"Fuerza","Fe","Determinación","Influjo","Astucia"};
        String[]atributos = {"Ataque","Vida","Defensa","Mana"};
        final String[] clases ={"Moradores del Sendero", "Puros de Cuerpo y Alma", "Guardianes de Saturno"};
        
        int[][] tabla_atributos = new int[n_jugadores][atributos.length];
        int[][] tabla_puntos_asignados = new int[n_jugadores][puntos_nombres.length];
        String[]nombres_jugadores = new String[n_jugadores];
        
        String nombre;
        String[] clases_escogidas = new String[n_jugadores];
        HashMap<String,String> clases_jugadores = new HashMap<>();
        
        //Introducción de datos de los personajes
        for (int i = 0; i < n_jugadores; i++) {
                    
            do{
                System.out.print("¿Qué nombre quieres para tu personaje? ");
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
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/8;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/35;
                        }else if(tabla_puntos_asignados[i][j] >= 45 && tabla_puntos_asignados[i][j] <= 74){
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/7;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/6;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/6;
                            tabla_atributos[i][3] += tabla_puntos_asignados[i][j]/33;
                        }else{
                            tabla_atributos[i][0] += tabla_puntos_asignados[i][j]/5;
                            tabla_atributos[i][1] += tabla_puntos_asignados[i][j]/5;
                            tabla_atributos[i][2] += tabla_puntos_asignados[i][j]/5;
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
        
        //Usando el método muestraAtributos de la clase Especiales imprimimos los 
        //atributos de cada jugador
        System.out.println(Especiales.muestraAtributos(atributos, tabla_atributos));
        
        int turno_ataque,turno_defensa, rondas, jugador_con_turno;
        int puntos_vitalidad_p1 = 0, puntos_vitalidad_p2 = 0;
        int ataque, defensa, impacto;
        char eleccion;
        int pos_vida = 1;
        int pos_mana = 3;
        int pos_ataque = 0;
        int pos_defensa = 2;
        int contador;
        boolean perdedor_encontrado = false;
        
        turno_ataque = 0;
        turno_defensa = 1;
        rondas = 0;
        jugador_con_turno = 0;
        do{
            rondas++;
            System.out.println("¡Turno del jugador "+(turno_ataque+1)+"!");
            System.out.println("Menú de acciones");
            System.out.println("A. Realizar ataque melé");
            System.out.println("E. Recuperar vida según la mitad de tu maná");
            do{
                System.out.print("Movimiento: ");
                eleccion = teclado.next().charAt(0);
            }while(eleccion != 'A' && eleccion != 'E');
            System.out.println("");
            
            switch(eleccion){
                case 'A':
                    ataque = aleatorio.nextInt(tabla_atributos[turno_ataque][pos_ataque]);
                    defensa = aleatorio.nextInt(tabla_atributos[turno_defensa][pos_defensa]);
                    System.out.println("El ataque genera "+ataque+", mientras que la defensa genera "+defensa);

                    if(ataque > defensa){
                        System.out.println("¡Gana el atacante!\n");
                        impacto = ataque - defensa;
                        tabla_atributos[turno_defensa][1]-=impacto;
                    }else{
                        System.out.println("¡Gana el defensor!\n");
                    }
                    puntos_vida[0] = tabla_atributos[0][pos_vida];
                    puntos_vida[1] = tabla_atributos[1][pos_vida];
//                    puntos_vitalidad_p1 = tabla_atributos[0][pos_vida];
//                    puntos_vitalidad_p2 = tabla_atributos[1][pos_vida];
                    
                    break;
                case 'E':
                    int mana_restado, mana_resultante;

                    mana_restado = tabla_atributos[jugador_con_turno][pos_mana] / 2;
                    mana_resultante = tabla_atributos[jugador_con_turno][pos_mana] - mana_restado;
                    
                    System.out.println("Tienes "+tabla_atributos[jugador_con_turno][pos_mana]+" puntos de "+atributos[pos_mana]);
                    System.out.println("Vas a perder la mitad de maná, por lo que te quedarás con "+ mana_resultante+" puntos");
                    System.out.println("Tu vida aumentará en "+mana_restado +" puntos\n");
                    
                    tabla_atributos[jugador_con_turno][pos_vida] += mana_restado;
                    tabla_atributos[jugador_con_turno][pos_mana] = mana_resultante;
                    
                    if(mana_resultante == 1){
                        System.out.println("Te has quedado sin maná, por lo que no podrás volver a usar el especial.\n"
                                + "Si intentas hacerlo, perderás el turno.\n");
                    }
                    puntos_vida[jugador_con_turno] = tabla_atributos[jugador_con_turno][pos_vida];
//                    puntos_vitalidad_p1 = tabla_atributos[0][pos_vida];
//                    puntos_vitalidad_p2 = tabla_atributos[1][pos_vida];
                    break;
            }
             
            System.out.println("Puntos de vida del jugador 1: "+puntos_vida[0]);
            System.out.println("Puntos de vida del jugador 2: "+puntos_vida[1]+"\n");
            
            turno_ataque++;
            turno_defensa--;
            jugador_con_turno++;
            if(rondas == 2){
                turno_ataque = 0;
                turno_defensa = 1;
                rondas = 0;
            }
            if(jugador_con_turno == n_jugadores){
                jugador_con_turno = 0;
            }
            
            contador = 0;
            while(!perdedor_encontrado && contador < jugador_con_turno){
                if(puntos_vida[contador] <= 0){
                    perdedor_encontrado = true;
                }
                contador++;
            }
            
        }while(!perdedor_encontrado);
        
        if(puntos_vitalidad_p1 > puntos_vitalidad_p2){
            System.out.println("Victoria del jugador 1: "+nombres_jugadores[0]);
            System.out.println(clases_jugadores.get(nombres_jugadores[0]));
        }else{
            System.out.println("Victoria del jugador 2: "+nombres_jugadores[1]);
            System.out.println(clases_jugadores.get(nombres_jugadores[1]));
        }
        
    }
    
}
