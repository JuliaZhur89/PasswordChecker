public class PasswordChecker {
protected int minLength;
protected int maxRepeats = -1;

    public void setMinLength(int minLength){
        if(minLength < 0) {
            throw new IllegalArgumentException("ОШИБКА! Вы не можете указать отрицательное число!");
        } this.minLength = minLength;
    }
    public void setMaxRepeats (int maxRepeats){
        if(maxRepeats <= 0) {
            throw new IllegalArgumentException("ОШИБКА! Вы не можете указать отрицательное число или ноль!");
        }
        this.maxRepeats = maxRepeats;
    }
    public boolean verify(String password) {
        if (minLength == 0 || maxRepeats == -1) {
            throw new IllegalStateException("Вы не выставили нужные настройки чекеру!");
        }

        if (password.length() < minLength){
            return false;
        }

        int count = 1;
        char first = password.charAt(0);
        for (int i = 1; i < password.length(); i++) {
            char second = password.charAt(i);
            if (first == second) {
                count++;
                if (maxRepeats < count){
                    return false;
                }
            } else {
                first = second;
                count = 1;
            }
        }
        return true;

    }

}


