
public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    /**
     * Метод для проверки ТОЛЬКО ОДНОГО пробела в строке на карте
     *
     * @param name - входная строка имени на карте
     * @return true or false
     */
    public boolean checkOnlyOneSpace(String name) {
        return name == null ? false : name.split(" ").length - 1 == 1;
    }

    /**
     * Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
     * Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
     * @return true or false
     */
    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19 && checkOnlyOneSpace(name) &&
                !(name.startsWith(" ")) && !(name.endsWith(" "))) {
            return true;
        } else {
            return false;
        }
    }
}
