public class ARN {

    // Attributes
    private String sequence;
    private String matching;

    // Constructors
    public ARN(String sequence, String matching) throws sizeNotCorrectException {
        if (sequence.length() != matching.length()){
            throw new sizeNotCorrectException();
        }
        else {
            this.sequence = sequence;
            this.matching = matching;
        }
    }

    public ARN(String sequence){
        this.sequence = sequence;
        this.matching = null;
    }

    // Methods
    public String getSequence(){
        return this.sequence;
    }

    public String getMatching(){
        return this.matching;
    }

    public void setMatching(String matching) throws sizeNotCorrectException {
        if (this.sequence.length() != matching.length()){
            throw new sizeNotCorrectException();
        }
        else {
            this.matching = matching;
        }
    }

    public String toString(){
        String result;
        result = "sequence : " + this.sequence + "\n";
        if (this.matching != null){
            result += "matching : " + this.matching;
        }
        return result;
    }

    public String Nussinov(){
        // Algorithme de Nussinov
    }





    public static void main(String args[]) throws sizeNotCorrectException {
        ARN seq1 = new ARN("ATCGGCTCGA");
        System.out.println(seq1);
        seq1.setMatching("((-----))");
        System.out.println(seq1);

    }

}
