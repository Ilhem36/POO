public class ARN {

    // Attributes
    private String sequence;
    private String appariement;

    // Constructors
    public ARN(String sequence, String appariement){
        this.sequence = sequence;
        this.appariement = appariement;
    }

    public ARN(String sequence){
        this.sequence = sequence;
        this.appariement = null;
    }

}
