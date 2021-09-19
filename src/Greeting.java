public final class Greeting {

    private final String name;

    public Greeting() {
        name = "World";
    }

    public Greeting(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.print("Hello, " + name + "\n");
    }
}
