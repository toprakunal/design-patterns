# Observer Design Pattern
We have an application that monitors weather data which is constantly changing. We got 3 displays, Weather Stats, Current Conditions, Forecast. But think about constant changes in development, there will be more than 3 displays in the future (probably). Let's define observer pattern.

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## Principles
-Strive for loosely coupled designs between objects that interact. 

## Real Life Cases
 One of the most basic components of that tool kit is the JButton class.If you look up JButton’s super class, Abstract Button, you’ll find that it has a lot of add/remove listener methods. These methods allow you to add and remove observers—or , as they are called in Swing, listeners—to listen for various types of events that occur on the Swing component.

## UML Diagram
![observerpatterndiagram](https://github.com/toprakunal/design-patterns/assets/58954367/4c25f48d-de70-4a44-b46a-548add846c0a)
