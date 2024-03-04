package be.kuleuven;

import org.junit.jupiter.api.Test;

public class calculatorTest {
    @Test
    void getal2en3_calculatorOptellen_resultaat5(){
        Calculator cl = new Calculator(2,3);
        int resultaat = cl.optellen();
        assert(resultaat == 5);
    }
    @Test
    void getal5en3_calculatorAftrekken_resultaat2(){
        Calculator cl = new Calculator(5,3);
        int resultaat = cl.aftrekken();
        assert(resultaat == 2);
    }
    @Test
    void getal5en3_calculatorVermenigvuldig_resultaat15(){
        Calculator cl = new Calculator(5,3);
        int resultaat = cl.vermeenigvuldig();
        assert(resultaat == 15);
    }
    @Test
    void getal6en3_calculatorDelen_resultaat2(){
        Calculator cl = new Calculator(6,3);
        int resultaat = cl.delen();
        assert(resultaat == 2);
    }
    @Test
    void getal7en3_calculatorDelen_resultaat2(){
        Calculator cl = new Calculator(7,3);
        int resultaat = cl.delen();
        assert(resultaat == 2);
    }
}
