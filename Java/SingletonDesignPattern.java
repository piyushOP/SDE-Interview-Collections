/**
* @author abhinavjdwij
*/


/* Singleton Design Pattern Implementation Logic

1. Create a class having itself as its static member (for example called instance), initialized to null.
2. Make the constructor private.
3. Make a public static method to create or get the singleton (for example called getInstance).
4. Call the private constructor when getInstance is invoked only first time (when instance is null).
5. Return the instance from getInstance method

*/

class SingletonClass {
    private static SingletonClass singletonInstance = null;
    private Integer singletonVar;
    private SingletonClass() {
        singletonVar = 0;
        System.out.println("Singleton Instance Launched");
    }
    public static SingletonClass getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }
    public void incrementSingletonVar() {
        this.singletonVar++;
    }
    public Integer getSingletonVar() {
        return this.singletonVar;
    }
}

public class SingletonDesignPattern {
	public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        s1.incrementSingletonVar();
        System.out.println("s1 -> singletonVar : " + s1.getSingletonVar());
        SingletonClass s2 = SingletonClass.getInstance();
        // s1 and s2 must have same singletonVar
        System.out.println("s2 -> singletonVar : " + s2.getSingletonVar());
        s2.incrementSingletonVar();
        System.out.println("s1 -> singletonVar : " + s1.getSingletonVar());
        System.out.println("s2 -> singletonVar : " + s2.getSingletonVar()); 
	    
	}
}

