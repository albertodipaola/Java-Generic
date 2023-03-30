public class App {
    public static void main(String[] args) throws Exception {
        GenericClass<String> gen = new GenericClass<String>("ciao");
        System.out.println(gen.getData());
        GenericClass<Integer> intgen = new GenericClass<Integer>(4);
        System.out.println(intgen.getData());

        GenericClass2 gen2 = new GenericClass2();
        gen2.<String>print("bello");
        gen2.<Integer>print(40);
        System.out.println(gen2.<String>returnType("belin"));
        System.out.println(gen2.returnType(20));
    }
}
