package com.yaelvillanueva.usuariovideo;

/**
 *
 * @author YAEL
 */  import java.util.Scanner;

public class Usuario {

    String nombre;
    String correo; 
    
    public Usuario(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public void verVideo(Video video) {
        System.out.println(nombre + " está viendo el video: " + video.getTitulo());
        video.reproducir();
    }

    public String obtenerNombre() {
        return nombre;
    }

    // Método para hacer un comentario usando Scanner
    public void hacerComentario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu comentario: ");
        String textoComentario = scanner.nextLine();
        Comentario comentario = new Comentario(textoComentario);
        System.out.println(nombre + " ha comentado: " + comentario.getComentario());
    }
}




