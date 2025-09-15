public class MemoryExample {
    String name;
    int age;

    // Constructor
    public MemoryExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        MemoryExample obj = new MemoryExample("Alice", 20);
        obj.introduce();

        obj = new MemoryExample("Bob", 25);
        obj.introduce();
    }
}
