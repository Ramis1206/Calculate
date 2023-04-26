package Calculate;

class Num {
    int num1;
    int num2;
    int res;

    public Num(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void plus() {
        res = num1 + num2;
    }
    public void minus() {
        res = num1 - num2;
    }
    public void division() {
        res = num1/num2;
    }
    public void multiplication() {
        res = num1 * num2;
    }
    public int getRes() {
        return res;
    }
}
