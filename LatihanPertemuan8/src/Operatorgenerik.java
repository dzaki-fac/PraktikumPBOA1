class OperatorGenerik {
    static class Wrapper<T> {
        T value;

        Wrapper(T value) {
            this.value = value;
        }
    }

    static <T> void Tukar(Wrapper<T> a, Wrapper<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    static <T extends Kucing> double Bobot2(T a, T b) {
        return a.bobot + b.bobot;
    }
}