public class ColorSchedule {
    
    public static void main(String[] args) {

        String blue = "\033[34m";
        String red = "\033[31m";
        String orange = "\033[33m";
        String purple = "\033[35m";
        String noncolor = "\033[30m";
        
        System.out.print(blue +"16:30");
        System.out.println(red + "\t  Programming");
        System.out.print(blue + "17:30");
        System.out.println(orange + "\t  Database");
        System.out.print(blue + "18:30");
        System.out.println(purple + "\t  Markup language");
        System.out.print(noncolor);
    }
}