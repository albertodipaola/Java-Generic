import java.util.List;

//Scrivere una classe generica che prenda in input un array e altri due parametri interi che fungeranno da indice superiore e indice inferiore e ritorni un sottoarray nel range indice inferiore indice superiore

public class MinMax<T> {
    private List<T> list;
    
    public MinMax(List<T> list, int min, int max) {
        this.list = list.subList(min, max);
    }

    public List<T> getList() {
        return list;
    }
}
