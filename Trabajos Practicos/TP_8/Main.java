package Trabajos_Practicos.TP_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IVehichulo arreglo[] = new IVehichulo[7];

        int opcion, velocidad;
        String marca;

        Scanner input = new Scanner(System.in);

        int contC = 0;
        int contM = 5;

        do {
            opcion = Menu.pantalla();

            switch (opcion) {

                case 1: {


                    if (contC < 5) {

                        System.out.println("Ingrese la Marca de su auto");
                        marca = input.next();
                        System.out.println("Ingrese la velocidad a la que circula actualmente");
                        velocidad = input.nextInt();

                        if (velocidad > 0) {

                            if (velocidad <= 120) {
                                Coche.crear(contC, arreglo, marca, velocidad);
                                contC++;
                            } else {
                                System.out.println("La velocidad ingresada es superior a la maxima, no se creara el auto");
                            }
                        } else {
                            System.out.println("La velocidad ingresada es negativa, no se creara el auto");
                        }

                    } else {
                        System.out.println("No hay mas plazas disponibles");
                    }

                    break;

                }
                case 2: {

                    if (contM < 7) {

                        System.out.println("Ingrese la Marca de su Moto");
                        marca = input.next();
                        System.out.println("Ingrese la velocidad a la que circula actualmente");
                        velocidad = input.nextInt();

                        if (velocidad > 0) {

                            if (velocidad <= 120) {
                                Moto.crear(contM, arreglo, marca, velocidad);
                                contM++;
                            } else {
                                System.out.println("La velocidad ingresada es superior a la maxima, no se creara la moto");
                            }
                        } else {
                            System.out.println("La velocidad ingresada es negativa, no se creara la moto");
                        }

                    } else {
                        System.out.println("No hay mas plazas disponibles");
                    }
                    break;

                }
                case 3: {
                    Coche.getCoche(contC, arreglo);
                    Moto.getMotos(contM, arreglo);
                }
                case 4: {
                    System.out.println("Desea frenar Auto, Presione 1");
                    System.out.println("Desea frenar Moto, Presione 2");
                    int frenado = input.nextInt();

                    switch (frenado) {

                        case 1: {
                            System.out.println("Que Numero de auto desea Frenar, fueron creados de 0 a " + contC);
                            int num_auto = input.nextInt();
                            if (num_auto > 0 && num_auto < contC) {

                                System.out.println("Ingrese la velocidad que va a frenar");
                                int velo_fre = input.nextInt();

                                if (velo_fre > 0 && velo_fre < 120) {
                                    arreglo[num_auto].frenar(velo_fre);
                                } else {
                                    System.out.println("Velocidad fuera de lo permitido");
                                }
                            } else {
                                System.out.println("Ingrese un numero de auto existente");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Que Numero de Moto desea Frenar, fueron creados de 5 a " + contM);
                            int num_auto = input.nextInt();
                            if (num_auto > 5 && num_auto < contM) {

                                System.out.println("Ingrese la velocidad que va a frenar");
                                int velo_fre = input.nextInt();

                                if (velo_fre > 0 && velo_fre < 120) {
                                    arreglo[num_auto].frenar(velo_fre);
                                } else {
                                    System.out.println("Velocidad fuera de lo permitido");
                                }
                            } else {
                                System.out.println("Ingrese un numero de Moto existente");
                            }
                            break;
                        }
                    }
                }
                case 5: {

                    System.out.println("Desea Acelerar Auto, Presione 1");
                    System.out.println("Desea Acelerar Moto, Presione 2");
                    int acelerar = input.nextInt();

                    switch (acelerar) {

                        case 1: {
                            System.out.println("Que Numero de auto desea Acelerar, fueron creados de 0 a " + contC);
                            int num_auto = input.nextInt();
                            if (num_auto > 0 || num_auto < contC) {

                                System.out.println("Ingrese la velocidad que va a acelerar");
                                int velo_fre = input.nextInt();

                                if (velo_fre > 0 && velo_fre < 120) {
                                    arreglo[num_auto].acelerar(velo_fre);
                                } else {
                                    System.out.println("Velocidad fuera de lo permitido");
                                }
                            } else {
                                System.out.println("Ingrese un numero de auto existente");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Que Numero de Moto desea Acelerar, fueron creados de 5 a " + contM);
                            int num_auto = input.nextInt();
                            if (num_auto > 5 || num_auto < contM) {

                                System.out.println("Ingrese la velocidad que va a frenar");
                                int velo_fre = input.nextInt();

                                if (velo_fre > 0 && velo_fre < 120) {
                                    arreglo[num_auto].acelerar(velo_fre);
                                } else {
                                    System.out.println("Velocidad fuera de lo permitido");
                                }
                            } else {
                                System.out.println("Ingrese un numero de Moto existente");
                            }
                            break;
                        }
                    }
                }
                case 6:{
                    arreglo [0].getPlazaDis();
                    arreglo[5].getPlazaDis();
                }
            }

        } while (opcion != 0) ;
    }
}



