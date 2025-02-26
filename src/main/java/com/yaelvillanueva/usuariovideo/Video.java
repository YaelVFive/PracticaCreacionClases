package com.yaelvillanueva.usuariovideo;

/**
 *
 * @author YAEL
 */
public class Video {
    
    private String titulo;
    private int duracion; //duración en segundos
    
    public Video(String titulo,int duracion){
        this.titulo=titulo;
        this.duracion=duracion;
    }
    
    public void reproducir(){
        System.out.println("Reproduciendo el video " +titulo);
    }
    
    public void detener(){
        System.out.println("Se ha detenido el video");
    }
    
    public String getTitulo(){
        return titulo;
    }
}
