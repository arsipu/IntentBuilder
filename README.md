# IntentBuilder

IntentBuilder is a simple and fluent utility for constructing Android `Intent` objects with various configurations and extras. It helps reduce boilerplate and makes intent creation more readable and maintainable.

## Features
- Fluent API for building Intents
- Multiple constructors for different use cases (action, context + activity, action + URI, etc.)
- Methods to set extras of various types: String, Int, Boolean, Parcelable, Float, etc.
- Easy to use in both Kotlin and Java projects

## Installation
Add the module as a dependency in your project. If using as a library module, add to your `settings.gradle.kts` and `build.gradle.kts` as needed.

## Usage Example

### Kotlin
```kotlin
val intent = IntentBuilder(context, TargetActivity::class.java)
    .setStringExtra("username", "arsipu")
    .setIntExtra("user_id", 123)
    .setBooleanExtra("isAdmin", true)
    .build()

IntentBuilder.goIntent(context = context, intent = intent)
```

### Java
```java
Intent intent = new IntentBuilder(context, TargetActivity.class)
    .setStringExtra("username", "arsipu")
    .setIntExtra("user_id", 123)
    .setBooleanExtra("isAdmin", true)
    .build();

IntentBuilder.goIntent(context: Context, intent: Intent)
```


## Use Only go Intent
If you want to use only the `goIntent` method without building an Intent, you can do so as follows:
```kotlin
IntentBuilder.goIntent(context, TargetActivity::class.java)
```
```java
IntentBuilder.goIntent(context, TargetActivity.class);
```
## License
MIT
