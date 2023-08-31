

import calculadoraCientifica.calc;
import java.lang.reflect.Method;

public class calculadora extends calc {
  public static void main(String[] args) {
    calc cal = new calc();
    cal.sum();
    cal.soma();
  }

  public double soma() {
    return 1.0 + 2.0;
  }

}
