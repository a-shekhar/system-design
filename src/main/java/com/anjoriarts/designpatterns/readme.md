# Standard UML class diagrams should indicate visibility:

'+' for public

'-' for private

'#' for protected

# inteface Convention

"<<'interface'>> " - remove single quote

# Arrow

Payment -----> PaymentStrategy // uses, depends (dashed arrow with an open triangle from Payment to PaymentStrategy to represent "uses/depends on interface" (i.e., a dependency).)


If you were showing ConcreteStrategy implements PaymentStrategy, then you would use:

A solid line with an open triangle pointing to the interface (implements or inheritance).

The solid line with a directed arrow from Test to Payment indicates that:

The Test class creates or directly uses an instance of Payment.

# Clarification on Arrow Type
Relationship Type	UML Representation	When to Use
Association (uses)	Solid line with arrow	Class A uses Class B (e.g., Test → Payment)
Dependency (temporary use)	Dashed arrow	Class A depends on Class B (e.g., imports, method params only)
Implements	Solid line with open triangle	Interface inheritance
Inheritance (extends)	Solid line with open triangle	Class inheritance
