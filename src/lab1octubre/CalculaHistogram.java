package lab1octubre;

public class CalculaHistogram {
    public static <T> Histogram <T> computeHisto(T[] vector){
    
    Histogram <T> histo = new Histogram<>();
    
    for (T t :vector){
        histo.incrementa(t);
    }
    
    
    
    return histo;
    
    }
}
