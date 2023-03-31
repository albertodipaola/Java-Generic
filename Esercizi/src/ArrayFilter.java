import java.util.ArrayList;
import java.util.List;

//scrivere una classe generica che prenda in input un array e implementi dei metodi che ritornino degli elementi filtrati in base a delle caratteristiche ( numeri pari, numeri dispari, numeri primi )

public class ArrayFilter<T> {
    private List<T> arr;

    public ArrayFilter(List<T> arr) {
        this.arr = arr;
    }

    public List<T> getArr() {
        return arr;
    }

    public void setArr(List<T> arr) {
        this.arr = arr;
    }

    public List<T> pari() {
        List<T> newArr = new ArrayList<>();
        for (T el : this.arr) {
            if ((int)el % 2==0) {
                newArr.add(el);
            }
        }
        return newArr;
    }    

    public List<T> dispari() {
        List<T> newArr = new ArrayList<>();
        for (T el : this.arr) {
            if ((int)el % 2!=0) {
                newArr.add(el);
            }
        }
        return newArr;
    }    

    public List<T> primi() {
        List<T> newArr = new ArrayList<>();
        for (T el : this.arr) {
            if (isPrime((int)el)) {
                newArr.add(el);
            }
        }
        return newArr;
    }    

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }


}
