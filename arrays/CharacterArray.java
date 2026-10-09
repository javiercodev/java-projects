public class CharacterArray {

    public static void main(String[] args) {

        char[] character = new char[11];
        character[0]  = 'j';
        character[1]  = 'a';
        character[2]  = 'v';
        character[3]  = 'i';
        character[4]  = 'e';
        character[5]  = 'r';
        character[6]  = 'c';
        character[7]  = 'o';
        character[8]  = 'd';
        character[9]  = 'e';
        character[10] = 'v';

        for (int i = 0; i <= 10; i++) {
            System.out.print(character[i] + " ");
        }
    }
}