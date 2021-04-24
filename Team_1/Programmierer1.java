package Team_1;
public class Programmierer1 implements Interface {
    public boolean isWellSorted( String[] sequence ) {
        for (int i = 0; i < sequence.length - 1; i++) {
            String s1 = sequence[i].toLowerCase();
            String s2 = sequence[i + 1].toLowerCase();

            if (s1.compareTo(s2) > 0)
                return false;
        }

        return true;
    }

    public boolean isWellSorted(String[][] sequences) {
        for (int i = 0; i < sequences.length - 1; i++) {
            String[] sequence = sequences[i];
            if (isWellSorted(sequence) == false)
                return false;
        }

        return true;
    }
}
