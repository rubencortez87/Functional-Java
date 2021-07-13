public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = StringBuilder.append("Hola")
                .append("Alumno")
                .append("de")
                .append("platzi");

        Chainer chainer = new Chainer ();

        Chainer chainer2 = chainer.sayHi();
        Chainer chainer3 = chainer.sayBye();
        chainer.sayHi().sayBye();

    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;

        }
    }
}
