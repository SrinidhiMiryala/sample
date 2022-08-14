package Maps;

import java.util.LinkedHashMap;


public class LinkedHashmap {
	 public static void main(String[] args){
	        LinkedHashMap<Integer, Integer> ii = new LinkedHashMap<> ();
	        ii.put(7,3);
	        ii.put(1,9);
	        ii.put(4,7);
	        ii.put(4,0);
	        ii.put(5,8);
	        ii.put(0,4);
	        ii.put(2,1);
	        System.out.println(ii);
	        LinkedHashMap < String, Float> si = new LinkedHashMap<>();
	        si.put("vedh", 2.5f);
	        si.put("om", 7.0f);
	        si.put("prem",1.6f);
	        si.put("irm", 8.3f);
	        si.put("chand", 7.1f);
	        System.out.println(si);
	    }
	}



