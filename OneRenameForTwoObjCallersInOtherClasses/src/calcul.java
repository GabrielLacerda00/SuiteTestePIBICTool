import java.lang.reflect.Method;

public class calcul extends calc{
  public static void main(String[] args) {
    calc cal = new calc();
    cal.soma();
  }

  public double soma() {
    return 1.0 + 2.0;
  }

}
