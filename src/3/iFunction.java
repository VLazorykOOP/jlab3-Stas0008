// 5. Створити абстрактний базовий клас Function (функція) з абстрактними
// методами обчислення значення функції в заданій точці x і виводу
// результату на екран. Визначити похідні класи Ellipse (еліпс) і Hyperbola
// (гіпербола) з власними функціями обчислення значення і друку.

public interface iFunction {
    public double calculate(double x);

    public void result(double x);
}
