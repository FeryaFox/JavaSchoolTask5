package ru.feryafox.Task7;

public final class Task7 {
    public static void main(String[] args) {
        Source source = new Source();
        source.setName("Alice");
        source.setAge(30);

        Target target = new Target();
        target.setName("Default");
        target.setAge(0);

        System.out.println("До вызова BeanUtils:");
        System.out.println("Target name: " + target.getName());
        System.out.println("Target age: " + target.getAge());

        BeanUtils.assign(target, source);

        System.out.println("После вызова BeanUtils:");
        System.out.println("Target name: " + target.getName());
        System.out.println("Target age: " + target.getAge());
    }
}
