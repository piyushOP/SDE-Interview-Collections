### Internal Implementation of HashMap:

**Summary:**

Uses Object.equals() and Object.hashCode() methods. These methods can be overridden by custom classes.

hashCode() method of object class returns the memory reference of object in integer form. It is public native.

Nodes (Entry, Value) are stored in buckets, multiple nodes can be in the same bucket (stored as linked list).

Basically following operation is performed to calculate index, index = hashCode(key) & (n-1), where n is number of buckets or the size of array.

HashMap default size 16, load factor 0.75

For put, hashcode of key is calculated and element is inserted, in case of collision, new node is added to previous node at that position

For get, hashcode of key is used first to find bucket, then equals is used to check exact match

Java 8 hash elements use balanced trees instead of linked lists after a certain threshold is reached. Which means HashMap starts with storing Entry objects in linked list but after the number of items in a hash becomes larger than a certain threshold, the hash will change from using a linked list to a balanced tree, which will improve the worst case performance from O(n) to O(log n)

HashSet works like HashMap, but without 

**References:**

https://www.geeksforgeeks.org/internal-working-of-hashmap-java/


### Types of Map in Java

**Summary:**

HashMap is implemented as a hash table, and there is no ordering on keys or values.

TreeMap is implemented based on red-black tree structure (implements SortedMap), and it is ordered / sorted by the key. Custom objects need to implement Comparable interface since sorting is done.

LinkedHashMap preserves the insertion order

Hashtable is synchronized, in contrast to HashMap. It has an overhead for synchronization. This is the reason that HashMap should be used if the program is thread-safe.

**References:**

https://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/


### HashMap vs HashTable

**Summary:**

HashMap is non synchronized, and allows null key whereas Hashtable is synchronized and does not allow null key (since null is not an object). It is thread-safe and can be shared with many threads. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.

**References:**

https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/
