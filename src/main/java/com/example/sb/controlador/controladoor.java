package com.example.sb.controlador;
import com.example.sb.Models.Trabajador;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controladoor {
    @GetMapping("/infoo2/{nombre}/{edad}/{estatura}/{peso}")
    public String info(Model model, @PathVariable String nombre,
                       @PathVariable int edad,
                       @PathVariable double estatura,
                       @PathVariable double peso) {


        Trabajador trabajador = new Trabajador(nombre, edad, estatura, peso);

        return "Nombre trabajador: "+trabajador.getNombre()+"\n"+
                "Edad:" +trabajador.getEdad()+"\n"+
                "Estatura: "+trabajador.getEstatura()+"\n"+
                "Peso: "+trabajador.getPeso();


    }
}