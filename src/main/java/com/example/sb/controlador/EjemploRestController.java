package com.example.sb.controlador;
import com.example.sb.Models.Empleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")//--> ingresar datos responde a metodos put y delete
//cambia la ruta, lo vuelve primer nivel, agrega un APi antes de el enlace que teniamos

public class EjemploRestController {
//Con el RestController convertimos este controlador en un API rest

    @GetMapping("/info2") //---> es importante cambiar el nombre de la vista para evitar conflictos//ambiamos por el de abajo
    //@RequestMapping(path = "/info2",method = RequestMethod.GET)//hay que notar esta estructura ya que
//es la que da acceso o nmos permite usar sentencias de consultas
//nota como llamamos a nuestro metodo info2() y usamos get para obtener los datos

    public Map<String,Object> info2(){
        //eliminamos los parametros dentro de los parentesis
        //y solo instanciamos a la clase de nuestro controlador (controller)

        Empleados empleado1 = new Empleados("Chay","Reyes","Real Toscana",
                                           "Cocinero", 23,555555,001);//instanciamos a nuestro model y pasamos datos
//esta en el package modelo
        Empleados empleado2 = new Empleados("Juan","Martinez","Tecamac","Mesero",17,55662234,2);
        Map<String,Object> res = new HashMap<>();
        res.put("Empleado: "+empleado1.getId(), empleado1); //hay que notar como permite utilizar sus metodos para poder trabajarse con la logica despues
        res.put("Empleado: "+empleado2.getId(), empleado2);
        return res ;

    }
}
