
public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    /**
     * Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
     * Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
     *
     * @return true or false
     */
    public boolean checkNameToEmboss() {
        return name == null ? false : name.length() >= 3 && name.length() <= 19 && name.split(" ").length - 1 == 1 &&
                !(name.startsWith(" ")) && !(name.endsWith(" "));
    }
}
