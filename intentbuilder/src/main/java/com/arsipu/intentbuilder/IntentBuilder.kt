package com.arsipu.intentbuilder

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Parcelable

/**
 * IntentBuilder
 * Created by Arsipu on 2024/6/20.
 * Description:
 * A builder class for creating Intents with various configurations.
 * Usage:
 * val intent = IntentBuilder(context, TargetActivity::class.java)
 *     .setStringExtra("key", "value")
 *     .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
 *     .build()
 * Parameters:
 * context: Context - The context from which to create the intent.
 * cls: Class<*> - The activity class to be started.
 */
class IntentBuilder() {

    // The Intent instance being built
    private var intent: Intent

    /**
     * Initializes the IntentBuilder with a default Intent.
     */
    init {
        intent = Intent()
    }


    /**
     * Initializes the IntentBuilder with an action string.
     * @param action The action string for the intent.
     * @return An instance of IntentBuilder.
     */
    constructor(action : String) : this() {
       intent = Intent(action)
    }

    /**
     * Initializes the IntentBuilder with a context and an activity class.
     * @param context The context from which to create the intent.
     * @param activity The activity class to be started.
     * @return An instance of IntentBuilder.
     */
    constructor(context: Context, activity: Activity) : this() {
        intent = Intent(context, activity::class.java)
    }


    /**
     * Initializes the IntentBuilder with a context and an activity class.
     * @param context The context from which to create the intent.
     * @param cls The activity class to be started.
     * @return An instance of IntentBuilder.
     */
    constructor(context: Context, cls : Class<*>) : this() {
        intent = Intent(context, cls)
    }

    /**
     * Initializes the IntentBuilder with an action string and a URI.
     * @param action The action string for the intent.
     * @param uri The URI for the intent.
     * @return An instance of IntentBuilder.
     */
    constructor(action: String, uri: Uri) : this() {
        intent = Intent(action, uri)
    }


    /**
     * Initializes the IntentBuilder with an action string, a URI, a context, and an activity class.
     * @param action The action string for the intent.
     * @param uri The URI for the intent.
     * @param context The context from which to create the intent.
     * @param cls The activity class to be started.
     * @return An instance of IntentBuilder.
     */
    constructor(action: String, uri: Uri, context: Context, cls : Class<*>) : this() {
        intent = Intent(action, uri, context, cls)
    }


    /**
     * Sets a String extra in the intent.
     * @param key The key for the extra.
     * @param value The String value for the extra.
     * @return The current instance of IntentBuilder.
     */

    fun setStringExtra(key : String, value : String ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets an Int extra in the intent.
     * @param key The key for the extra.
     * @param value The Int value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setIntExtra(key : String, value : Int ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets a Boolean extra in the intent.
     * @param key The key for the extra.
     * @param value The Boolean value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setBooleanExtra(key : String, value : Boolean ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets a Parcelable extra in the intent.
     * @param key The key for the extra.
     * @param value The Parcelable value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setParcelableExtra(key : String, value : Parcelable ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }

    /**
     * Sets a Float extra in the intent.
     * @param key The key for the extra.
     * @param value The Float value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setFloatExtra(key : String, value : Float ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets a Double extra in the intent.
     * @param key The key for the extra.
     * @param value The Double value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setDoubleExtra(key : String, value : Double ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }

    /**
     * Sets a Long extra in the intent.
     * @param key The key for the extra.
     * @param value The Long value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setLongExtra(key : String, value : Long ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }

    /**
     * Sets a Char extra in the intent.
     * @param key The key for the extra.
     * @param value The Char value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setCharExtra(key : String, value : Char ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets a Short extra in the intent.
     * @param key The key for the extra.
     * @param value The Short value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setShortExtra(key : String, value : Short ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets a Byte extra in the intent.
     * @param key The key for the extra.
     * @param value The Byte value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setByteExtra(key : String, value : Byte ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }


    /**
     * Sets a CharSequence extra in the intent.
     * @param key The key for the extra.
     * @param value The CharSequence value for the extra.
     * @return The current instance of IntentBuilder.
     */
    fun setCharSequenceExtra(key : String, value : CharSequence ) : IntentBuilder {
        intent.putExtra(key, value)
        return this
    }

    /**
     * Sets multiple flags in the intent.
     * @param flags The flags to be set.
     * @return The current instance of IntentBuilder.
     */
    fun setFlags(flags : Int) : IntentBuilder {
        intent.flags = flags
        return this
    }



    /**
     * Sets the action for the intent.
     * @param action The action string for the intent.
     * @return The current instance of IntentBuilder.
     */
    fun setAction(action : String) : IntentBuilder {
        intent.action = action
        return this
    }


    /**
     * Sets the type for the intent.
     * @param type The MIME type for the intent.
     * @return The current instance of IntentBuilder.
     */
    fun setType(type : String) : IntentBuilder {
        intent.type = type
        return this
    }



    /**
     * Builds and returns the configured Intent.
     * @return The configured Intent instance.
     */
    fun build() : Intent {
        return intent
    }

    companion object {
        /**
         * Starts a new activity.
         *
         * @param context The context from which to start the activity.
         * @param activity The activity class to be started.
         */
        fun goIntent(context: Context, activity: Activity) {
            val intent = Intent(context, activity::class.java)
            context.startActivity(intent)
        }



        /**
         * Starts a new activity.
         *
         * @param from The activity from which to start the new activity.
         * @param to The activity class to be started.
         */
        fun goIntent(from: Activity, to: Activity) {
            val intent = Intent(from, to::class.java)
            from.startActivity(intent)
        }


        /**
         * Starts a new activity with the provided intent.
         *
         * @param context The context from which to start the activity.
         * @param intent The intent to be used to start the activity.
         */
        fun goIntent(context: Context, intent: Intent) {
            context.startActivity(intent)
        }



        /**
         * Starts a new activity with the provided intent.
         *
         * @param activity The activity from which to start the new activity.
         * @param intent The intent to be used to start the activity.
         */
        fun goIntent(activity: Activity, intent: Intent) {
            activity.startActivity(intent)
        }


    }

}