
public class Praktikum {
    /**
     * В этом методе заложи логику работы с классом Account.
     * Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
     * и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
     *
     * @param args
     */
    public static void main(String[] args) {

        final String name = "NAME NAME";

        Account account = new Account(name);

        if (account.checkNameToEmboss()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
