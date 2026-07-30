package com.example.sb.controlador;
import com.example.sb.Models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class EjemploController {
    //controlador, es una clase que maneja klas solicitudes http y define como procesar (es backend)
    //devuelve una respuesta de .json .xml o .html
    //No es mas que una clase de java que asigna como procesar datos


    @GetMapping("/info")
//info es el archvio info.html en templates
    public String info(Model model  ) { //No es forzoso que sea tipo model, puede ser cualquier otro tipo de dato
        //estos de abajo, son ejemplo de atributos y valores pasados a la vista

        Empleados empleado1 = new Empleados("Chay","Reyes","Real Toscana",
                "Cocinero", 23,555555,001);//instanciamos a nuestro model y pasamos datos
        Empleados empleado2 = new Empleados("Juan","Martinez","Tecamac","Mesero",17,55662234,2);

        model.addAttribute("Empleado", empleado1);
        model.addAttribute("Empleados", empleado2);

        return "info";
        //Estamos trabajando con vistas en este caso
        //Podemos usar POST, GET, PUT
    }
}
