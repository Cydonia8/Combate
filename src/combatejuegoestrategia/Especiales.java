
package combatejuegoestrategia;

import java.util.HashMap;


public class Especiales {
    public static String avatar_moradores(){
        final String cyan="\033[36m";
        final String avatar_moradores = " " 
                + cyan+"      Una FUERZA dijo\n" +cyan+
"                             a un hombre al que\n" +cyan+
"                                 en muerte se encon-\n" +cyan+
"                                    tró: «Juntos ire-\n" +cyan+
"                                     mos ante SATURNO:\n" +cyan+
"                                     ¡Yo ayudaré! ¡Tú\n" +cyan+
"                                    te defenderás!\n" +cyan+
"                                   ¡Vamos! ¡No\n" +cyan+
"                                 aceptaré más\n" +cyan+
"                                dilación! ¡Un\n" +cyan+
"                              proceso hemos\n" +cyan+
"                            de tener, pues,\n" +cyan+
"                             en verdad, no\n" +cyan+
"                              existe otra\n" +cyan+
"                                manera de sortear\n" +cyan+
"                                     este mundo mezquino\n" +cyan+
"                                          y roto!» Dijo\n" +cyan+
"                                          el poderoso al\n" +cyan+
"                                           ser moribundo.\n" +cyan+
"                                          «Tal camino,\n" +cyan+
"                                        respetable\n" +cyan+
"                                    poder, sin\n" +cyan+
"                                  guía y sin\n" +cyan+
"                                marcas, no\n" +cyan+
"                               serviría\n" +cyan+
"                              más que\n" +cyan+
"                             para des-\n" +cyan+
"                              gañitarnos\n" +cyan+
"                                inútil-\n" +cyan+
"                                   mente.»\n" +cyan+
"                                    «Yo se-\n" +cyan+
"                                      ré el\n" +cyan+
"                                       guía, y\n" +cyan+
"                                        vos caminan\n" +cyan+
"                                         -te», re-\n" +cyan+
"                                        plicó,\n" +cyan+
"                                       taima-\n" +cyan+
"                                      da, la\n" +cyan+
"                                    vieja\n" +cyan+
"                                  fuerza.\n" +cyan+
"                                  «¡Se-\n" +cyan+
"                                  ré yo\n" +cyan+
"                                   quien\n" +cyan+
"                                    diga\n" +cyan+
"                                     todo\n" +cyan+
"                                     cuan-\n" +cyan+
"                                      to di-\n" +cyan+
"                                        ga y\n" +cyan+
"                                          YO\n" +cyan+
"                                         qui-\n" +cyan+
"                                       en a\n" +cyan+
"                                    paso len-\n" +cyan+
"                                   to ande \n" +cyan+
"                                 este\n" +cyan+
"                                cami-\n" +cyan+
"                              no.» "+cyan;
        return avatar_moradores;
        
    }
    
    public static String avatar_puros(){
        final String avatar_puros = "                                       @@@ .  . .. .  . .. .  . .. .  . .. .  . \n"+
".. .  . .. .  . .. .  . .. .  . .. .  @@@@@.  . .. .  . .. .  . .. .  . .. .  . \n" +
".. .  . .. .  . .. .  . .. .  . .. . @@@@@@@  . .. .  . .. .  . .. .  . .. .  . \n" +
".. .  . .. .  . .. .  . .. .  . .. .@@@@@@@@@ . .. .  . .. .  . .. .  . .. .  . \n" +
".. .  . .. .  . .. .  . .. .  . ..@@@@@@@@@@@@@ .. .  . .. .  . .. .  . .. .  . \n" +
".. .  . .. .  . .. .  . .. .  . .@@@@@@@@@@@@@@@.. .  . .. .  . .. .  . .. .  . \n" +
".. .  . .. .  . .. .  . .. .  . @@@@@@@@@@@@@@@@@. .  . .. .  . .. .  . .. .  . \n" +
"  . .. .  . .. .  . .. .  . .. @@@@@@@@@@@@@@@@@@@* .. .  . .. .  . .. .  . .. .\n" +
"  . .. .  . .. .  . .. .  . .,@@@@@@@@@@@@@@@@@@@@@%.. .  . .. .  . .. .  . .. .\n" +
"  . .. .  . .. .  . .. .  . .@@@@@@@@@@@@@@@@@@@@@@@.. .  . .. .  . .. .  . .. .\n" +
"  . .. .  . .. .  . .. .  . @@@@@@@@@@@@@@@@@@@@@@@@@. .  . .. .  . .. .  . .. .\n" +
"  . .. .  . .. .  . .. .  . @@@@@@@@@@@@@@@@@@@@@@@@@. .  . .. .  . .. .  . .. .\n" +
"  . .. .  . .. .  . .. .  . .@@@@@@@@@@@@@@@@@@@@@@@.. .  . .. .  . .. .  . .. .\n" +
"  . .. . @@@@@@@@@@@@* .  . ..@@@@@@@@@@@@@@@@@@@@@ .. .  ..@@@@@@@@@@@@  . .. .\n" +
"     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@    \n" +
".. @@@@@@@@@@@@@@@@@@@@@@@@@@..  @@@@@@@@@@@@@@@..  @@@@@@@@@@@@@@@@@@@@@@@@@@. \n" +
"..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..@@@@@@@@@@@@@ .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,\n" +
".@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@. @@@@@@@@@@@. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
".@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@%.@@@@@@@@@ #@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@\n" +
".@@@@@@@@@@@@&. .. .  . ..&@@@@@@@@#@@@@@@@@@*@@@@@@@@@ .. .  . .. %@@@@@@@@@@@@\n" +
"..@@@@@@@@@@  . .. .  . .. . @@@@@@@ @@@@@@@ @@@@@@@  . .. .  . .. . @@@@@@@@@@ \n" +
".. .@@@@@@@@  . .. .  . .. .  .@@@@@@(@@@@@@@@@@@@ .  . .. .  . .. . %@@@@@@@ . \n" +
"  . .. @@@@@.. .  . .. .  . .@@@@@@@@@@@@@@@@@@@@@@@ . .  . .. .  . .@@@@@. .. .\n" +
"  . .. .  . .. .  @@@@@@  .@@@@@@@@@@@@@@@@@@@@@@@@@@@ . @@@@@@.  . .. .  . .. .\n" +
"  . .. .  . .. . @@@@@@@  . .. ..@@@@.@@@@@ @@@@% . .. . &@@@@@@  . .. .  . .. .\n" +
"  . .. .  . .. .@@@@@@@@  . .. @@@@@@.@@@@@ @@@@@@. .. . @@@@@@@@ . .. .  . .. .\n" +
"  . .. .  . .. .@@@@@@@@@@@@@@@@@@@@. @@@@@@.@@@@@@@@@@@@@@@@@@@@ . .. .  . .. .\n" +
"  . .. .  . .. . ,@@@@@@@@@@@@@@@@  @@@@@@@@@# @@@@@@@@@@@@@@@@#  . .. .  . .. .\n" +
"  . .. .  . .. .  .  @@@@@@@@@@.  .@@@@@@@@@@@ .  @@@@@@@@@@,. .  . .. .  . .. .\n" +
"                                 @@@@@@@@@@@@@@@                                \n" +
".. .  . .. .  . .. .  . .. .  . .. .  @@@@@.  . .. .  . .. .  . .. .  . .. .  . \n" +
".. .  . .. .  . .. .  . .. .  . .. .  .@@@ .  . .. .  . .. .  . .. .  . .. .  . ";
        return avatar_puros;
    }
    
    public static String avatar_protectores(){
        final String yellow="\033[33m";
        final String avatar_protectores = "  "+yellow
                + "                              ¶¶¶¶¶¶¶¶¶¶¶ \n" +yellow+
"                                                   ¶¶¶ ¶¶¶¶¶¶¶¶¶ \n" +yellow+
"                                                  ¶¶¶        ¶¶¶¶ \n" +yellow+
"     ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶                    ¶¶¶¶ \n" +yellow+
"    ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶                     ¶¶¶¶¶ \n" +yellow+
"   ¶¶                  ¶¶¶¶      ¶¶¶¶¶¶¶¶¶¶      ¶¶¶¶¶¶¶                 ¶¶¶¶¶¶¶¶¶ \n" +yellow+
"                     ¶¶¶¶      ¶¶¶   ¶¶¶¶¶¶¶¶¶    ¶¶¶¶¶¶¶¶             ¶¶¶¶  ¶¶¶¶¶¶¶¶¶ \n" +yellow+
"                   ¶¶¶        ¶¶¶        ¶¶¶¶¶¶¶   ¶¶¶¶¶¶¶¶          ¶¶         ¶¶¶¶¶¶¶¶ \n" +yellow+
"                 ¶¶¶         ¶¶¶           ¶¶¶¶¶¶    ¶¶¶¶¶¶¶¶       ¶¶¶            ¶¶¶¶¶¶ \n" +yellow+
"               ¶¶¶          ¶¶¶     ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶    ¶¶¶¶¶ \n" +yellow+
"             ¶¶¶            ¶¶¶¶    ¶¶¶¶     ¶¶¶¶        ¶¶¶¶¶¶¶   ¶¶¶¶¶    ¶¶¶¶     ¶¶¶¶\n" +yellow+
"           ¶¶¶              ¶¶¶¶¶¶           ¶¶¶          ¶¶¶¶¶¶¶   ¶¶¶¶¶            ¶¶¶ \n" +yellow+
"         ¶¶¶                 ¶¶¶¶¶¶¶¶       ¶¶¶            ¶¶¶¶¶¶    ¶¶¶¶¶¶¶        ¶¶¶ \n" +yellow+
"      ¶¶¶¶                      ¶¶¶¶¶¶¶¶¶¶¶¶       ¶¶        ¶¶¶¶      ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +yellow+
"    ¶¶¶¶¶                                        ¶¶¶¶¶       ¶¶¶¶ \n" +yellow+
"   ¶¶¶¶¶¶¶                                      ¶¶¶¶¶¶¶     ¶¶¶¶ \n" +yellow+
"  ¶¶¶¶¶¶¶¶¶¶                                      ¶¶¶¶¶¶¶¶¶¶¶¶ \n" +yellow+
"      ¶¶¶¶¶¶¶¶¶ \n" +yellow+
"       ¶¶¶¶¶¶¶¶¶                                           ¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +yellow+
"          ¶¶¶¶¶¶¶¶¶                                         ¶¶¶¶¶¶¶¶¶                               ¶¶\n" +yellow+
"            ¶¶¶¶¶¶¶¶¶               ¶¶¶¶¶¶¶¶¶¶¶¶              ¶¶¶¶¶                             ¶¶¶¶ \n" +yellow+
"              ¶¶¶¶¶¶¶¶¶¶           ¶¶¶¶    ¶¶¶¶¶¶¶             ¶¶¶¶                       ¶¶¶¶¶¶ \n" +yellow+
"                 ¶¶¶¶¶¶¶¶¶¶       ¶¶¶¶¶¶     ¶¶¶¶¶             ¶¶¶¶                   ¶¶¶¶¶¶ \n" +yellow+
"                   ¶¶¶¶¶¶¶¶¶¶¶    ¶¶¶¶¶¶      ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +yellow+
"                      ¶¶¶¶¶¶¶¶¶¶¶             ¶¶¶ \n" +yellow+
"                         ¶¶¶¶¶¶¶¶¶¶¶         ¶¶¶ \n" +yellow+
"                            ¶¶¶¶¶¶¶¶¶¶¶¶    ¶¶¶ \n" +yellow+
"                                ¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +yellow+
"                                  ¶¶¶¶¶¶¶¶¶ ";
        
        return avatar_protectores;
    }
    
    public static String mensajeRepartoPuntos(int puntos_totales, String[] clases){
        String mensaje = "Ahora es el turno de potenciar tus habilidades. Ten en cuenta"
                    + " que los " + clases[1] + " son más fuertes, pero apenas tienen maná, los \n"
                    + clases[0] + " tienen buena defensa gracias a la protección de Saturno, y los " + clases[2]
                    + " tienen una alta cantidad de maná. Tienes\nen total " + puntos_totales + " puntos. Ninguna habilidad "
                    + "puede tener más de 100 puntos. \nSi esto ocurriese, o si intentas dar más puntos "
                    + " de los que tengas disponibles, se te volverá a pedir un valor.";
        
        return mensaje;
    }
    
    public static String muestraAtributos(String[]atributos, int[][]jugador){
        String resultado = "";
        for (int i = 0; i < jugador.length; i++) {
            resultado+="Jugador "+(i+1)+"\n";
            for (int j = 0; j < jugador[i].length; j++) {
                resultado+=atributos[j]+": "+jugador[i][j]+" ";
            }
            resultado+="\n";
            
        }
        return resultado;
    }
}
