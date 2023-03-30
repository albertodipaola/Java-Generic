public class GenericClass2 {

    public<T> void print(T data) {
        System.out.println(data);
    }

    public<T> T returnType(T data) {
        return data;
    }
}
