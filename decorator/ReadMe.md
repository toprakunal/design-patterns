# Decorator Pattern
We have a coffee shop which has Beverage class and subclasses like DarkRoast, HouseBlend, Espresso etc. Additional condiments can be added like steamed milk, mocha, soy etc. For adding these additional condiments, we will use Decorator pattern. for example after creating DarkRoast class, Mocha condiments can be wrap it around that DarkRoast class.

The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Princibles
- Open-Close princible; Classes should be open for extention, but closed for modification.

## UML Diagram

![decoratorpatterndiagram](https://github.com/toprakunal/design-patterns/assets/58954367/671dee36-a3e6-42e7-a76b-cec1b9c8e542)

## Real Life Examples

Java I/O API is using decorator pattern. BufferedInputStream and ZipInputStream both extend Filter InputStream, which extends InputStream.InputStream acts as the abstract decorator class.


## Downsides
designs using this pattern often result in a large number of small classes that can be overwhelming to a developer trying to use the Decorator-based API.

