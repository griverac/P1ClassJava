/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classjava.ClassP1;

/**
 *
 * @author Rivgl
 */
public class ClassP1 {
    public static void main (string [] args ){
    
    }
    
        public class vehiculo {
            //atributos
            protected string serie ;
            protected string cilindro;

            
            public vehiculo(){}
            public void trasportar(){}
            public void frenar(){}
            public void avanzar(){}
        }
        
            public class vaereos extends vehiculo {
                protected string combustible;
                protected componente color ;
                protected int capacidad;
                
                public vaereos(){}
                public void trasporta(){}
                public void despega(){}
            }
            
                 public class avion extends vaereo{
                    public avion(String nserie, String ncilindro, string ncolor){
                        serie=nserie;
                        cilindro=ncilindro;
                        color = ncolor;
                    }
                    public avion(int n capacidad){
                        capacidad = ncapacidad;
                    }
                }
                 
                  public class helicoptero extends vaereo{
                    public helicoptero(String nserie, String ncilindro, string ncolor){
                        serie=nserie;
                        cilindro=ncilindro;
                        color = ncolor;
                    }
                    public helicoptero(int n capacidad){
                        capacidad = ncapacidad;
                    }
                }
            
             public class vterrestre extends vehiculo {
                protected string tamaño;
                protected int depre;
                    
                public vterrestre(){}
                public void viaja(){}
                public void acelera(){}
                    }
            
                    public class moto extends vterrestre{
                        public moto(String nserie, String ncilindro, string tamaño){
                            serie=nserie;
                            cilindro=ncilindro;
                        }
                        public moto(int mdepre){
                            depre = mdepre;
                        }
                    }
                
                    public class auto extends vterrestre{
                        public auto(String nserie, String ncilindro, string tamaño){
                            serie=nserie;
                            cilindro=ncilindro;
                        }
                        public auto(int mdepre){
                            depre = mdepre;
                        }
                    }
                
}