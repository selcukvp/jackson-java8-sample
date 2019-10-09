# jackson-java8-sample

Jackson Serialization/Deserialization Samples for Java8

- Shows how to serialize Java 8 java.time objects.
- LocalDateTime and Instant types are serialized.
- LocalDateTime is serialized into a String with a custom format
- Instant is serialized as a epoch time in Integer.

## Running

- `mvn clean install`
- `mvn test`

## Test

You can checkout the test to see the output of the temporal objects when serialized.

