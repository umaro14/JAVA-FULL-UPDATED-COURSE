# ✅ What Is a Sealed Class in Java?

A sealed class is a class that restricts which other classes can extend it.

Java introduced this in Java 17.

It allows you to control inheritance.

# ✅ Why Do We Use Sealed Classes?

✔ To control who can inherit from your class
✔ To make your design more secure
✔ To prevent unwanted subclasses
✔ Works well with pattern matching and polymorphism
✔ Useful in modelling fixed hierarchies (like enums but with classes)

//Imagine you are building an airport system:
//You want to control types of tickets:

# public sealed class Ticket permits EconomyTicket, BusinessTicket, FirstClassTicket { }