import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

    public static void main(String args[])
    {
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<String> names = Arrays.asList("Reflection","Collection","Stream");

        System.out.println("Numbers:" + number);
        System.out.println("Names: " + names);
        System.out.println();

        //Intermediate Operations:

        //map: The map method is used to map the items in the collection to other
        // objects according to the Predicate passed as argument.
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("Map Square: " + square);

        //filter: The filter method is used to select elements as per the Predicate
        // passed as argument.
        List<String> filteredResult = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println("Filtered Result: " + filteredResult);

        //sorted: The sorted method is used to sort the stream.
        List<String> sortedResult = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Result: " + sortedResult);

        //Terminal Operations:

        //collect: The collect method is used to return the result of the intermediate
        // operations performed on the stream.
        Set<Integer> square2 = number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println("Collect Square: " + square2);

        //forEach: The forEach method is used to iterate through every element of the stream.
        System.out.println("ForEach:");
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        //reduce: The reduce method is used to reduce the elements of a stream to a single value.
        //The reduce method takes a BinaryOperator as a parameter.
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println("Reduce: " + even);
    }
}
