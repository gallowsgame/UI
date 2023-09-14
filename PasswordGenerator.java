import java.security.SecureRandom;
import java.util.Random;

interface PasswordGenerator {
    String generatePassword(int length );
}

class SimplePasswordGenerator implements PasswordGenerator {
    private final String UpperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String LowerChar = "abcdefghijklmnopqrstuvwxyz";
    private final String Numbers = "0123456789";
    private final String Symbols = "!@#$%^&*()-_+=<>?.";
    private final String[] emoticons = { 
        };



    @Override
    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        Random random = new SecureRandom();

        String allCharacters = UpperChar + LowerChar + Numbers + Symbols ;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }

        return password.toString();
    }
}


