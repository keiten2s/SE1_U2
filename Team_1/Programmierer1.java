package Team_1;
public class Programmierer1 {
    public static boolean isWellSorted( String[] sequence ) {
        for (int i = 0; i < sequence.length - 1; i++) {
            String s1 = sequence[i];
            String s2 = sequence[i + 1];

            if (s1.compareTo(s2) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
