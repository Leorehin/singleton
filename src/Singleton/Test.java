package Singleton;
public class Test {
public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    //chama novamente para testar se volta a mesma instancia
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
}
}
