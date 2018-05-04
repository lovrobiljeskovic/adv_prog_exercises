import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class DecoratorPattern implements Comparator<Integer>{
    int sum = 0;
    
    @Override
    public int compare(Integer o1, Integer o2) {
        sum++;
        return o1.compareTo(o2);
    }
    public int sum (){
        return this.sum;
    }
    
   public static void main(String[] args) {
        List<Integer> tempList = new ArrayList<Integer>();
        for (int i = 0; i <1000000; i++) {
           tempList.add(i, (int)(Math.random() * (99 - 1) + 1) + 1);
           
       }
        DecoratorPattern decor = new DecoratorPattern();
        Collections.sort(tempList, decor);
        System.out.println(decor.sum());
        
    } 

    
}