public class test {

    public static void main(String[] args) {
        Triangle prostokatny = new Triangle("Trojkat","prostokątny");
        Triangle rownoramienny = new Triangle("Trójkąt", "rownoramienny");

        System.out.println(prostokatny.getNazwa()+ " "+prostokatny.getTyp());
        System.out.println(rownoramienny.getNazwa()+" "+ rownoramienny.getTyp());
        Model model = new Model();
        boolean liczydlo = model.isRightTriangle(rownoramienny);
        System.out.println(liczydlo);

        Model model2 = new Model();
        boolean liczydlo2 = model2.isRightTriangle(prostokatny);
        System.out.println(liczydlo2);
    }


}
