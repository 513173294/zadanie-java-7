public class test {

    public static void main(String[] args) {
        Triangle prostokatny = new Triangle("Trojkat","prostokątny");
        Triangle rownoramienny = new Triangle("Trójkąt", "rownoramienny");
        Triangle jakis = new Triangle("trójkąt","jakiś");
        System.out.println("to jest" + jakis.getTyp() + " " + jakis.getNazwa());

        Model model3 = new Model();
        boolean licz = model3.isRightTriangle(jakis);
        System.out.println(licz);
        jakis.setTyp("prostokątny");
        boolean licz2 = model3.isRightTriangle(jakis);
        System.out.println("a po zmianie kątów" + " " + licz2);

        System.out.print(prostokatny.getNazwa()+ " "+prostokatny.getTyp());

        Model model = new Model();
        boolean liczydlo = model.isRightTriangle(rownoramienny);
        System.out.println(" " + liczydlo);

        System.out.print(rownoramienny.getNazwa()+" "+ rownoramienny.getTyp());


        Model model2 = new Model();
        boolean liczydlo2 = model2.isRightTriangle(prostokatny);
        System.out.println(" " + liczydlo2);


    }


}
