/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad__4.Punto_2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class Punto_2 {

    public static void main(String[] args) {
        // Crear objetos
        List<String> nombresList = new ArrayList<>();
        nombresList.add("Juan David");
        nombresList.add("Maria Causado");
        nombresList.add("Pedro Alves");
        nombresList.add("Ana Sofia");
        nombresList.add("Luis Palacio");

        Set<String> nombresSet = new HashSet<>();
        nombresSet.add("Juan David");
        nombresSet.add("Maria Causado");
        nombresSet.add("Pedro Alves");
        nombresSet.add("Ana Sofia");
        nombresSet.add("Luis Palacio");

        Map<Integer, String> nombresMap = new HashMap<>();
        nombresMap.put(1, "Juan David");
        nombresMap.put(2, "Maria Causado");
        nombresMap.put(3, "Pedro Alves");
        nombresMap.put(4, "Ana Sofia");
        nombresMap.put(5, "Luis Palacio");

        Stack<String> nombresStack = new Stack<>();
        nombresStack.push("Juan David");
        nombresStack.push("Maria Causado");
        nombresStack.push("Pedro Alves");
        nombresStack.push("Ana Sofia");
        nombresStack.push("Luis Palacio");

        Queue<String> nombresQueue = new LinkedList<>();
        nombresQueue.add("Juan David");
        nombresQueue.add("Maria Causado");
        nombresQueue.add("Pedro Alves");
        nombresQueue.add("Ana Sofia");
        nombresQueue.add("Luis Palacio");

        // Agregar objetos
        nombresList.add("Carlos Garcia");
        nombresSet.add("Carlos Garcia");
        nombresMap.put(6, "Carlos Garcia");
        nombresStack.push("Carlos Garcia");
        nombresQueue.add("Carlos Garcia");

        // Buscar objetos
        System.out.println("Buscando objeto 'Pedro' en List: " + nombresList.contains("Pedro Alves"));
        System.out.println("Buscando objeto 'Pedro' en Set: " + nombresSet.contains("Pedro Alves"));
        System.out.println("Buscando objeto con clave 3 en Map: " + nombresMap.containsValue("Pedro Alves"));
        System.out.println("Buscando objeto en Stack: " + (nombresStack.search("Pedro Alves") >= 0));
        System.out.println("Buscando objeto en Queue: " + nombresQueue.contains("Pedro Alves"));

        // Insertar objetos
        nombresList.add(2, "Karen Diaz");
        nombresSet.add("Karen Diaz");
        nombresMap.put(7, "Karen Diaz");
        nombresStack.insertElementAt("Karen Diaz", 2);
        nombresQueue.offer("Karen Diaz");

        // Eliminar objetos
        nombresList.remove("Ana Sofia");
        nombresSet.remove("Ana Sofia");
        nombresMap.values().remove("Ana Sofia");
        nombresStack.remove("Ana Sofia");
        nombresQueue.remove("Ana Sofia");

        // Verificar si un objeto existe
        System.out.println("Existe el objeto 'Ana Sofia' en List? " + nombresList.contains("Ana Sofia"));
        System.out.println("Existe el objeto 'Ana Sofia' en Set? " + nombresSet.contains("Ana Sofia"));
        System.out.println("Existe el objeto 'Ana Sofia' en Map? " + nombresMap.containsValue("Ana Sofia"));
        System.out.println("Existe el objeto 'Ana Sofia' en Stack? " + (nombresStack.search("Ana Sofia") >= 0));
        System.out.println("Existe el objeto 'Ana Sofia' en Queue? " + nombresQueue.contains("Ana Sofia"));

        // Recorrer List con for tradicional
        System.out.println("Recorriendo List con for tradicional:");
        for (int i = 0; i < nombresList.size(); i++) {
            System.out.println(nombresList.get(i));
        }

        // Recorrer List con foreach
        System.out.println("Recorriendo List con foreach:");
        for (String nombre : nombresList) {
            System.out.println(nombre);
        }

        // Recorrer List con while
        System.out.println("Recorriendo List con while:");
        Iterator<String> iterator = nombresList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Recorrer List con do/while
        System.out.println("Recorriendo List con do/while:");
        int index = 0;
        do {
            System.out.println(nombresList.get(index));
            index++;
        } while (index < nombresList.size());

        // Ordenar objetos en una lista
        Collections.sort(nombresList);
        System.out.println("Lista de nombres ordenada: " + nombresList);

        // Recorrer Set con for tradicional
        System.out.println("Recorriendo Set con for tradicional:");
        Object[] setArray = nombresSet.toArray();
        for (int i = 0; i < setArray.length; i++) {
            System.out.println(setArray[i]);
        }

        // Recorrer Set con foreach
        System.out.println("Recorriendo Set con foreach:");
        for (String nombre : nombresSet) {
            System.out.println(nombre);
        }

        // Recorrer Set con while
        System.out.println("Recorriendo Set con while:");
        Iterator<String> setIterator = nombresSet.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        // Recorrer Set con do/while
        System.out.println("Recorriendo Set con do/while:");
        int setIndex = 0;
        do {
            setArray = nombresSet.toArray();
            System.out.println(setArray[setIndex]);
            setIndex++;
        } while (setIndex < nombresSet.size());

        // Recorrer Map con for tradicional
        System.out.println("Recorriendo Map con for tradicional:");
        for (Integer key : nombresMap.keySet()) {
            System.out.println(key + " - " + nombresMap.get(key));
        }

        // Recorrer Map con foreach
        System.out.println("Recorriendo Map con foreach:");
        for (Map.Entry<Integer, String> entry : nombresMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Recorrer Map con while
        System.out.println("Recorriendo Map con while:");
        Iterator<Map.Entry<Integer, String>> mapIterator = nombresMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Recorrer Map con do/while
        System.out.println("Recorriendo Map con do/while:");
        int mapIndex = 0;
        do {
            mapIterator = nombresMap.entrySet().iterator();
            while (mapIterator.hasNext()) {
                Map.Entry<Integer, String> entry = mapIterator.next();
                if (entry.getKey() == mapIndex) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
            }
            mapIndex++;
        } while (mapIndex <= nombresMap.size());

        // Recorrer List con Stream
        System.out.println("Recorriendo List con Stream:");
        nombresList.stream().forEach(System.out::println);

        // Recorrer Set con Stream
        System.out.println("Recorriendo Set con Stream:");
        nombresSet.stream().forEach(System.out::println);

        // Recorrer Map con Stream
        System.out.println("Recorriendo Map con Stream:");
        nombresMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        // Recorrer List con función flecha o función lambda
        System.out.println("Recorriendo List con funcion flecha o funcion lambda:");
        nombresList.forEach(nombre -> System.out.println(nombre));

        // Recorrer Set con función flecha o función lambda
        System.out.println("Recorriendo Set con funcion flecha o funcion lambda:");
        nombresSet.forEach(nombre -> System.out.println(nombre));

        // Recorrer Map con función flecha o función lambda
        System.out.println("Recorriendo Map con funcion flecha o funcion lambda:");
        nombresMap.forEach((key, value) -> System.out.println(key + " - " + value));

        // Convertir un array en un objeto List
        String[] nombresArray = {"David Alaba", "Sara Calderon", "Carlos Perez"};
        List<String> nombresListFromArray = Arrays.asList(nombresArray);
        System.out.println("Lista de nombres a partir de un array: " + nombresListFromArray);

        // Convertir un objeto List a un array
        String[] nombresArrayFromList = nombresList.toArray(new String[nombresList.size()]);
        System.out.println("Array de nombres a partir de una lista: " + Arrays.toString(nombresArrayFromList));

        // Dos formas de unir dos listas en una sola
        List<String> lista1 = new ArrayList<>(nombresList);
        List<String> lista2 = new ArrayList<>(nombresListFromArray);

        // Forma 1: addAll()
        lista1.addAll(lista2);
        System.out.println("Lista unida con addAll(): " + lista1);

        // Forma 2: Stream.concat()
        List<String> listaUnida = Stream.concat(lista1.stream(), lista2.stream()).collect(Collectors.toList());
        System.out.println("Lista unida con Stream.concat(): " + listaUnida);

        // Desordenar una Lista
        Collections.shuffle(nombresList);
        System.out.println("Lista de nombres desordenada: " + nombresList);
    }
}
