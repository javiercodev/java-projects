/* 
for (int i = 0; i < v.length; i++) {
    if (v[i] == buscado) {
        return i;
    } else {
        return -1;
    }
}
return -1; 
*/ 

public class Debug16 {

    public static void main(String[] args) {
        int[] v = {5, 1, 8, 2, 7};
        System.out.println("Position: " + indexOf(v, 7));
    }

    private static int indexOf(int[] v, int buscado) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == buscado) {
            return i;
        } 
    }
        return -1;
    }
}