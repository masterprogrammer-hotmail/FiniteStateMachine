/**
 * A set of all valid states in the FSM
 */
val validStates = setOf("a", "b", "c", "d", "e")

/**
 * A mapping of valid state transitions
 */
val transitionMap = mapOf(
    "a" to setOf("a", "b", "c"),
    "b" to setOf("c"),
    "c" to setOf("d"),
    "d" to setOf("e"),
    "e" to setOf("e")
)

/**
 * A simple finite state machine class that validates and processes state transitions.
 */
class FiniteStateMachine {
    private var currentState: String? = null
    
    /**
     * Processes a new event and transitions the state machine to a new state.
     * Returns a message indicating whether the transition was successful or not.
     */
    fun processEvent(event: String): String {
        return when {
            currentState == null && event == "a" -> transitionToState(event)
            currentState != null && transitionMap[currentState]?.contains(event) == true -> transitionToState(event)
            else -> resetToNullStateAndLogError()
        }
    }
    
    /**
     * Transitions the state machine to a new state.
     * Returns a message indicating whether the transition was successful or not.
     */
    private fun transitionToState(newState: String): String {
        currentState = newState
        return if (newState == "e") {
            resetToNullStateAndLogOk()
        } else {
            "Transition to state $newState successful"
        }
    }
    
    /**
     * Resets the state machine to the null state and logs an error message.
     * Returns an error message.
     */
    private fun resetToNullStateAndLogError(): String {
        currentState = null
        return "Invalid state transition, resetting to null state"
    }
    
    /**
     * Resets the state machine to the null state and logs an ok message.
     * Returns an ok message.
     */
    private fun resetToNullStateAndLogOk(): String {
        currentState = null
        return "All state transitions successful, resetting to null state"
    }
}

// Example usage
fun main() {
    val fsm = FiniteStateMachine()
    val events = listOf("a", "b", "c", "d", "e", "b", "a", "c", "e", "d")
    events.forEach { event ->
        println(fsm.processEvent(event))
    }
}
