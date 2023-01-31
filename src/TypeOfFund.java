import java.util.Random;

public enum TypeOfFund {
    NATIONAL,
    NON_NATIONAL,
    SWINDLE;


    public static TypeOfFund generateRandom() {
        Random random = new Random();

        TypeOfFund[] values = TypeOfFund.values();

        int length = values.length;
        int randomIndex = random.nextInt(length);

        return values[randomIndex];
    }
}
