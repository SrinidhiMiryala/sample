package nestedClass;
class Restaurant {
	
	void Order  () {
		System.out.println(" Check the Menu");
	}

	
static class Cuisine {
	
	void chinese () {                    
		System.out.println(" Apetisers or MainCourse");
	}
	
	static void Indian () {            
		System.out.println(" Chicken Dum Biryani ");
	}
}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		
		Restaurant nidhi = new Restaurant();
		nidhi.Order();
		
     	Restaurant.Cuisine MainCourse = new Restaurant.Cuisine();
		MainCourse.chinese();
		
		Restaurant.Cuisine.Indian();
	}

}