import java.security.MessageDigest;

public class crypto {
    public static String sha256(String input){
        try{
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] hash = sha.digest(input.getBytes("UTF-8"));

            StringBuffer hexString = new StringBuffer();
            int i=0;
            while (i < hash.length){
                String hex = Integer.toHexString(0xff & hash[i]);

                hexString.append(hex);
                i++;
            }

            return hexString.toString();
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }
}
