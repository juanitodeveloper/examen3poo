package com.company;

import java.io.*;




public abstract class Zapato {
    private String tipo;
    private String marca;
    private double talla;
    private String color;
    private String material;
//Getters
    public String getTipo() {
    return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public double getTalla() {
        return talla;
    }
    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
//Setters
    public void setTipo(String tipo) {
    this.tipo = tipo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }


    public void tofile(){
        //anadir un numero aleatorio para evitar archivos con nombre duplicado
        int numeroAleatorio = (int) (Math.random()*1000+1);
        String letras= String.valueOf(numeroAleatorio);

        String ruta="C:/Users/Suazo/Desktop/3p/"+tipo+letras+".txt";
        File archivo= new File(ruta);
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Escribiendo accede=new Escribiendo();
        accede.escribir(ruta);
    }
    class Escribiendo{
        public void escribir(String ruta_archivo){


            try{
                FileWriter escritura = new FileWriter(ruta_archivo);
                for (int i=0; i<marca.length();i++){
                    escritura.write(marca.charAt(i));
                }
                escritura.write(" ");
                for (int i=0; i<String.valueOf(talla).length();i++){
                    escritura.write(String.valueOf(talla).charAt(i));
                }
                escritura.write(" ");
                for (int i=0; i<color.length();i++){
                    escritura.write(color.charAt(i));
                }
                escritura.write(" ");
                for (int i=0; i<material.length();i++){
                    escritura.write(material.charAt(i));
                }
                escritura.write(" ");
                escritura.write("\n");
                escritura.write(calzar());

                escritura.close();
            }catch (IOException e){
            }
        }
    }

    public String calzar(){
       return "Que bien me quedan estos zapatos de tipo "+ tipo + " que son Talla " + talla;
    }

}
