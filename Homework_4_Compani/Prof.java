package Homework_4_Compani;

public enum Prof {
    WORKER(5), DIRECTOR(5);

    private final int coef;

    Prof(int cof) {
        this.coef = cof;
    }

    public int getCoef() {
        return coef;
    }
}
