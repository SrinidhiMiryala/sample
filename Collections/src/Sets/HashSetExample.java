package Sets;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<Float> hs = new HashSet<Float>();
        hs.add(3.5f);
        hs.add(5.2f);
        hs.add(1.8f);
        hs.add(9.3f);
        System.out.println("size of hs: "+ hs.size());
        System.out.println("whether object hs is empty: "+hs.isEmpty());
        System.out.println("adding to hs: "+hs.add(12.5f));
        System.out.println("clone object hs: "+hs.clone());
        System.out.println("remove from hs: "+hs.remove(5.2f));
        System.out.println("clone object hs: "+hs.clone());
    }
}