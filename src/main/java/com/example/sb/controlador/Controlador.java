package com.example.sb.controlador;
import com.example.sb.Models.Alumno;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controlador subido por chay
@RestController
public class Controlador {
    @GetMapping("/infoo/{nombre}/{edad}/{estatura}/{peso}")
    public String info(Model model, @PathVariable String nombre,
                                    @PathVariable int edad,
                                    @PathVariable double estatura,
                                    @PathVariable double peso) {

        Alumno alumno = new Alumno(nombre, edad, estatura, peso);

        return "Nombre alumno: "+alumno.getNombre()+"\n"+
                "Edad:" +alumno.getEdad()+"\n"+
                "Estatura: "+alumno.getEstatura()+"\n"+
                "Peso: "+alumno.getPeso();


    }
}

//Persona persona = new Persona("Kevin", 22, 1.67, 85);
//        Trabajador trabajador = new Trabajador("Juan", 23, 1.90, 73);
//        Alumno alumno = new Alumno("Ana", 20, 1.65, 55);
//
//        model.addAttribute("Persona", persona);
//        model.addAttribute("trabajador", trabajador);
//        model.addAttribute("alumno", alumno);