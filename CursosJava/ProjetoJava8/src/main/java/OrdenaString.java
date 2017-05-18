import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by matheus on 15/05/17.
 */
public class OrdenaString {
    public static void main(String[] agrs) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        Function<String, Integer> funcao = String::length;
        Function<String, Integer> funcao2 = s -> s.length();

        Comparator<String> comparator = Comparator.comparing(funcao);
        palavras.add(String.valueOf(comparator));

        System.out.println(palavras);

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);

        palavras.forEach(System.out::println);
    }
}
