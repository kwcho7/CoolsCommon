# common

* module build.gradle
```gradle
repositories {
    maven{
        url = 'https://dl.bintray.com/jeffjo/Common'
    }
}

dependencies {
    implementation 'kr.co.cools.core:common:0.0.1'

}

```

# Logger

* must be called ```Logger.init``` in Application'
```java
    override fun onCreate() {
        super.onCreate()
        Logger.init(BuildConfig.DEBUG, "TAG")
    }
```

* Used in a class
```java
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        Logger.v("onCreate")
    }
```

* Print Log
```
/kr.co.cools.myapplication V/[TAG] Activity.kt(29): onCreate
```
