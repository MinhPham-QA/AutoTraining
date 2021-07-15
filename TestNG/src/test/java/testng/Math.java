package testng;

public class Math {
    private int a, b;

    public Math() {
        this.a = 0;
        this.b = 0;
    }

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int sum() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }
}
