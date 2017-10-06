package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"hola","buenas tardes","¿Qué frase?"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
                
        for(String key : histogr.keySet()){
            System.out.println("'" + key + "'" + " aparece " 
                             + histogr.get(key) + " vez/veces.");
        }
             
    }
}
