//Isaiah Herr (herrx080, 5333708) and SeeLong Thao (thao0478, 5360173) Project 2

public class Term {

    private int coef;
    private int exp;

    public Term(int coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }

    public int getCoef(){
        return coef;
    }

    public void setCoef(int enteredcoef){
        this.coef = enteredcoef;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int enteredexp) {
        this.exp = enteredexp;
    }

    public String toString() {
        return (coef + "x^" + exp);
    }

    public double eval(int enteredX){ //You can make X equal any value that you want according to TA Eric Heidal
        double result = Math.pow(coef * 2, exp);
        return result;
    }

    public Term multiply(Term x, Term y){
       int cresult = x.coef * y.coef; //Multiply coefficients
       int eresult = x.exp + y.exp; //Add exponents together

       Term result = new Term(cresult, eresult);
       return result;
        }
    }

