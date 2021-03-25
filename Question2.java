import java.util.function.UnaryOperator;

public class Question2 {
    UnaryOperator<Double> fx=x->2*x+3;

    double funcF(double x){
        return 2*x+3;
    }
    public static void main(String[]args){
        Question2 funcs = new Question2();
        System.out.println(funcs.fx.apply(7.0));
        System.out.println(funcs.funcF(7));
    }
}
