package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        linkedHashMap();
        treeMap();

    }
    public void hashMap(){
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Pera", 11);
        mapa.put("Manzana", 10);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);
        System.out.println("-----HashMap------");
        System.out.println(mapa);

        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("kiwi"));

        //Obtener valor
        System.out.println("Valor de pera:  " + mapa.get("Pera"));

        //Eliminar item
        mapa.remove("Pera");
        System.out.println(mapa);
    }
    public void linkedHashMap(){
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Pera", 11);
        mapa.put("Manzana", 10);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);
        System.out.println("-----LinkedHashMap------");
        System.out.println(mapa);

        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("kiwi"));

        //Obtener valor
        System.out.println("Valor de pera:  " + mapa.get("Pera"));

        //Eliminar item
        mapa.remove("Pera");
        System.out.println(mapa);




    }


    public void treeMap(){
        TreeMap<String, Integer> mapa = new TreeMap<>();
        mapa.put("Pera", 11);
        mapa.put("Manzana", 10);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);
        System.out.println("-----TreeMap------");
        System.out.println(mapa);

        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("kiwi"));

        //Obtener valor
        System.out.println("Valor de pera:  " + mapa.get("Pera"));

        //Eliminar item
        mapa.remove("Pera");
        System.out.println(mapa);


    }
}
