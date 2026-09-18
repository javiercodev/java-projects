public class UserName {
    
    public static void main(String[] args) {

        String name;
        
        System.out.print("Say your username: ");
        name = System.console().readLine();
        System.out.println("Hi! " + name);
    }
}