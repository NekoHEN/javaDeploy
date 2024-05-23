package scd.despliegue.prueba;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import scd.despliegue.prueba.models.usuariomodelo;


@SpringBootApplication
@RestController
public class PruebaApplication {

        @GetMapping("/mensaje")
        public String mensaje(){
            return "Prueba de despliegue Azure";
        }

        @GetMapping("/catalogo")
        public ArrayList<usuariomodelo> getCatalogo() {
            ArrayList<usuariomodelo> usuarios = new ArrayList<>();
            usuariomodelo nuevoUsuario = new usuariomodelo("Jose", 23);
            usuarios.add(nuevoUsuario);
            usuariomodelo nuevoUsuario2 = new usuariomodelo("Maria", 20);
            usuarios.add(nuevoUsuario2);
            usuariomodelo nuevoUsuario3 = new usuariomodelo("Bairon", 29);
            usuarios.add(nuevoUsuario3);
            usuariomodelo nuevoUsuario4 = new usuariomodelo("Carlos", 22);
            usuarios.add(nuevoUsuario4);
            usuariomodelo nuevoUsuario5 = new usuariomodelo("Cony", 22);
            usuarios.add(nuevoUsuario5);
            usuariomodelo nuevoUsuario6 = new usuariomodelo("Adonis", 77);
            usuarios.add(nuevoUsuario6);
            usuariomodelo nuevoUsuario7 = new usuariomodelo("Juan", 18);
            usuarios.add(nuevoUsuario7);
            usuariomodelo nuevoUsuario8 = new usuariomodelo("Ruben", 24);
            usuarios.add(nuevoUsuario8);
            usuariomodelo nuevoUsuario9 = new usuariomodelo("Franco", 23);
            usuarios.add(nuevoUsuario9);
            usuariomodelo nuevoUsuario10 = new usuariomodelo("Hector", 25);
            usuarios.add(nuevoUsuario10);
            usuariomodelo nuevoUsuario11 = new usuariomodelo("Alex", 23);
            usuarios.add(nuevoUsuario11);
            usuariomodelo nuevoUsuario12 = new usuariomodelo("Paulo", 30);
            usuarios.add(nuevoUsuario12);
            usuariomodelo nuevoUsuario13 = new usuariomodelo("Nicolás", 23);
            usuarios.add(nuevoUsuario13);
            usuariomodelo nuevoUsuario14 = new usuariomodelo("Giovanni", 40);
            usuarios.add(nuevoUsuario14);
            usuariomodelo nuevoUsuario15 = new usuariomodelo("Fercho", 19);
            usuarios.add(nuevoUsuario15);
            return usuarios;
        }
        

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}
