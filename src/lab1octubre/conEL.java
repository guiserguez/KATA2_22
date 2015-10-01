
package lab1octubre;

import java.util.HashMap;

public class conEL {

    public static void main(String[] args) {
        Integer [] vector = {1,1,1,3,4,5,6,9,100};
        
        
        String[] nombre = {"Pepe", "Juan", "Juantxopino", "Salva","Goretti", "Juantxopino","Goretti", "Goretti"};

        Histogram histo = new Histogram(vector);
        
        HashMap <Object,Integer> histogram = histo.getHisto();
        
        for(Object key : histogram.keySet()){
        
            System.out.println(key + " : "+ histogram.get(key));
        }
        
    }
}
