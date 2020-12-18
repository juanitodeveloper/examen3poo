package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Deportivo> arreglo1 = new ArrayList<>();
        ArrayList<Formal> arreglo2 = new ArrayList<>();
        ArrayList<Chancleta> arreglo3 = new ArrayList<>();

        int continuar = 1;
        do {
        System.out.println("Que tipo de zapato desea agregar");
        System.out.println("Ingrese '1' para Deportivo");
        System.out.println("Ingrese '2' para Formal");
        System.out.println("Ingrese '3' para Chancleta");
        Scanner sc = new Scanner(System.in);

        int vartipo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la marca de su zapato");
        String marca = sc.nextLine();


        System.out.println("Ingrese la talla de su zapato");
        Double talla = sc.nextDouble();

        sc.nextLine();
        System.out.println("Ingrese el color de su zapato");
        String color = sc.nextLine();


        System.out.println("Ingrese el material de su zapato");
        String material = sc.nextLine();

//Añadiendo según el tipo de zapato a su arreglo correspondiente
            if (vartipo==1){
                arreglo1.add(new Deportivo(marca,talla,color,material));

            } else{
                if(vartipo==2){
                    arreglo2.add(new Formal(marca,talla,color,material));
                }
                else {
                    arreglo3.add(new Chancleta(marca,talla,color,material));
                }
            }

         System.out.println("Desea continuar? ingrese 1 si desea continuar");
         System.out.println("Desea continuar? ingrese 0 si desea salir");
         continuar = sc.nextInt();


        } while (continuar==1);

//Mandamos a escribir hacia el archivo lo que fuimos guardando en los arreglos

        if (arreglo1.isEmpty()){
        } else {
            for (int i=0; i<arreglo1.size();i++){
                arreglo1.get(i).tofile();
            }

        }
        if (arreglo2.isEmpty()){
        } else {
            for (int i=0; i<arreglo2.size();i++){
                arreglo2.get(i).tofile();
            }

        }
        if (arreglo3.isEmpty()){
        } else {
            for (int i=0; i<arreglo3.size();i++){
                arreglo3.get(i).tofile();
            }

        }

    }
}
