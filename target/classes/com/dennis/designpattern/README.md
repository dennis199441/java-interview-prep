# Design Pattern

## Strategy Pattern
A pattern that enables selecting the algorithm at runtime. 

### Motivation
Subclasses might have different behaviours. This might cause code duplications. Instead of implementing the algorithm directly in the class, we separate out the algorithms and use the interface to access the algorithms.

In our example, both duck and eagle are the subclass of bird and have the fly and eat behaviours. However, how duck fly/eat is different from how eagle fly/eat. Since their behaviours are different, we can't implement the fly/eat algorithm directly in the bird class. If we implement the fly/eat algorithm directly in the the duck/eagle class, the code will be duplicated if there is new type of bird which has the same fly behaviour as duck and same eat behaviour as eagle. 