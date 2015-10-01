
package lab1octubre;

import java.util.HashMap;

public class conEL {

    public static void main(String[] args) {
        int [] vector = {1,1,1,3,4,5,6,9,100};

        Histogram histo = new Histogram(vector);
        
        HashMap <Integer,Integer> histogram = histo.getHisto();
        
        for(int key : histogram.keySet()){
        
            System.out.println(key + " : "+ histogram.get(key));
        }
        
    }
}
