/*
int pos = -1;
for (int i = 0; i < v.length; i++) {
    if (v[i] == buscado) {
        pos = i;
    }
}
return pos;
*/

public class Debug18 {
    
    public static void main(String[] args) {
        int[] v = {5, 1, 8, 2, 7};
        System.out.println("Position: " + indexOf(v, 8));
    }

    private static int indexOf(int[] v, int buscado) {
        int pos = -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == buscado) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
