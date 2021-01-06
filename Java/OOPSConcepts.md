### Association, Aggregation and Composition

**Summary:**

Association is established between two separate classes through their objects. Association can be of any type say one to one, one to may etc. It joins two entirely separate entities. For example, Company and Employee are two separate classes, and a Company can have many Employees (Many-To-One).

Aggregation is a special form of Association. Aggregation is a HAS-A relationship. For example, Employee Class can have a field which is of type Address (Address Class). It is a unidirectional association. In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity. 

Composition is a more restricted form of Aggregation. It is a HAS-A / PART-OF relationship. For example, Title and Author compose a Book. When there is a composition between two objects, the composed object cannot exist without the other object. This restriction is not there in aggregation. Though one object can contain the other object, there is no condition that the composed object must exist. The existence of the composed object is entirely optional. In both aggregation and composition, direction is must. The direction specifies, which object contains the other object.


**References:**

https://www.geeksforgeeks.org/association-composition-aggregation-java/
