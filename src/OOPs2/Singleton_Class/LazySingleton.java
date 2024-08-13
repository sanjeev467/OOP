package OOPs2.Singleton_Class;

public class LazySingleton {
    private static LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton() {}

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

/*
1)  Private Static Instance Variable:

private static LazySingleton instance;
This variable holds the single instance of the LazySingleton class.
It is declared as static so that it belongs to the class rather than any instance of the class,
and thus is shared among all instances.

2)  Private Constructor:

private LazySingleton() {}
The constructor is private to prevent direct instantiation of the class from outside.
This ensures that the only way to get an instance of the class is through the getInstance method.

3)  Public Static Method:

public static LazySingleton getInstance() { ... }
This method provides access to the singleton instance.
It checks if the instance is null. If it is, it creates a new instance of LazySingleton.
It then returns the instance, which will be either the newly created one or the existing one if it was already created.

How It Works
Lazy Initialization:
The instance of LazySingleton is created only when getInstance() is called for the first time.
If instance is null, it means no instance has been created yet, so a new instance is created and assigned to instance.
This approach is called "lazy initialization" because the instance is created only when needed.

 */
