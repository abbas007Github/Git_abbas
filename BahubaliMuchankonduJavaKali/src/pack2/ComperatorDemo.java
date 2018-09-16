 package pack2;

import java.util.Arrays;

class WaterBottle
 {
	 int ht;
	 int vol;
	 WaterBottle(int ht, int vol)
	 {
		 this.ht=ht;
		 this.vol=vol;		 
	 }
	 
	 public String toString()
	 {
		 return "ht="+ht+" "+"vol="+vol+ " ml\n";
	 }
 }
 
public class ComperatorDemo {

	public static void main(String[] args) {
		
		WaterBottle wb[] = { new WaterBottle(10, 100), new WaterBottle(11,110), new WaterBottle(12, 120)};
		System.out.println(Arrays.toString(wb));
	}

}
