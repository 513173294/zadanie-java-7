public class Model {

    public boolean isRightTriangle(Trojkat trojkat) {
        if ((trojkat.getA() *trojkat.getA()) + (trojkat.getB()*trojkat.getB())== trojkat.getC()*trojkat.getC()) {
            return true;

        }
        return false;
    }
}