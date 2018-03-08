# intentanimation
animattion between activities
**Intent animations**
===================

### It`s top animations between activities.

## **Usage** ##
![image](https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png)


**Gradle**

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

    dependencies {
         compile 'com.github.hajiyevelnur92:intentanimation:1.0'
    }



#### **Code**
```java

import static maes.tech.intentanim.CustomIntent.customType;
//MainActivity or any activity name
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //.....//
        
        //here is library
        customType(MainActivity.this,"here is string name");
}
        
*left-to-right
*right-to-left
*bottom-to-up
*up-to-bottom
*fadein-to-fadeout
*rotateout-to-rotatein
```

### [License](./LICENSE)
