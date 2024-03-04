package be.kuleuven;

public class Calculator {
    int getal1;
    int getal2;

    public Calculator(int getal1, int getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }
    public int optellen(){
        return getal1 + getal2;
    }
    public int aftrekken(){
        return getal1 - getal2;
    }
    public int vermeenigvuldig(){
        return getal1 * getal2;
    }
    public int delen(){
        return getal1 / getal2;
    }
}
