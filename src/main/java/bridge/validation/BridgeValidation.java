package bridge.validation;

public class BridgeValidation {

    public static boolean bridgeValidation(String size){
        try {
            isNumber(size);
            isInRange(Integer.parseInt(size));
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static void isInRange(int size){
        if(size<3 || size>20){
            System.out.println("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
            throw new IllegalArgumentException();
        }
    }

    private static void isNumber(String size){
        try {
            Double.parseDouble(size);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
            e.printStackTrace();
        }
    }
}