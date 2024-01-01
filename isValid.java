import java.util.ArrayList;

public class isValid {
    public ArrayList<block> blockChain;
    public block currentBlock;
    public block previousBlock;

    public isValid(ArrayList<block> blockChain) {
        this.blockChain = blockChain;
    }

    public boolean isValidChain(){
        for (int i=1; i<blockChain.size(); i++){
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i-1);

            if (!currentBlock.previousHash.equals(previousBlock.hash)){
                System.out.println("hashes are not matching, invalid lockChain");
                return false;
            }
            if (!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("hashes are not matching, invalid lockChain");
                return false;
            }
        }
        System.out.println("Valid chain");
        return true;
    }
}
