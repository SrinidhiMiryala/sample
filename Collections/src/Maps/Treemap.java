package Maps;

import java.util.TreeMap;

public class Treemap {
	    public static void main(String[] args){
	        TreeMap<Integer, Integer> ii = new TreeMap<> ();
	        ii.put(7,3);
	        ii.put(1,9);
	        ii.put(4,7);
	        ii.put(4,0);
	        ii.put(5,8);
	        ii.put(0,4);
	        ii.put(2,1);
	        System.out.println(ii);
	        TreeMap < String, Integer> si = new TreeMap<>();
	        si.put("vedh", 2);
	        si.put("om", 7);
	        si.put("prem",1);
	        si.put("irm", 8);
	        si.put("chand", 7);
	        System.out.println(si);
	    }
	}


