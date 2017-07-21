public class Pair{

    private int mMin;
    private int mMax;

    public Pair(int a, int b){
        mMin = a;
        mMax = b;
    }
 @Override
    public boolean equals(Object other){
        Pair object = (Pair) other;
        return (this.mMin == object.mMin && this.mMax == object.mMax);
    }
}
