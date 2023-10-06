# Factory Method Design Pattern

## Definition

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

![img_1.png](img_1.png)

## Example

Example mocks the above schema one to one. In our case depending on system we're running we will bet a dialog that is desktop or hrml based.
Dialog is an abstract class with one abstract factory method that depends on the subclass will produce relevant dialog.

![img.png](img.png)

P.S. Example is from awesome website [Refactoring Guru](https://refactoring.guru)

P.S.2 There is another example attached from Hyperskill (burger store)

