# IntentBuilder [![](https://jitpack.io/v/arsipu/IntentBuilder.svg)](https://jitpack.io/#arsipu/IntentBuilder)

IntentBuilder is a simple and fluent utility for constructing Android `Intent` objects with various configurations and extras. It helps reduce boilerplate and makes intent creation more readable and maintainable.

## Features
- Fluent API for building Intents
- Multiple constructors for different use cases (action, context + activity, action + URI, etc.)
- Methods to set extras of various types: String, Int, Boolean, Parcelable, Float, etc.
- Easy to use in both Kotlin and Java projects

## Installation

### Gradle
Add it in your root settings.gradle at the end of repositories:
```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

### Gradle.kts
Add it in your settings.gradle.kts at the end of repositories:
```
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url = uri("https://jitpack.io") }
		}
	}
```

Add the dependency
```
dependencies {
	        implementation("com.github.arsipu:IntentBuilder:Tag")
	}
```



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

IntentBuilder.goIntent(context: Context, intent: Intent);
```


## Use Only go Intent
If you want to use only the `goIntent` method without building an Intent, you can do so as follows:
```kotlin
IntentBuilder.goIntent(context, TargetActivity::class.java)
```

Java :
```java
IntentBuilder.goIntent(context, TargetActivity.class);
```
## License
MIT
