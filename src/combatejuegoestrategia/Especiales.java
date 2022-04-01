
package combatejuegoestrategia;

import java.util.HashMap;


public class Especiales {
    
    public static String mensajeMundo(){
        String mensaje = " ---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        mensaje+=" En Ravenskill reina el caos. Mientras que los Puros de Cuerpo y Alma rechazan cualquier tipo "
                + " de magia y apuestan por la pureza del alma, los Moradores del Sendero\n quedan en una especie de "
                + " limbo tras morir, teniendo que seguir un camino sólo visible para ellos que los llevará hasta Saturno, "
                + " el destino final de todos los que\n han sido bendecidos con su gracia. Por otra parte, los Guardianes de Saturno "
                + " ayudan a los Moradores y protegen los obeliscos de Saturno de los ataques de los Puros.\n\n Sin embargo, con el"
                + " paso de los años, la tensión ha ido aumentando de forma paulatina. Los Moradores del Sendero, elegidos contra"
                + " su voluntad, empezaron a atacar a\n los Guardianes de Saturno, ya que se negaban a aceptar su destino. A su vez, los"
                + " Puros atacaban a los Moradores y a los Guardianes ya que consideraban todo ese asunto\n fruto de las artes oscuras"
                + " y de la herejía. Los Guardianes a su vez luchaban contra los Puros para defender a aquellos Moradores que desearan"
                + " completar El Camino. \n En este contexto...¿de qué lado estarás?\n "
                + "----------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        return mensaje;
    }
    
    public static String mensaje_escoger_clase(){
        String mensaje = "-----------------------------------------------------------------------------------------------------------------------\n"
                + "Llega el momento de escoger un bando. Ten en cuenta que los Puros de Cuerpo y Alma apenas tendrán maná, únicamente\n confían"
                + " en su gran fuerza y en su fe hacia aquello que antaño se veneraba como Dios. Por otro lado, tanto los Moradores\n del Sendero "
                + " como los Guardianes de Saturno tendrán un maná más elevado, lo que les permitirá regenerar su vida gracias\n al influjo de Saturno.\n"
                + "-----------------------------------------------------------------------------------------------------------------------\n\n";
        return mensaje;
    }
    public static String avatar_moradores(){
        final String avatar_moradores = " WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXK00OkxddoooddxkOKXWWWWWWWWWWWWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWNKkdl:,....             ..;cdOXWWWWWWWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWWWWWWWWXOo:'.      ....,;:cclllc::,'.    .:d0NWWWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWWWWN0d:.     ..;cdk0KKNNWWWWWWWWWWWNKOxl;.  .;xXWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWN0o,.    .'cdOXWWWWWWWWWWWWWWWWWWWWWWWWWWKxc.  'oKWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWXx;.    .;oONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXx,  'dXWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWKo'     ,o0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNk,  :0WWWWWWW\n" +
                                        "WWWWWWWWWWWWWWKo.    .:kXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXo. 'kWWWWWW\n" +
                                        "WWWWWWWWWWWWNx'    .:ONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNk. .kWWWWW\n" +
                                        "WWWWWWWWWWW0:     ,kNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWk' ,0WWWW\n" +
                                        "WWWWWWWWWNx.    .oXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWx. cXWWW\n" +
                                        "WWWWWWWWNo.    ,OWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXc .kWWW\n" +
                                        "WWWWWWWXl.    ;0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWk. oNWW\n" +
                                        "WWWWWWXl     :KWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWK, cXWW\n" +
                                        "WWWWWNd.    ;KWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXKKKKKKNWWWWWWWWWWWWWWX: :XWW\n" +
                                        "WWWWWk.    'OWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOk0XWWWNKXWWWWWWWWWWWWWK; lNWW\n" +
                                        "WWWWK;    .dWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNkxNWWWWWWNXWWWWWWWWWWWWWx..kWWW\n" +
                                        "WWWWd.    ;KWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKd0WWWWWWWNNWWWWWWWWWWWW0,.lNWWW\n" +
                                        "WWWX:    .dWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKokWWWWWWWWWWWWWWWWWWWW0;.lXWWWW\n" +
                                        "WWWO.    'OWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWkl0WWWWWWWWWWWWWWWWWXd''dNWWWWW\n" +
                                        "WWWd.    ;KWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNklxXWWWWWWWWWWWWN0o,'lKWWWWWWW\n" +
                                        "WWNc     :XWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW0dodkKXNNNNK0xl:;:xKWWWWWWWWW\n" +
                                        "WWNklcccckNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXkdooooolllldkXWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXXNNWWWWWWWWWWWWWWWWW\n" +
                                        "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"; 
        return avatar_moradores;
        
    }
    
    public static String avatar_puros(){
        final String avatar_puros = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMMMMNXXNMMMMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMMMWd''dWMMMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMMWd.  .dWMMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMWd.    .dWMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMNd.      .oNMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMWd.        .oNMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMWx.          .xWMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMN:            ;XMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMN:            ;XMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMXkoc::cldOXWO.          .kWXOdlc::cokXMMMMMM\n" +
                                    "MMMMNd'         .ckx'        .xkc.         'dNMMMM\n" +
                                    "MMMNl              :o.      .l:              cXMMM\n" +
                                    "MMMO.       ...     .;.    .;'     ...       .kMMM\n" +
                                    "MMM0,     :OXNX0d:.  .'    ..  .:dOXXXOc.    '0MMM\n" +
                                    "MMMWO,   :XMMMMMMW0;  ..  ..  ;0WMMMMMMNc   ,OWMMM\n" +
                                    "MMMMMNOl;dNMW0xxXKo,.         ,l0Xxx0WMWd;lkNMMMMM\n" +
                                    "MMMMMMMMWWWXl. '0Ko:. ..   . .:l0K, .lXWWWMMMMMMMM\n" +
                                    "MMMMMMMMMMMO.  .cxx:..;'  .;..:xxc.  .kMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMXl.      .:,    ';.      .lXMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMW0dc::ldkc.    .:kxl::cd0NMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMX0x,  'x0XMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMMMM0oo0MMMMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";

        return avatar_puros;
    }
    
    public static String avatar_protectores(){
        final String avatar_protectores = "  "
                + "  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKKXWMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKkc'...;dXMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMWWWWWMMMMMMMMMMMMNk;.,loc.  ,OWMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMWOl::::::::;;;;;dXMMMMMMMMMMMk. .cNMWKdxKWMWMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMNd.              .OWMWNXXNWMMWo   .kWMMMMMMMMMMWNXXXNWMMMMMMMMMMMMMM\n" +
                    "MWk;:ooooodddo:. .:OX0o:,'.',lkNO'   .oXMMMMMMWXxc:,..':dKWMMMMMMMMMMM\n" +
                    "MWXXWMMMMMMWXd'.;kNXl.;xOkd;.  :Ok,    ,kNMMMWO,.lkOxl'  .dNMMMMMMMMMM\n" +
                    "MMMMMMMMMMNk,.,kNMNo .kWXO0Kx'  ;00d:   .:ONWO, :KWXO00l. .dWMMMMMMMMM\n" +
                    "MMMMMMMMWO:.'dXWMMX; .oXd..cl;. .:ooc,.   .,:;. .:l;.'kNl  :XMMMMMMMMM\n" +
                    "MMMMMMWKl..lKWMMMMNo. .oOkkKX0; ,OXXXXO:    ,o,  'xOkOXMx..oWMMMMMMMMM\n" +
                    "MMMMWKo..:OWMMMMMMMXl.  ,ok0Oc.;ONKOKWWXo.  .kO,  .:xO0x;.oXMMMMMMMMMM\n" +
                    "MMMXd'.,xNMMMMMMMMMMW0o;...,;cxX0l. ,OWMNo. :XWXxc'..',:o0WMMMMMMMMMMM\n" +
                    "MWO,  .xNWMMMMMMMMMMMMMWNXKXNWMK;    .lOKd':0MMMMWNXKXXWMMMMMMMMMMMMMM\n" +
                    "MNo.   .dXWMMMMMMMMMMMMMMMMMMMMWk;..   .':xXMMMWMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMWO:.   ,xNMMMMMMMMMMMMMMMMMMMMMNK0OxxxolooodddONMMMMMMMMMMMMMMMMWWMM\n" +
                    "MMMMWO:.   ;kNMMMMMMMMMMWX0kkO0NMMMMMMMXc.   .:o0NMMMMMMMMMMMMMMNOxKWM\n" +
                    "MMMMMMNO:.  .;kNMMMMMMW0c'..  .,dXWMMMMWNx.  :XMMMMMMMMMMMMMWXko:cONMM\n" +
                    "MMMMMMMMW0c.   ,dKWMMMO'  ,dd;.  'odddxxxd,  'xO0OOOOOkkxdlc:;:lONWMMM\n" +
                    "MMMMMMMMMMWKo'   .ckNWk. 'oKWNl   .........   ........',;:ldkKNWMMMMMM\n" +
                    "MMMMMMMMMMMMWXk:.   'lkxkXWMMMx. 'kKK000OOOOOOOOOO00KXXNWWMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMW0d;.  .'lk0KKk,.,OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMWKxc,.......;dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMWNX0kxxkKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        
        return avatar_protectores;
    }
    
    public static String mensajeRepartoPuntos(int puntos_totales, String[] clases){
        String mensaje = "-------------------------------------------------------------------------------------------------------------------------------------------\n"
                     + "Ahora es el turno de potenciar tus habilidades. Ten en cuenta"
                     + " que los " + clases[1] + " son más fuertes, pero apenas tienen maná, los \n"
                     + clases[0] + " tienen buena defensa gracias a la protección de Saturno, y los " + clases[2]
                     + " tienen una alta cantidad de maná.\nTienes en total " + puntos_totales + " puntos. Ninguna habilidad "
                     + "puede tener más de 100 puntos. \nSi esto ocurriese, o si intentas dar más puntos "
                     + "de los que tengas disponibles, se te volverá a pedir un valor.\n"
                     + "-------------------------------------------------------------------------------------------------------------------------------------------\n";
        
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
    
    public static String mensajeCombate(){
        String mensaje = "----------------------------------------------------------------------------------------------------\n"
                + " Ahora os tocará enfrentaros entre vosotros. Podréis atacar o recuperar vida en"
                + " función de vuestra\n cantidad de maná. Lo que no podréis hacer bajo nignún concepto"
                + " es...huir.\n ¡Que empiece el duelo!\n"
                + "----------------------------------------------------------------------------------------------------";
        return mensaje;
    }
}
