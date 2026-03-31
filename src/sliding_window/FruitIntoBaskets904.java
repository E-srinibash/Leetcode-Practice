import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets904 {
    public static int totalFruit(int[] fruits) {
    	 Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
         int i = 0;
         int n = fruits.length;
         int total = 0;
         for(int j=0;j<n;j++){
         	int fruit = fruits[j];
             mp.put(fruit,mp.getOrDefault(fruit,0)+1);

             if(mp.size()<=2){
                 total = Math.max(total,j-i+1);
             }

             if(mp.size() > 2){
                 while(mp.size()>2){
                     int fruitAtI = fruits[i];
                      mp.put(fruitAtI,mp.get(fruitAtI)-1);
                      if(mp.get(fruitAtI) == 0){
                         mp.remove(fruitAtI);
                      }
                      i++;
                 }
             }
         }
         return total;
     }

    
    public static void main(String[] args) {
		int[] fruits = {0};
		System.out.println(totalFruit(fruits));
	}
}