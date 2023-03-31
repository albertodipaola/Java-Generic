import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(24, 34, 13, 5, 6);
        ArrayFilter<Integer> aFilter = new ArrayFilter<>(list);

        System.out.println(aFilter.pari());
        System.out.println(aFilter.dispari());
        System.out.println(aFilter.primi());

        /* *********************************** */
        
        List<Integer> list2 = List.of(24, 34, 13, 5, 6, 12, 3, 4, 21);
        MinMax<Integer> minMax = new MinMax<>(list2, 2, 6);
        for (Integer integer : minMax.getList()) {
            System.out.print(" "+integer+" ");
        }
    }
}
