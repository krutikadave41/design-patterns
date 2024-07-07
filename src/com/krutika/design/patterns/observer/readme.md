**the Observer Pattern**
- Publishers + Subscribers = Observer Pattern

where

* Publishers = Subject
and

* Subscribers = Observers

The Observer Pattern defines a one-to-many relationship between a set of objects. When the state of one object (the subject) changes, all of its dependent objects (the observers) are notified.

The Observer Pattern provides an object design where subjects and observers are loosely coupled (they can interact, but have very little knowledge of each other):

the only thing the subject knows about an observer is that it implements a certain interface
we can add new observers at any time
we never need to modify the subject to add new types of observers
we can reuse subjects or observers independently of each other
changes to either the subject or an observer will not affect the other.