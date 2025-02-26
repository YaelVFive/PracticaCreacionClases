package com.yaelvillanueva.usuariovideo;

/**
 *
 * @author YAEL
 */
public class UsuarioVideo {

    public static void main(String[] args) {
        
        // Clase principal
        Usuario usuario = new Usuario("MACACO", "macaco123@gmail.com");
        Video video = new Video("Monky flip", 3600);
        
        usuario.verVideo(video);
        video.detener();
        usuario.hacerComentario();
    }
}



