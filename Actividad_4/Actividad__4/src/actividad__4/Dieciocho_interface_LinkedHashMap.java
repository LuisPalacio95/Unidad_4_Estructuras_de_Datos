/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad__4;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class Dieciocho_interface_LinkedHashMap {

    public static void main(String[] args) {
        // Crear un objeto LinkedHashMap
        Map<String, Integer> edades = new LinkedHashMap<>();

        // Agregar pares clave-valor al LinkedHashMap
        edades.put("Juan David", 25);
        edades.put("Saulo David", 30);
        edades.put("Luis Palacio", 28);
        edades.put("Ana", 35);

        // Obtener la edad de "Juan David" utilizando el método get()
        int edadJuanDavid = edades.get("Juan David");
        System.out.println("La edad de Juan David es: " + edadJuanDavid + " anos.");

        // Verificar si el LinkedHashMap contiene una clave específica utilizando containsKey()
        String clave = "Saulo David";
        if (edades.containsKey(clave)) {
            System.out.println("El LinkedHashMap contiene la clave: " + clave);
        } else {
            System.out.println("El LinkedHashMap no contiene la clave: " + clave);
        }

        // Eliminar un elemento del LinkedHashMap utilizando remove()
        edades.remove("Luis Palacio");

        // Imprimir las claves, valores y pares clave-valor del LinkedHashMap
        System.out.println("Claves en el LinkedHashMap: " + edades.keySet());
        System.out.println("Valores en el LinkedHashMap: " + edades.values());
        System.out.println("Pares clave-valor en el LinkedHashMap: " + edades.entrySet());
    }
}
