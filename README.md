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

* Dependency library 
```gradle
    implementation 'com.jakewharton.timber:timber:4.7.1'
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


# License

    Copyright 2018 JeffJo

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
