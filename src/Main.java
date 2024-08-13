//1. Напишите метод, на вход которого подаётся двумерный строковый
//массив размером 4х4. При подаче массива другого размера
//необходимо бросить исключение MyArraySizeException
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
// или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
// и MyArrayDataException и вывести результат расчета.

public static void main(String[] args) {
        Int[][] validArray = new Int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16}};

        Int[][] invalidSizeArray = new Int{{1, 2, 3},{4, 5, 6}};

        Int[][] invalidDataArray = new Int{{1, 2, "three", 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // Проверка корректного массива
        try {
            int sum = calculateSum(validArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Проверка массива неверного размера
        try {
            int sum = calculateSum(invalidSizeArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Проверка массива с неверными данными
        try {
            int sum = calculateSum(invalidDataArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        }