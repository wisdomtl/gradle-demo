package com.zenmen.pa

class NativeLib {

    /**
     * A native method that is implemented by the 'pa' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'pa' library on application startup.
        init {
            System.loadLibrary("pa")
        }
    }
}