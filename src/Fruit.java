public class Fruit {
    private String name;
    public Fruit(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Frutto{" +
                "nome='" + name + '\'' +
                '}';
    }
}
