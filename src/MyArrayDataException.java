// Исключение для неверных данных в массиве
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}