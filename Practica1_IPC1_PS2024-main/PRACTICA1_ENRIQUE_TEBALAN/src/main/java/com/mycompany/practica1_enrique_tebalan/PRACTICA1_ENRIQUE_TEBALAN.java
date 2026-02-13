/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica1_enrique_tebalan;
/**
 *
 * @author kik3.h
 */
  import java.util.Scanner;       
  import java.util.Random;

public class PRACTICA1_ENRIQUE_TEBALAN { //LLAVE COMIENZO
    //COLORES A IMPRIMIR EN LA TERMINAL:
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CELESTE = "\u001B[36m";
    //SON LOS CONTADORES de las estadisiticas:
    static int cantVecesWordle = 0;
    static int cantVecesBasketball = 0;
    static int cantVeces2048 = 0; 
    static int cantVictoriasUsuario = 0;
    static int cantVictorias2048 = 0;
    static int cantVecesSalir2048 = 0;
    static int cantAdivinarWordle =0;
    static int cantDerrotasWordle =0;
   
    public static void main(String[] args) {
        int opcionDeInicio;
        
     Scanner scanner = new Scanner(System.in);
     
         System.out.println("");
         System.out.println(CELESTE+"  ========================================"+RESET);
         System.out.println(VERDE+"                ¡BIENVENID@! :D         "+RESET);
         System.out.println(CELESTE+"             -----------------            "+RESET);
         System.out.println(MORADO+"                 By kik3.h            "+RESET);
         System.out.println(CELESTE+"  ========================================"+RESET);
      
        if(args.length>0){
                iniciarJuegoPorParametro(args[0]); //aca detecta si hay o no alguna letra depues del comando .jar
        }
        else{
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println(ROJO+"Iniciando juego sin parámetro"+RESET);
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println("");
                menuPrincipal(); //sino le entra al menu principal xd
        }
    }
    public static void iniciarJuegoPorParametro(String parametroIniciar){
        if(parametroIniciar.equalsIgnoreCase("wordle")){
                System.out.println("");
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println("Iniciando juego con el parámetro: "+parametroIniciar);
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                wordle();
                menu2Medio(1);  
        }else if(parametroIniciar.equalsIgnoreCase("Basketball")){
                System.out.println("");
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println("Iniciando juego con el parámetro: "+parametroIniciar);
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                basketball();
                menu2Medio(2);  
        }else if(parametroIniciar.equalsIgnoreCase("2048")){
                System.out.println("");
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println("Iniciando juego con el parámetro: "+parametroIniciar);
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                dosMilCuarentaYOcho();
                menu2Medio(3);  
        }else if(parametroIniciar.equalsIgnoreCase("")){
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println("Ha ingresado un parametro inválido");
                System.out.println("Parámetro ingresado: "+parametroIniciar);
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println(ROJO+"Iniciando juego sin parámetro"+RESET);
                System.out.println(CELESTE+"--------------------------------------"+RESET);
                System.out.println("");
                menuPrincipal();
       }else
        {
            System.out.println(CELESTE+"--------------------------------------"+RESET);
            System.out.println(ROJO+"Iniciando juego sin parámetro"+RESET);
            System.out.println(CELESTE+"--------------------------------------"+RESET);
            System.out.println("");
            menuPrincipal();
        }
        
    }
    public static void menuPrincipal()
    {
    Scanner scanner=new Scanner(System.in);     
      int numeroOpcion=0;
      
        //System.out.print("\033c"); //limpia la casa xd
        System.out.println("");
        System.out.println(CELESTE+"---------------------------------------------"+RESET);
        System.out.println(VERDE+"        Seleccione su Juego"+RESET); 
        System.out.println(VERDE+"           Diviertase ;3"+RESET); 
        System.out.println(CELESTE+"---------------------------------------------"+RESET);
        System.out.println("(1). Wordle");
        System.out.println("(2). Basketball");
        System.out.println("(3). 2048");
        System.out.println("(4). Estadísticas");
        System.out.println("(5). SALIR");
        System.out.print(CELESTE+"Favor ingrese el numero de opción a elegir: "+RESET);
        
        numeroOpcion = Integer.parseInt(scanner.nextLine());
        
            switch (numeroOpcion)
            {
            case 1: if(numeroOpcion ==1)
                    {
                        //pide los parametros para iniciar al juego y ejecuta el juego wordle
                        System.out.print("\033c");
                        wordle();
                       // System.out.println(VERDE+ "aca inicia wordle"+ RESET);
                       menu2Medio(numeroOpcion);
                    }
            break;
            
            case 2: if(numeroOpcion ==2)
                    {
                        //pide los parametros para iniciar al juego y ejecuta el juego Basketball
                        System.out.print("\033c");
                        basketball();
                        menu2Medio(numeroOpcion);                
                    }
            break;
            
            case 3: if(numeroOpcion == 3)
                    {
                        //pide los parametros para iniciar al juego y ejecuta el juego 2048
                        System.out.print("\033c");
                        dosMilCuarentaYOcho();
                        menu2Medio(numeroOpcion);
                    }
            break;
            
            case 4: if(numeroOpcion == 4)
                    {
                        //muestra las estadisiticas y resultados de las partidas.
                        System.out.print("\033c");
                        resultadosYEstadisticas();
                        menuPrincipal();
                    }
            break;
            
            case 5: if(numeroOpcion == 5)
                    {
                        //UNICAMENTE SALE Y CIERRA TODO
                        System.out.print("\033c");
                        
                        System.out.println("");
                        System.out.println("-------------------------------------------");
                        System.out.println(CELESTE+"     Has elegido salir del juego "+RESET);
                        System.out.println(CELESTE+"--------------- "+RESET);
                        System.out.println(CELESTE+"       Regresa pronto :´c     "+RESET);
                        System.out.println("-------------------------------------------");
                        System.out.println("");
                                   
                        System.exit(0); //segun esto cierra todo jsjs
                    }
            break;
            
            default:
                        System.out.print("\033c");
                        System.out.println("");
                        System.out.println("##########################################");
                        System.out.println(ROJO+"Ingrese una opción valida por favor"+RESET);
                        System.out.println("##########################################");
                        System.out.println("");
                        menuPrincipal();
            }
    }
    //ES EL SEGUNDO MENU CUANDO EL JUDADOR YA HAYA INICIADO ALGUN JUEGO
    public static void menu2Medio(int juegoYaIniciado)
    {
        Scanner scanner=new Scanner(System.in);
         int numeroOpcion=0;
         int videojuegoNay;
         
        videojuegoNay = juegoYaIniciado;
        
        System.out.println("");
        System.out.println(CELESTE+"-------------------------------------------"+RESET);
        System.out.println("(1).    Jugar de nuevo");
        System.out.println("(2).    Elegir otro juego");
        System.out.println("(3).    Mostrar estadísticas y resultados");
        System.out.println("(4).    Salir");
        System.out.println(CELESTE+"-------------------------------------------"+RESET);
        System.out.println(VERDE+"FAVOR INGRESE UNA OPCIÓN"+RESET);
        numeroOpcion = Integer.parseInt(scanner.nextLine());
            
            switch (numeroOpcion)
            {
                case 1: if(numeroOpcion == 1)
                        {
                            iniciarOtraVez(videojuegoNay);
                        }
                break;
                    
                case 2: if(numeroOpcion == 2)
                        {
                            System.out.print("\033c");
                            menuPrincipal();
                        }
                break;
                
                case 3: if (numeroOpcion == 3)
                        {
                            System.out.print("\033c");
                            resultadosYEstadisticas();
                            menu2Medio(videojuegoNay);
                        }
                break;
                
                case 4: if (numeroOpcion == 4)
                        {
                            System.out.print("\033c");
                            System.out.println("---------------------------------------");
                            System.out.println(CELESTE+"     Has elegido salir del juego "+RESET);
                            System.out.println(CELESTE+"          --------------- "+RESET);
                            System.out.println(CELESTE+"      Regresa pronto :´c     "+RESET);
                            System.out.println("---------------------------------------");           
                            System.exit(0);
                        }
                break;
                
                default:
                        System.out.print("\033c");
                        System.out.println("");
                        System.out.println("##########################################");
                        System.out.println(ROJO+"Ingrese una opción valida por favor"+RESET);
                        System.out.println("##########################################");
                        System.out.println("");
                        menu2Medio(videojuegoNay);
            }
    }
    /* si el usuario a terminado el juego y si elige jugar de nuevo, se inicia todo de nuevo */
    public static void iniciarOtraVez(int juegoYaIniciado)
    {
        //verifica y ejecuta dependiendo del menu2medio y de la opcion de juego
        switch (juegoYaIniciado)
        {
            case 1: if (juegoYaIniciado == 1 )
                    {
                        System.out.print("\033c");
                        wordle ();
                        menu2Medio(juegoYaIniciado);
                    }
            break;
            
            case 2: if (juegoYaIniciado == 2 )
                    {
                        System.out.print("\033c");
                        basketball();
                        menu2Medio(juegoYaIniciado);
                    }
            break;
            
            case 3: if (juegoYaIniciado == 3 )
                    {
                        System.out.print("\033c");
                        dosMilCuarentaYOcho();
                        menu2Medio(juegoYaIniciado);
                    }
            break;        
        }
    }
    // unicamente guarda y muetra las estadisticas y resultados
    public static void resultadosYEstadisticas ()
    {
            System.out.println(MORADO+"#####################################################################"+RESET);
            System.out.println(VERDE+ "        RESULTADOS Y ESTADISTICAS: By kik3.h"+ RESET);
            System.out.println(CELESTE+"------------------------------------------------"+RESET);
            System.out.println("     Cantidad de veces que se ha iniciado un juego:");
            System.out.print("     WORDLE: "+cantVecesWordle);
            System.out.print("     BASKETBALL: "+cantVecesBasketball);
            System.out.println("   2048: "+cantVeces2048);
            System.out.println(CELESTE+"------------------------------------------------- \n"+RESET);
            System.out.println("   Cantidad de veces que el jugador ha intentado \n adivinar una palabra en Wordle:"+cantAdivinarWordle);
            System.out.println(CELESTE+"---------------------------------------------"+RESET);
            System.out.println(VERDE+"Victorias Humanas WORDLE: "+cantVictoriasUsuario+RESET);
            System.out.println(VERDE+"Victorias en el juego 2048: "+cantVictorias2048+ROJO);
            System.out.println(ROJO+"Cantidad de veces que el jugador ha perdido Wordle: "+cantDerrotasWordle+RESET);
            System.out.println(AMARILLO+"Cantidad de veces que el jugador ha salido \n del juego 2048 sin finalizar el juego:"+cantVecesSalir2048+RESET);
            System.out.println(CELESTE+"----------------------------------------------"+RESET); 
            System.out.println("GRACIAS POR JUGAR MI VIDEOJUEGO :´3");
            System.out.println(ROJO+"           By: kik3.h"+RESET);
            System.out.println(MORADO+"#####################################################################"+RESET);
    }
    //ACA VIDEOJUEGO WORDLE 
    public static int intentos =0; //la generalice
    public static void wordle()
    {
        cantVecesWordle++;
        Scanner scanner=new Scanner(System.in);
        boolean palabraValida5 =false ;
        String palabrabescondida;
        boolean yaGano;
        intentos =0;
            do{ //ACA ME VERIFICA SI SI TIENE 5 LETRAS
    
                System.out.println("");
                System.out.println(CELESTE+"------------------------------------------------------"+RESET);
                System.out.println("          ¡               "+MORADO+"W"+RESET+VERDE+"O"+RESET+AMARILLO+"R"+RESET+ROJO+"D"+RESET+AZUL+"L"+RESET+AMARILLO+"E"+RESET+"                 !       ");

                System.out.println("                       -----------");
                System.out.println("        Gana quien adivine la palabra oculta :D");
                System.out.println(CELESTE+"--------------------------------------------------------"+RESET);
                System.out.println("");
                System.out.println("");
                System.out.println(CELESTE+"Favor Ingresa la palabra oculta de 5 letras:"+RESET);

                palabrabescondida = scanner.nextLine(); // aca pide la palabra oculta al usuario
    
                    if (palabrabescondida.length() != 5) { //ACA VERIFICA SI SI TIENE 5 LETRAS NADA MAS, SINO QUE VUELVA AINTENTARLO

                            System.out.println(ROJO+"La palabra oculta debe tener exactamente 5 letras."+RESET);
                    } else {
                            palabraValida5 = true;
                    }
            }while(!palabraValida5); //sigue alertando hasta que si sean 5 letras en la palabra

        String[]CantIntentosAnteriores = new String[6];
    
        System.out.print("\033c"); //luego limpia para ocultar y asi realmetne adivinar
    
        System.out.println("");
        System.out.println(CELESTE+"------------------------------------------------------"+RESET);
        System.out.println("          ¡               "+MORADO+"W"+RESET+VERDE+"O"+RESET+AMARILLO+"R"+RESET+ROJO+"D"+RESET+AZUL+"L"+RESET+AMARILLO+"E"+RESET+"                 !       ");
 
        System.out.println("                       -----------");
        System.out.println("        Gana quien adivine la palabra oculta :D");
        System.out.println(CELESTE+"--------------------------------------------------------"+RESET);
        System.out.println("");

            yaGano = false; //este valor me dira si ya o no gano, dependiendo si se cumple la ocndicion
        
            do{
                cantAdivinarWordle++;
                intentos++; //al iniciar este contador aumenta
                System.out.println("Intento número " + intentos + ". Por favor, ingresa tu palabra.");

                String palabraDelJugador = scanner.nextLine().toLowerCase(); //aca ingresa la palabra el usuario

                CantIntentosAnteriores[intentos - 1] = palabraDelJugador; //aca me lleva el conteo restante que le quedan al usuario

                    if(palabraDelJugador.length()!=5) //aca me valida si si tiene 5 letras la palabra ingresada por el usuario
                    {
                        System.out.println(ROJO+"¡La palabra ingresada debe tener exactamente 5 letras!"+RESET);
                        intentos --; //resta 1 intento para que el judador pueda seguir en donde se quedo y no perder la oportunidad por ingresar letras de mas
                        continue; //aca sigue evaluando y mostrando letras acorde al color, como si no pasara nada xd
                    }

                         if (palabraDelJugador.equals(palabrabescondida.toLowerCase())) 
                            {
                                    cantVictoriasUsuario++;
                                    System.out.println(CELESTE+"----------------------------------------------------------------"+RESET);
                                    System.out.println(AMARILLO+"¡Felicitaciones! Has adivinado la palabra en el intento: " + RESET+ CELESTE+intentos +RESET + ".");
                                    yaGano= true; //si se cumple la condicion esto se vuelve verdadero
                                    System.out.println("LA PALABRA ES: "+VERDE+palabrabescondida+RESET);
                                    System.out.println(CELESTE+"----------------------------------------------------------------"+RESET);
                                    //intentos = 0; //aca al acertar se reinicia los intentos a 0 por si desea jugar de nuevo
                                    break; //esto detiene todo si se cumple la condicion
                            }else 
                            {
                                    //System.out.println("Palabra ingresada: " + palabraDelJugador); esto era informativo pero se repetia y se llenaba de mucha informacion
                                    //System.out.println("Intentos anteriores:"); //lo oculte porque mucho texto para el usuario jaja
                                    for (int i = 0; i < intentos; i++) {
                                    //System.out.println(CantIntentosAnteriores[i]); //aca mostraba al usuario cuantos intentos  llevaba
                            }
                                    verificadorPalabra(palabraDelJugador, palabrabescondida); //aca llama al subprograma que verifica las letras y su posicion
                            }
                                if (!yaGano && intentos ==6)
                                {
                                        cantDerrotasWordle++;
                                        //cantVictoriasCPU++;
                                        System.out.println(CELESTE+"----------------------------------------------------------------"+RESET);
                                        System.out.println(ROJO+"   Lo siento, no has adivinado la palabra en tus primeros 6 intentos."); 
                                        System.out.println("La palabra oculta era: "+RESET+VERDE + palabrabescondida+RESET);
                                        System.out.println(CELESTE+"----------------------------------------------------------------"+RESET);
                                        //intentos = 0;
                                }

            }while(intentos < 6 && !yaGano);
        System.out.println(CELESTE+"--------------------------------------------------"+RESET);  
        System.out.println("      Gracias por jugar. Hasta luego :)       ");
        System.out.println(CELESTE+"--------------------------------------------------"+RESET);
    }
    //aca se verifican las cadenas de texto por posicion y comparacion wordle
    public static void verificadorPalabra(String palabraDelJugador, String palabraescondida)
    {
        char letraJugador;
        char letraOculta;
        
        StringBuilder resultado = new StringBuilder(); //permite modificar el contenido de la cadena sin tener que crear un nuevo objeto de cadena cada vez. 
        
            for (int i = 0; i < palabraDelJugador.length(); i++) {
                letraJugador = palabraDelJugador.charAt(i);
                letraOculta = palabraescondida.charAt(i);
                    if (Character.toUpperCase(letraJugador) == Character.toUpperCase(letraOculta)) 
                    {
                        resultado.append(VERDE).append(Character.toUpperCase(letraJugador)).append(RESET); //aca verifica y a la vez convierte en mayuscula indiferentemente si este o no enn minuscula
                    } else if (palabraescondida.contains(String.valueOf(Character.toUpperCase(letraJugador))))  //append crear y manipular cadenas de caracteres de manera eficiente.
                    {
                        resultado.append(AMARILLO).append(Character.toUpperCase(letraJugador)).append(RESET);
                    } else 
                    {
                        resultado.append(ROJO).append(Character.toUpperCase(letraJugador)).append(RESET);
                    }
            }
        System.out.println(MORADO+"El Resultado es:"+RESET);
        System.out.println(resultado.toString());
    }
    public static int intentosbasketball =0;
    public static void basketball ()
    {
        cantVecesBasketball++;
        int cantDeTurnos =0;
        int puntosDelJugador1 =0;
        int puntosDelJugador2 =0;
        int puntosTotales1 =0;
        int puntosTotales2 =0;
        int opcionDeJugador;
        int opcionDelJugador1;
        int opcionDelJugador2;
        Scanner scanner = new Scanner(System.in);
        
            System.out.println(CELESTE+"------------------------------------------------------------"+RESET);
            System.out.println("");
            System.out.println(AMARILLO+" ¡Bienvenido "+RESET+ AZUL+" al juego de "+RESET+AMARILLO+" Basketball! "+RESET);
            System.out.println("");
            System.out.println(CELESTE+"------------------------------------------------------------"+RESET);
            System.out.println("");
            System.out.println("Favor, ingresa el nombre del Jugador 1:");
            String nombreDelJugador1 = scanner.nextLine();
            System.out.println("Ingresa el nombre del Jugador 2:");
            String nombreDelJugador2 = scanner.nextLine();
            System.out.println("Ingresa la cantidad de turnos:");
            cantDeTurnos = scanner.nextInt(); //aca obtengo un valor entero para iniciar el ciclo de turnos hasta el limite que indique el jugador
        
                for (int t=1; t <= cantDeTurnos; t++ ) //t de turnos jajakjs
                {
                    System.out.println(CELESTE+"------------------------------------------------------------"+RESET);
                    intentosbasketball++;
                    System.out.println(CELESTE+" TURNO " + t + ":"+RESET);
                    opcionDelJugador1 = seleccionarOpcionDelJugador(jugadorEnTurnoSO,nombreDelJugador1,nombreDelJugador2,true); //aca mando a llamar al metodo de elegir opciion para el jugador 1
                                                                                                //true para jugador 1
                    puntosDelJugador1 += ejecutarAccionDelJugador(opcionDelJugador1,nombreDelJugador1,nombreDelJugador2, true);//+ tiroLibreDelJugador(nombreDelJugador1, nombreDelJugador2, true) ; //aca mando a llamar los resultados de sus acciiones del jugador 1                                                                 
                    opcionDelJugador2 = seleccionarOpcionDelJugador(jugadorEnTurnoSO,nombreDelJugador1,nombreDelJugador2,false); //aca lo mismo que en el 1 xd
                                                                                                //false para jugador 2
                    puntosDelJugador2 += ejecutarAccionDelJugador(opcionDelJugador2, nombreDelJugador1, nombreDelJugador2, false);//+tiroLibreDelJugador(nombreDelJugador1, nombreDelJugador2, false);

                }
            
            //puntosTotales1= puntosDelJugador1+ tiroLibreDelJugador();
            System.out.println(CELESTE+"RESULTADOS FINALES"+RESET);
            System.out.println(nombreDelJugador1 + ": " + puntosDelJugador1 + " puntos");
            System.out.println(nombreDelJugador2 + ": " + puntosDelJugador2 + " puntos");
                if (puntosDelJugador1 > puntosDelJugador2) {
                    System.out.println(CELESTE+"  ========================================"+RESET);
                    System.out.println(VERDE+nombreDelJugador1 + "       GANO EL JUEGO!!!"+RESET);
                    System.out.println(CELESTE+"  ========================================"+RESET);
                } else if (puntosDelJugador1 < puntosDelJugador2) {
                    System.out.println(CELESTE+"  ========================================"+RESET);
                    System.out.println(VERDE+ nombreDelJugador2 + "     GANO EL JUEGO!!!"+RESET);
                    System.out.println(CELESTE+"  ========================================"+RESET);
                } else {
                    System.out.println("##########################################");
                    System.out.println(AMARILLO+ "HUBO EMPATE!!!!!!"+RESET);
                    System.out.println("##########################################");
                }
        
    }
    public static String jugadorEnTurnoSO; //la generalice para que funcionara jsjs
    public static int seleccionarOpcionDelJugador( String jugadorEnTurnoSO, String nombreDelJugador1, String nombreDelJugador2,boolean esTurnoDelJugador ) //el boolen solo me muestra correctamente le nombre de quien es el turno para ser informativos xd
           // el boolen unicamente me muestra correctamente de quien es el turno, por informacion.
    {
        //boolean esTurnoDelJugador ;
       Scanner scanner = new Scanner(System.in);
        // jugadorEnTurnoSO = ejecutarOpcionDelJugador(String jugadorEnTurno);
        int numeroDeOpcion = 0;
        jugadorEnTurnoSO = esTurnoDelJugador ? nombreDelJugador1 : nombreDelJugador2 ;      //aca dependiendo del valor boolean muestra el nombre 
        do{
            System.out.println(CELESTE+"  ========================================"+RESET);
            System.out.println(CELESTE+"Es turno de " + RESET + AMARILLO +jugadorEnTurnoSO + RESET + CELESTE+". ¿Qué acción deseas realizar? :"+RESET);
            System.out.println("1. SALTO LARGO");
            System.out.println("2. TIRO LARGO");
            System.out.println("3. DEFENSA CUERPO A CUERPO");
            System.out.println("4. DEFENSA FUERTE");
            System.out.println(CELESTE+"  ========================================"+RESET);
            System.out.print("Favor Ingresa el numero de opcion:");
            numeroDeOpcion = scanner.nextInt();
           
                if (numeroDeOpcion < 1 || numeroDeOpcion> 4) 
                {
                    System.out.println("Opción no válida. Por favor, ingresa un número entre 1 y 5.");
                } 
                
                jugadorEnTurnoSO= ""; // Limpia la variable asignándole una cadena vacía     
        }while (numeroDeOpcion < 1 || numeroDeOpcion > 4);
        
        return numeroDeOpcion; //aca devuelvo el numero de opcion que haya elegido el jugador en su turno
    }
    //aca yo clasicico y ordeno las acciones acorde al turno de cada jugador, debido al boolean
    public static int ejecutarAccionDelJugador (int numeroDeOpcion, String nombreDelJugador1, String nombreDelJugador2, boolean esTurnoDelJugador)
    {
        int cantPuntos = 0;
        String jugadorEnTurno = esTurnoDelJugador ? nombreDelJugador1 : nombreDelJugador2;
    //Math.random me devuelve un número decimal aleatorio entre 0 y 1. Si este número es menor o igual al porcentaje de probabilidad, ejecuto el punteo
                        
        double primeraProbabilidad=0;
        double prdefensa =0;
        double calcular = Math.random(); //SALTO LARGO 65%
        double calcular1 = Math.random();//SALTO CORTO 80 %
        double calcular2 = Math.random();//defensa cuerpo a cuerpo 65%
        double calcular3 = Math.random();//defensa fuerte 35%
        boolean faltas= false;
            switch (numeroDeOpcion)
            {
                case 1: 

                        if ((calcular =-prdefensa) <= 0.65 ) //SALTO LARGO 
                        {
                            cantPuntos += 3;
                            System.out.println(AMARILLO+jugadorEnTurno + RESET+VERDE+  " anotó 3 puntos. Deste salto largo!"+RESET);
                            System.out.println(CELESTE+"  ========================================"+RESET);
                            primeraProbabilidad = calcular;

                        } else{
                            System.out.println(ROJO+ jugadorEnTurno + " falló el salto largo."+RESET);
                        }
                            jugadorEnTurno= ""; // Limpia la variable asignándole una cadena vacía 
                break;

                case 2: 

                        if ((calcular1 =- prdefensa) <= 0.80 ) //esto es el salto corto
                        {
                           cantPuntos += 2;

                           System.out.println(VERDE+jugadorEnTurno + " anotó 2 puntos. Desde salto corto!"+RESET);
                           System.out.println(CELESTE+"  ========================================"+RESET);
                        } else{
                           System.out.println(ROJO+jugadorEnTurno + " falló el salto corto."+RESET);
                        }
                           jugadorEnTurno= ""; // Limpia la variable asignándole una cadena vacía 
                break;

                case 3: if (calcular2 <= 0.65 ) //defensa cuerpo a cuerpo
                        {
                            prdefensa =+ 0.15;
                            System.out.println(AMARILLO+jugadorEnTurno+ " si redujo la probabilidad de anotar"+RESET);
                             System.out.println(CELESTE+"  ========================================"+RESET);
                        }else {
                        prdefensa=0;
                        faltas= true; //aca se activa la falta para el tiro libre
                        System.out.println(ROJO+jugadorEnTurno + " COMETIO FALTA."+RESET);
                        if (faltas == true)
                                {  
                                    esTurnoDelJugador = true;
                                    String jugadordañado = esTurnoDelJugador ? nombreDelJugador1 : nombreDelJugador2;
                                    System.out.println(AMARILLO+"SE LE CONCEDE UN TIRO LIBRE A "+jugadordañado +" SIGUIENTE JUGADOR:"+RESET);
                                    cantPuntos +=tiroLibreDelJugador(nombreDelJugador1, nombreDelJugador2,esTurnoDelJugador); //aca de una vez se suma el punto de tiro libre
                            }else
                            {
                                 System.out.println("NO HUBO FALTA");
                            }
                        //cantPuntos +=tiroLibreDelJugador(nombreDelJugador1, nombreDelJugador2,esTurnoDelJugador); //ACA MANDO A LLAMAR EL MODULO DE LANZAMIENTOS DE TIRO LIBRE
                        }
                        jugadorEnTurno= ""; // Limpia la variable asignándole una cadena vacía 
                break;

                case 4: if(Math.random() <= 0.35 ) //DEFENSA FUERTE
                        {
                            prdefensa =+0.30;
                            System.out.println(AMARILLO+jugadorEnTurno+ " si redujo la probabilidad de anotar"+RESET);
                             System.out.println(CELESTE+"  ========================================"+RESET);
                        }else{
                            prdefensa =+0;
                            faltas = true;
                            System.out.println(ROJO+jugadorEnTurno + " COMETIO FALTA."+RESET);
                            if (faltas == true)
                                {  
                                    esTurnoDelJugador = true;
                                    String jugadordañado = esTurnoDelJugador ? nombreDelJugador1 : nombreDelJugador2;
                                    System.out.println(AMARILLO+"SE LE CONCEDE UN TIRO LIBRE A "+jugadordañado +" SIGUIENTE JUGADOR:"+RESET);
                                    cantPuntos +=tiroLibreDelJugador(nombreDelJugador1, nombreDelJugador2,esTurnoDelJugador); //aca de una vez se suma el punto de tiro libre
                            }else
                            {
                                 System.out.println("NO HUBO FALTA");
                            }
                        }

                            jugadorEnTurno= ""; // Limpia la variable asignándole una cadena vacía 
                break;
            }
       /* if (faltas == true)
        {  
            esTurnoDelJugador = true;
            String jugadordañado = esTurnoDelJugador ? nombreDelJugador1 : nombreDelJugador2;
            System.out.println(AMARILLO+"SE LE CONCEDE UN TIRO LIBRE A "+jugadordañado +"SIGUIENTE JUGADOR:"+RESET);
            cantPuntos +=tiroLibreDelJugador(nombreDelJugador1, nombreDelJugador2,esTurnoDelJugador); //aca de una vez se suma el punto de tiro libre
        }else
        {   
        }*/
        //return jugadorEnTurno;
        return cantPuntos;
    }
    public static int tiroLibreDelJugador(String nombreDelJugador1, String nombreDelJugador2, boolean esTurnoDelJugador)
    {
        Scanner scanner = new Scanner(System.in);
        
        double calcularTl= Math.random();
        String jugadorEnTurno = esTurnoDelJugador ? nombreDelJugador1 : nombreDelJugador2;
        System.out.println(CELESTE+"  ========================================"+RESET);
        System.out.println(MORADO+"Es el tiro libre de " + jugadorEnTurno + ". ¿Deseas ejecutar tu tiro libre?");
        System.out.println("1. Intentar anotar");
        System.out.println("2. Continuar");
        System.out.print("Ingresa el número de la opción:"+RESET);
        int puntosDeTiroLibre =0;
        int opcionTiroLibre = scanner.nextInt();
        
            switch(opcionTiroLibre)
            {
                case 1: if(calcularTl <= 0.80 ) //tiro libre
                {
                    puntosDeTiroLibre =+2;
                    System.out.println(VERDE+ jugadorEnTurno + " anotó 2 puntos."+RESET);
                }else
                {
                    System.out.println(ROJO+ jugadorEnTurno + " FALLO EL TIRO !"+RESET);
                    puntosDeTiroLibre =+0;
                }
                break;

                case 2:
                     System.out.println( " continuemos!");

                break;
                default:
                    System.out.println( " INGRESA UNA OPCION VALIDA");
                    System.out.print("\033c"); 
            } 
        return puntosDeTiroLibre;
    }
    //public static int[][] board = new int[4][4]; ACA SI YA INVESTIGUE Y PUSE MAS ATENCION, POR ESO YA IMPLEMENTE LOS PRIVATE STATIC
    //public static boolean[][] moved = new boolean[4][4];
    private static int[][] tableroNay = new int[4][4];
    private static boolean[][] movimientoGeneral = new boolean[4][4];
    public static void dosMilCuarentaYOcho () //Este es el módulo principal que contiene el ciclo principal del juego y todas las llamadas a las funciones que manejan el tablero y las jugadas.
    {
    
    Scanner scanner = new Scanner(System.in);
        cantVeces2048++;
        iniciarvideoJuegoNay();
        mostratTableroNay();

        while (!finDelJuego2048()) {
            System.out.println(CELESTE+"------------------------------------------------------------"+RESET);
            System.out.println("");
            System.out.println(AMARILLO+" ¡ Bienvenido "+RESET+ AZUL+" al juego "+RESET+AMARILLO+" 2048 ! "+RESET);
            System.out.println("");
            System.out.println(CELESTE+"------------------------------------------------------------"+RESET);
            System.out.println("Muevete para lograr sumar 2048 :D");
            System.out.println("");
            System.out.println(CELESTE+"========================================"+RESET);
            System.out.println("INGRESA UN MOVIMIENTO   (en minuscula): ");
            System.out.println("        w: Moverse Hacia Arriba      ˄ ");
            System.out.println("        s: Moverse Hacia Abajo       ˅");
            System.out.println("        d: Moverse Hacia Derecha     >");
            System.out.println("        a: Moverse Hacia Izquierda   <");
            System.out.println("        q: Salir del Juego 2048.");
            System.out.println(CELESTE+"========================================"+RESET);
            System.out.print(AMARILLO+"Favor ingresa alguna Opcion:"+RESET);
            //String jugada = scanner.nextLine().toLowerCase();
            String indicacionDeMovimiento = scanner.nextLine();
            boolean movimientoEspecifico = false;

            switch (indicacionDeMovimiento) {
                case "w":
                    movimientoEspecifico = movimientoHaciaArriba();
                    break;
                case "a":
                    movimientoEspecifico = movimientoHaciIzquierda();
                    break;
                case "s":
                    movimientoEspecifico = movimientoHaciaAbajo();
                    break;
                case "d":
                    movimientoEspecifico = movimientoHaciaDerecha();
                    break;
                case "q":
                    cantVecesSalir2048++; //CONTEO DE VECES QUE SALIO SIN COMPLETAR
                    System.out.println(ROJO+"HA SALIDO DEL JUEGO 2048 EXITOSAMENTE..."+RESET);
                    return;
                default:
                    System.out.println(ROJO+"Jugada inválida. Por favor ingrese w, a, s, o d para mover, o q para salir."+RESET);
            }

            if (movimientoEspecifico) {
                //System.out.println(ROJO+"GAME OVER"+RESET);
                generarNuevoNumeroAleatorio();
                mostratTableroNay();
            }
        }
            System.out.println("##########################################");
            System.out.println(ROJO+"           GAME OVER"+RESET);
            System.out.println("##########################################");
    }

    private static void iniciarvideoJuegoNay() { // Este módulo se encarga de inicializar el juego. En este caso, simplemente agrega un nuevo número al tablero.
        generarNuevoNumeroAleatorio(); //jiji por un bug decidi tener un modulo dentro de un modulo jsjs.
    }

    private static void mostratTableroNay() { //Este módulo imprime el tablero en la consola. Usa caracteres especiales para crear un formato visualmente atractivo y colores
        System.out.print("\033c"); //LIMPIA LA CASAAAAAAAAAAA
            for (int i = 0; i < 4; i++) {
                System.out.println("┌───────┬───────┬───────┬───────┐");
                System.out.print("│      ");
                    for (int j = 0; j < 4; j++) {
                        String color = mostrarColorNumeroEspecifico(tableroNay[i][j]);
                        System.out.printf("%5s", color + tableroNay[i][j] + "\u001B[0m");
                        System.out.print("│      ");
                    }
                System.out.println();
                System.out.println("├───────┼───────┼───────┼───────┤");
            }
                System.out.println("└───────┴───────┴───────┴───────┘");
    }

    private static String mostrarColorNumeroEspecifico(int mostrarNumero) { //este modulo me imprime los colores acorde al numero de la sumatoria random
        switch (mostrarNumero) { //
            case 2:
                return VERDE; // Verde
            case 4:
                return AMARILLO; // Amarillo
            case 8:
                return AZUL; // Azul
            case 16:
                return MORADO; // Morado
            case 32:
                return CELESTE; // Celeste
            case 64:
                return ROJO; // Rojo
            default:
                return "\u001B[0m"; // Por defecto (blanco)
        }
    }

    private static void generarNuevoNumeroAleatorio() { //EL METODO RANDOM ME GENERA UN NUMERO ALEATORIO SIEMPRE Y CUANDO SEA MULTIPLO DE 4
        Random rand = new Random(); //Este módulo elige una casilla aleatoria vacía en el tablero y coloca un nuevo número (2 o 4) en ella.
        int numFilaNay = rand.nextInt(4);
        int numColumnaNay = rand.nextInt(4);

        while (tableroNay[numFilaNay][numColumnaNay] != 0) {
            numFilaNay = rand.nextInt(4);
            numColumnaNay = rand.nextInt(4);
        }

        tableroNay[numFilaNay][numColumnaNay] = (rand.nextInt(2) + 1) * 2; //aca mate basica sumar y multiplicar
    }

    private static boolean finDelJuego2048() { //ACA SE VERIFICA SI TIENE O YA NO MAS MOVIMIENTOS.
        for (int i = 0; i < 4; i++) { //
            for (int j = 0; j < 4; j++) {
                if (tableroNay[i][j] == 2048) {
                    System.out.println(VERDE+"¡GANASTE! ¡Obtuviste el número 2048!"+RESET); 
                    cantVictorias2048++;
                    return true;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { //ACA SI ALGUNA CELDA SIGUE EN CERO QUE AUN EXISTA MOVIMIENTO
                if (tableroNay[i][j] == 0) {
                    return false;
                }
            }
        }
        System.out.println(ROJO+"Fin del juego. Ya no se pueden hacer más movimientos."+RESET);
    return true;
    }

    private static boolean movimientoHaciaArriba() { //me mueve todo el tablero hacia arriba con su valores y posiciones
        boolean movimientoEspecifico = false; //Este módulo se encarga de mover todos los números hacia arriba en el tablero. Combina números iguales que colisionan y agrega nuevos números aleatorios.

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                if (tableroNay[i][j] != 0 && (tableroNay[i + 1][j] == 0 || tableroNay[i][j] == tableroNay[i + 1][j])) {
                    if (tableroNay[i + 1][j] == 0) { //condicion de suma sino 0
                        tableroNay[i + 1][j] = tableroNay[i][j];
                        tableroNay[i][j] = 0;
                        movimientoEspecifico = true;
                    } else if (tableroNay[i][j] == tableroNay[i + 1][j] && !movimientoGeneral[i + 1][j]) {
                        tableroNay[i + 1][j] *= 2;
                        tableroNay[i][j] = 0;
                        movimientoGeneral[i + 1][j] = true;
                       movimientoEspecifico = true;
                    }
                }
            }
        }

        generarNuevoMovimientoGeneral();
        return movimientoEspecifico;
    }

    private static boolean movimientoHaciIzquierda() {
        boolean movimientoEspecifico = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (tableroNay[i][j] != 0 && (tableroNay[i][j + 1] == 0 || tableroNay[i][j] == tableroNay[i][j + 1])) {
                    if (tableroNay[i][j + 1] == 0) {
                        tableroNay[i][j + 1] = tableroNay[i][j];
                        tableroNay[i][j] = 0;
                        movimientoEspecifico = true;
                    } else if (tableroNay[i][j] == tableroNay[i][j + 1] && !movimientoGeneral[i][j + 1]) {
                        tableroNay[i][j + 1] *= 2;
                        tableroNay[i][j] = 0;
                        movimientoGeneral[i][j + 1] = true;
                        movimientoEspecifico = true;
                    }
                }
            }
        }

        generarNuevoMovimientoGeneral();
        return movimientoEspecifico;
    }

    private static boolean movimientoHaciaAbajo() {
        boolean movimientoEspecifico = false;

        for (int j = 0; j < 4; j++) {
            for (int i = 3; i > 0; i--) {
                if (tableroNay[i][j] != 0 && (tableroNay[i - 1][j] == 0 || tableroNay[i][j] == tableroNay[i - 1][j])) {
                    if (tableroNay[i - 1][j] == 0) {
                        tableroNay[i - 1][j] = tableroNay[i][j];
                        tableroNay[i][j] = 0;
                        movimientoEspecifico = true;
                    } else if (tableroNay[i][j] == tableroNay[i - 1][j] && !movimientoGeneral[i - 1][j]) {
                        tableroNay[i - 1][j] *= 2;
                        tableroNay[i][j] = 0;
                        movimientoGeneral[i - 1][j] = true;
                        movimientoEspecifico = true;
                    }
                }
            }
        }

        generarNuevoMovimientoGeneral();
        return movimientoEspecifico;
    }

    private static boolean movimientoHaciaDerecha() {
        boolean movimientoEspecifico = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                if (tableroNay[i][j] != 0 && (tableroNay[i][j - 1] == 0 || tableroNay[i][j] == tableroNay[i][j - 1])) {
                    if (tableroNay[i][j - 1] == 0) {
                        tableroNay[i][j - 1] = tableroNay[i][j]; //aca me suman los valores unos a otros
                        tableroNay[i][j] = 0;
                        movimientoEspecifico = true;
                    } else if (tableroNay[i][j] == tableroNay[i][j - 1] && !movimientoGeneral[i][j - 1]) {
                        tableroNay[i][j - 1] *= 2;
                        tableroNay[i][j] = 0;
                        movimientoGeneral[i][j - 1] = true;
                        movimientoEspecifico = true;
                    }
                }
            }
        }

        generarNuevoMovimientoGeneral();
        return movimientoEspecifico; // me devuelve la impresion de hacia donde se movieron
    }

    private static void generarNuevoMovimientoGeneral() { //Este módulo reinicia la matriz movido a false en cada posición, lo que es necesario para el funcionamiento de las funciones 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //System.out.println(ROJO+"GAME OVER, INTENTALO DE NUEVO"+RESET);
                movimientoGeneral[i][j] = false;
            }
        }
    }
}   //llave del final