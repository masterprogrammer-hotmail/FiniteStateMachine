# FiniteStateMachine
FiniteStateMachine

A State Machine is an abstract model which can be used to process and represent state transitions. In the case of a Finite State Machine (FSM), we are handling a finite number of state changes which can be triggered by a set of events.

One representation of FSM would be basic video player. The player would go from the Null State (default initial state) to content-selected, content-fetched followed by content-playing. After this, we might have state changes reflecting user selection (pause, stop, rewind, etc.)

We would like to build a system that processes a series of abstract states. This would be emitted through a random-generation process. We would need to perform validation of all the state changes based on the provided requirements. Any invalid state transition should generate an error (Console Log is fine) in addition to a reset to the Null State. A successful validation would also generate an OK statement as well as reset to the Null State.

Available states: a, b, c & d.
Requirements for state transitions:
a-a
a-b-c
c-d
d-e
e-e
Events are emitted sequentially (single thread).
Validation can be handled sequentially or in multiple threads/tasks.

Task:
Write a program which contain the needed components.
Include in-line documentation to describe what each object/function does.
The focus is how the code is structured.
The requirements (state transitions) can be ingested in any way (string array, etc.)
It is possible there are corner cases – These can be bypassed. The focus is the approach of the problem as well as code structure.
This can be written in any language, but Kotlin is preferred.
Please share this project through a public github so that our team can access the code.
