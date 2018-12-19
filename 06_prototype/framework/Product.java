package framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
