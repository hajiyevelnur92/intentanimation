# intentanimation
animattion between activities
**Intent animations**
===================

### It`s top animations between activities.

## **Example** ##

![enter image description here](https://image.ibb.co/hzqDnn/ezgif_com_video_to_gif.gif "Intent_animation.gif")

### **Gradle**
```groovy
compile 'com.github.hajiyevelnur92:intentanimation:1.0'
```  

## **Usage** ##
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
