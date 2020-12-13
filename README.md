# Exception-in-Java
A. Write an exception class that is appropriate for indicating that a time entered
by a user is not valid. The time will be in the format hour:minute followed by
“am” or “pm.”
B. Derive exception classes from the class you wrote in the previous exercise. Each
new class should indicate a specific kind of error. For example,
InvalidHourException could be used to indicate that the value entered for hour
was not an integer in the range 1 to 12.
C. Write a class TimeOfDay that uses the exception classes defined in the previous
exercise. Give it a method setTimeTo(timeString) that changes the time if
timeString corresponds to a valid time of day. If not, it should throw an
exception of the appropriate type.
D. Write code that reads a string from the keyboard and uses it to set the variable
myTime of type TimeOfDay from the previous exercise. Use try-catch blocks to
guarantee that myTime is set to a valid time.
