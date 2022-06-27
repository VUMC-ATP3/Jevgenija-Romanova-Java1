package homework.classHomework;

public class Trissturis {
    int malaA;
    int malaB;
    int malaC;
    double s;
    double laukums;

    public Trissturis(){
        System.out.println("Taisam trijstūri");
    }


    public Trissturis(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
}

        public double aprekinatLaukumu () {
            s = (malaA + malaB + malaC) / 2;
            laukums = Math.sqrt(s * (s - malaA) * (s - malaB) * (s - malaC));
            return laukums;
        }

        public boolean vienadMala () {
            if ((malaA == malaB) && (malaA == malaC))
                return true;
        else return false;
                }

        public boolean vienadSanu () {
            if ((malaA == malaB) || (malaA == malaC) || (malaB == malaC))
                return true;
        else return false;
        }
    }
