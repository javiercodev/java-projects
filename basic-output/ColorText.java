public class ColorText {
    
    public static void main(String[] args) {

        String red = "\033[31m";
        String green = "\033[32m";
        String orange = "\033[33m";
        String blue = "\033[34m";
        String purple = "\033[35m";
        String white = "\033[37m";
        String noncolor = "\033[30m";

        System.out.print(orange + "tangerine" + green + "grass");
        System.out.print(orange+ "grasshopper" + red + "tomato");
        System.out.print(white + "bedsheets" + blue + "sky");
        System.out.print(purple + "nazarene" + blue + "sea");
        System.out.print(noncolor);
    }
}