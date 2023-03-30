public class App {
    public static void main(String[] args) throws Exception {
        String[] nomi = new String[]{"franco", "zeus", "angelo", "giulio"};
        System.out.println(AlgoritmiPerArray.min(nomi));
        
        Integer[] numbers = new Integer[]{34, 43, 41, 12, 564};
        System.out.println(AlgoritmiPerArray.min(numbers));

        System.out.println(AlgoritmiPerArray.max(nomi));
        System.out.println(AlgoritmiPerArray.max(numbers));

    }
}
