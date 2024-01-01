import java.util.Date;

public class block {
    private String name;
    private double value;
    public String hash;
    public String previousHash;
    private long timeSTamp;

    public block(String name, double value, String previousHash) {
        this.name = name;
        this.value = value;
        this.previousHash = previousHash;
        this.timeSTamp = new Date().getTime();

        this.hash = calculateHash();
    }
    public String calculateHash(){
        String newHash =  crypto.sha256(previousHash+timeSTamp+value);
        return newHash;
    }

    public String getData() {
        return this.name+" :"+this.value;
    }
}
