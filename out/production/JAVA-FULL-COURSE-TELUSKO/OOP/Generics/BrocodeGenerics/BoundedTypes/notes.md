# ✅ Proper Definition of Bounded Types in Java Generics

A bounded type in Java generics is a type parameter that is restricted to accept only certain kinds of types.
This restriction is expressed using bounds, which limit the generic type to either:

1. Upper bounds — using extends

A type parameter may specify an upper bound:

<T extends ClassOrInterface>

# This means:

👉 The type argument must be the specified class or interface, or any of its subclasses/implementations.

# 2. Lower bounds — using super

A wildcard may specify a lower bound:

<? super ClassType>


This means:

👉 The type argument must be the specified class or any of its superclasses.

⭐ Final Formal Definition (Best for Exams)

📌 Bounded types in Java generics allow type parameters to be restricted to a specific range of types using extends for upper bounds and super for lower bounds, ensuring type safety while enabling more precise control over what types can be used in generic classes, methods, or wildcards.