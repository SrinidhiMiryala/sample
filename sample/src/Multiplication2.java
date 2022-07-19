class Multi {
         void mul(int x,float y) {
        	 System.out.println("The mul of integer= "+(x*y));
         }
         void mul(float x, int y) {
        	 System.out.println("the mul of float= "+(x*y));
         }
}
public class Multiplication2{
	public static void main(String args[]) {
	Multi nidhi = new Multi();
	nidhi.mul(1, 5f);
	nidhi.mul(15,2f);
	nidhi.mul(8f,2);
	nidhi.mul(5.5f,6);
}
}