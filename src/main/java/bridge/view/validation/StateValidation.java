package bridge.view.validation;

public class StateValidation {

    public static boolean stateValidation(String input){
        try {
            inNotValidation(input);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void inNotValidation(String input){
        if(!(input.equals("D") || input.equals("U"))){
            System.out.println("[ERROR] D 또는 U만 입력 가능합니다.");
            throw new IllegalArgumentException();
        }
    }
}