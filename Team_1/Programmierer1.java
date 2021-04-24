package Team_1;

public class Programmierer1 implements Interface {
    String[][] allowedSequence = null;

    public Programmierer1(String[][] allowedSequence) {
        this.allowedSequence = allowedSequence;
    }

    public boolean isWellSorted( String[] sequence ) {
        //check if sequence is null, empty or only containing 1 item
        if (sequence == null || sequence.length <= 1)
            return true;
        
        //check for double tasks
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                if (sequence[i].charAt(0) == sequence[j].charAt(0))
                    return false;

            }
        }

        for (int i = 0; i < allowedSequence.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                if(sequence[j].charAt(0) == allowedSequence[i][1].charAt(0)) {
                    for(int k= j + 1; k < sequence.length; k++) {
						if(sequence[k].charAt(0) == allowedSequence[i][0].charAt(0)) {
							return false;
						}
					}
                }
            }
        }

        return true;
    }
}
