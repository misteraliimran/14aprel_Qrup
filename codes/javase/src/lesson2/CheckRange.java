package lesson2;

public class CheckRange {

    public void checkValueRange(int value) throws OutOfRangeValueException {

        int min = 10;
        int max = 50;

        if (value < min || value > max) {
            throw new OutOfRangeValueException(
                "Xəta: Dəyər " + min + " ilə " + max + " aralığında deyil!"
            );
        } else {
            System.out.println("Dəyər müəyyən aralıqdadır");
        }
    }
}
