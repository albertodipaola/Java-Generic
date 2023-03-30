public class App {
    public static void main(String[] args) throws Exception {
        Pair<String> pair = new Pair<String>("ciao", "mondo");
        System.out.println(pair.getVar1()+" : "+pair.getVar2());
        Pair<Integer> pair2 = new Pair<Integer>(1, 6);
        System.out.println(pair2.getVar1()+" : "+pair2.getVar2());

        PairMultiple<String, Integer> pairm = new PairMultiple<String,Integer>("ciao", 2);
        System.out.println(pairm.getVar1()+" : "+pairm.getVar2());
        System.out.println(pairm.<Double>returnAnT2(12.34));
    }
}
