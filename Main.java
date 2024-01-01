import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double x1 = 12.5;
        double x2 = 2.75;
        double c = 3.33;
        ArrayList<block> blockChain = new ArrayList<>();

        blockChain.add(new block("X1", x1, "null"));
        blockChain.add(new block("X2", x2, blockChain.get(blockChain.size() -1).hash));
        blockChain.add(new block("C", c, blockChain.get(blockChain.size() -1).hash));

        isValid valid = new isValid(blockChain);
        valid.isValidChain();


        for (block blk : blockChain) {
            System.out.println(blk.getData());
        }

    }

}