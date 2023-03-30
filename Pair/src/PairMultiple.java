public class PairMultiple<T1, T2> {
    private T1 var1;
    private T2 var2;
    
    public PairMultiple(T1 var1, T2 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T1 getVar1() {
        return var1;
    }

    public void setVar1(T1 var1) {
        this.var1 = var1;
    }

    public T2 getVar2() {
        return var2;
    }

    public void setVar2(T2 var2) {
        this.var2 = var2;
    }

    public<T3> T2 returnAnT2(T3 var3) {
        return var2;
    }
}
