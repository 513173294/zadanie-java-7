public class test {

    public static void main(String[] args) {

        Trojkat trojkat1 = new Trojkat(2, 4, 4.47);
        Trojkat trojkat2 = new Trojkat(3,4,5);
        Model model3 = new Model();
        boolean licz = model3.isRightTriangle(trojkat1);
        boolean licz2 = model3.isRightTriangle(trojkat2);
        System.out.println(trojkat1.getA() + " " + trojkat1.getB() + " " + trojkat1.getC());
        System.out.println(trojkat2.getA() + " " + trojkat2.getB() + " " + trojkat2.getC());

        System.out.println(licz);
        System.out.println(licz2);

//        jakis.setTyp("prostokątny");
//        boolean licz2 = model3.isRightTriangle(jakis);
//        System.out.println("a po zmianie kątów" + " " + licz2);
//
//        System.out.print(prostokatny.getNazwa()+ " "+prostokatny.getTyp());
//
//        Model model = new Model();
//        boolean liczydlo = model.isRightTriangle(rownoramienny);
//        System.out.println(" " + liczydlo);
//
//        System.out.print(rownoramienny.getNazwa()+" "+ rownoramienny.getTyp());
//
//
//        Model model2 = new Model();
//        boolean liczydlo2 = model2.isRightTriangle();
//        System.out.println(" " + liczydlo2);


    }


}
