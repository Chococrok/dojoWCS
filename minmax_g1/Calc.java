public class Calc {

    

    public static Pair minmax (int[] anArray){
        int mMin;
        int mMax;
        int[] mTab;

        if (anArray.length != 0){
            mTab = anArray;
            mMin = mTab[0];
            mMax = mTab[0];
            for (int i : mTab){
                if (i >= mMax){
                    mMax = i;
                }
                else if (i <= mMin){
                    mMin = i;
                }
            }
        }
        else{
            mMin = 0;
            mMax =0;
        }
        return new Pair(mMin,mMax);
    }
}
