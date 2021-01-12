### Internal Implementation of HashMap:

**Summary:**

Uses Object.equals() and Object.hashCode() methods. These methods can be overridden by custom classes.

hashCode() method of object class returns the memory reference of object in integer form. It is public native.

Nodes (Entry, Value) are stored in buckets, multiple nodes can be in the same bucket (stored as linked list).

Basically following operation is performed to calculate index, index = hashCode(key) & (n-1), where n is number of buckets or the size of array.

HashMap default size 16, load factor 0.75. The Load factor is a measure that decides when to increase the HashMap capacity to maintain the get() and put() operation complexity of O(1). The default load factor of HashMap is 0.75f (75% of the map size).

For put, hashcode of key is calculated and element is inserted, in case of collision, new node is added to previous node at that position.

For get, hashcode of key is used first to find bucket, then equals is used to check exact match.

Java 8 hash elements use balanced trees instead of linked lists after a certain threshold is reached. Which means HashMap starts with storing Entry objects in linked list but after the number of items in a hash becomes larger than a certain threshold, the hash will change from using a linked list to a balanced tree, which will improve the worst case performance from O(n) to O(log n).

HashSet works like HashMap, but uses just key instead of key value pair.

**References:**

https://www.geeksforgeeks.org/internal-working-of-hashmap-java/


### Types of Map in Java

**Summary:**

HashMap is implemented as a hash table, and there is no ordering on keys or values.

TreeMap is implemented based on red-black tree structure (implements SortedMap), and it is ordered / sorted by the key. Custom objects need to implement Comparable interface since sorting is done.

LinkedHashMap preserves the insertion order.

Hashtable is synchronized, in contrast to HashMap. It has an overhead for synchronization. This is the reason that HashMap should be used if the program is thread-safe.

**References:**

https://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/


### HashMap vs HashTable

**Summary:**

HashMap is non synchronized, and allows null key whereas Hashtable is synchronized and does not allow null key (since null is not an object). It is thread-safe and can be shared with many threads. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.

**References:**

https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/

### Serialization / Deserialization in Java

**Summary:**

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

It is mainly used to travel object's state on the network. It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.

We must have to implement the java.io.Serializable interface for serializing the object.

For serializing the object, we call the writeObject() method ObjectOutputStream, and for deserialization we call the readObject() method of ObjectInputStream class.

The Serialization runtime associates a version number with each Serializable class called a SerialVersionUID, which is used during Deserialization to verify that sender and reciever of a serialized object have loaded classes for that object which are compatible with respect to serialization. If the reciever has loaded a class for the object that has different UID than that of corresponding sender’s class, the Deserialization will result in an InvalidClassException. A Serializable class can declare its own UID explicitly by declaring a field name. It must be static, final and of type long. i.e- ANY-ACCESS-MODIFIER static final long serialVersionUID=42L;

If a serializable class doesn’t explicitly declare a serialVersionUID, then the serialization runtime will calculate a default one for that class based on various aspects of class, as described in Java Object Serialization Specification. However it is strongly recommended that all serializable classes explicitly declare serialVersionUID value, since its computation is highly sensitive to class details that may vary depending on compiler implementations, any change in class or using different id may affect the serialized data.

> If there is any static data member in a class, it will not be serialized because static is the part of class not object.

**References:**

https://www.javatpoint.com/serialization-in-java

### Singleton Class

**Summary:**

A singleton class is a class that can have only one object (an instance of the class) at a time. Example: Scheduler Class

To design a singleton class, make constructor as private and write a static method i.e getInstance() that has return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method. getInstance() method must be public and must initialize the class members when the first call to getInstance() is made and return the Object in this and all future cases.

**References:**

https://www.geeksforgeeks.org/singleton-class-java/

### synchronized keyword

**Summary:**

Java provides us with the synchronized keyword, which acts like a lock to a particular resource. This helps achieve communication between threads such that only one thread accesses the synchronized resource and other threads wait for the resource to become free.

**References:**

https://stackabuse.com/synchronized-keyword-in-java/

### Comparator in JAVA

**Summary:**

Comparator can be used to implement custom logic for sorting or to add comparison feature to user defined objects.
Custom Comparator class must implement Comparator<CustomObject>  andoverride method -> public int compare(CustomObj obj1, CustomObj obj2) -> and return greater than 0 for ascending, less than 0 for descending or 0 for equals case. Then use Collections.sort(iterables, new CustomComparator()) to sort.

Example for a Student class sorted in ascending order on the basis of age field:

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (s1.age - s2.age);
    }
}

Sort using: Collections.sort(studentList, new StudentComparator());

**References:**

https://www.geeksforgeeks.org/comparator-interface-java/
