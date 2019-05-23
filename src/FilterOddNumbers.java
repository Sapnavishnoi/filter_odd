import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args){
        System.out.println(filterOdd(Arrays.asList(1,2,3,4,5,6,7)));
    }
    public static List<Integer> filterOdd(List<Integer> listOfNumbers){

            if(listOfNumbers.isEmpty()){
                return listOfNumbers;
            }
            else if(listOfNumbers.get(0)%2==1){
                return (filterOdd(listOfNumbers.subList(1,listOfNumbers.size()-1)));
            }
            else{
                return (filterOdd(listOfNumbers.subList(1,listOfNumbers.size()-1)));
            }
        }
        return (0);
    }
}
