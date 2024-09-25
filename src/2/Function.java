// 5. Створити абстрактний базовий клас Function (функція) з абстрактними
// методами обчислення значення функції в заданій точці x і виводу
// результату на екран. Визначити похідні класи Ellipse (еліпс) і Hyperbola
// (гіпербола) з власними функціями обчислення значення і друку.

public abstract class Function {
    public abstract double calculate(double x);

    public abstract void result(double x);
}
