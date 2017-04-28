# Kotlin lunch and learn
Project written on kotlin as part of lunch and learn presentation.

### [0. Classes](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/basic/0.Classes.kt)
No more one file one class rule. Any amount of classes can be in one file. 
To declare a class put _Class_ keyword and class name. 
By default all classes in Kotlin are public and final. 
To make a class not final use _open_ modifier.

### [1. Interfaces](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/basic/1.Interfaces.kt)
Similar to a class declaration but with _interface_ keyword. 
Although functions can have default implementation just like in Java 8.

### [2. Constructors](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/basic/2.Constructors.kt)
Two types of constructors exist in Kotlin - primary and secondary

#### Primary constructor
Primary constructor is a part of a class header. 
Every declared parameters became properties. 
To write any initialization code _init_ block can be used.
All parameters from the constructor available there.
Primary constructor can be only one for a class. 
Although visibility modifier can be applied.

#### Secondary constructor
Can be declared more than one. 
If primary constructor defined for a class each secondary constructor needs to delegate to primary constructor 

### [3. Properties](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/basic/3.Properties.kt)
No more getters and setters like in Java. 
Property can be defined by using _val_ and _var_ keywords. 

_val_ read only property 

_var_ modifiable property 

### [4. Functions](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/basic/4.Functions.kt)
Functions can be declared without a class (package level functions). 
To define a function use _fun_ keyword, function name and returning type. 
Returning type can be omitted if function returns nothing. 
One line functions can be simplified by using _=_ and statement. 
Parameters can have default values. Also parameter's name can be used when calling function

### [5. Extensions](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/features/5.Extenstions.kt)
Kotlin provides ability to extend a class with new functionality without having to inherit from the class 
or creating Util class. 
To declare extension function use receiver type as prefix and function name. 
_This_ keyword corresponds to to the receiver object.
 
### [6. Data classes](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/features/6.DataClasses.kt) 
For classes which contains only data Kotlin has a concept of data class.
To use that ability add _data_ keyword before the class and declare primary constructor with some fields. 
Kotlin compiler generates for you - equals, hashCode and toString functions. 

### [7. Null Safety](https://github.com/rustamgaifullin/kotlin-lunch-learn/blob/master/src/main/kotlin/com/rustam/features/7.NullSafety.kt)
In Kotlin's type system by default all types can't be null.
To be able to use nullable type put _?_ after the type.
To be able to call functions from nullable type use safe call by using _?_ after variable name. 
If variable will be null result of function invocation will be also null. 
In case of checking variable for a null value no need to use safe call operator. 
Also function _let_ can be used for that purpose.
Elvis operator _?:_ can provide default value in case of null value. 
Operator _!!_ can be used instead of safe calls in case of null value _NullPointerException_ will be thrown.