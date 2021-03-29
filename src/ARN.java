public class ARN {

    // Attributes
    private String sequence;
    private String matching;

    // Constructors
    public ARN(String sequence, String matching) throws sizeNotCorrectException {
        this.sequence = sequence;
        this.matching = matching;
    }

    public ARN(String sequence){
        this.sequence = sequence;
        this.matching = null;
    }




    public static void main(String args[]){
        ARN seq1 = new ARN("ATCGGCTCGA");


    }
    //class String : la séquence qui est un input
    //class main : exécuter le programme
    //class: algorithme nussinov
    // what do you think Théo le beaugoss?

}
