# 🔹 Serialization (Java) — Definition

Serialization is the process of converting a Java object into a byte stream so that it can be:

    saved to a file
    sent over a network
    stored in a database or cache
# In Java, this is done using the Serializable interface.

👉 Purpose: Persist or transmit the object’s state AFTER THE PROGRAM EXITS.


# 🔹 Deserialization (Java) — Definition
Deserialization is the reverse process of serialization, where a byte stream is converted back into a Java object.

👉 Purpose: Reconstruct the original object with its saved state.
🔁 Simple Flow

 # Object ➜ Serialization ➜ Byte Stream ➜ Deserialization ➜ Object