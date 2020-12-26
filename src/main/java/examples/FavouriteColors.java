package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FavouriteColors {
    public static void main(String[] args) {
        List<String> steam = Arrays.asList("stephen,blue",
                "alic,red",
                "hari,black");
     List<String[]> strnew=   steam.stream().map(x->x.split(","))
                .collect(Collectors.toList());

     System.out.println(strnew.get(0)[0]);

//
//        for (String[] word : strnew[0])
//         {
//            for (String w : word) {
//                //   uniqueWords.forEach(x -> System.out.println(x[0]));
//                System.out.println(w);
//            }
//        }
    }
}
