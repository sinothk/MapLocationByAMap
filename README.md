# MapLocationByAMap
MapLocationByAMap

## Step 1. Add the JitPack repository to your build file
  Add it in your root build.gradle at the end of repositories:
  
      allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }
  
## Step 2. Add the dependency

      dependencies {
              implementation 'com.github.sinothk:MapLocationByAMap:1.0.0102'
      }
      
      
 # 使用   
 
      //        AMapLocation.with(this).location(this, new AMapLocationCallback() {
//
//            @Override
//            public void complete(AMapLocationEntity locEntity) {
//                if (locEntity.getCode() == 0) {
//
//                } else {
//
//                }
//            }
//        });

        AMapLocation.with(this).locateContinue(this, 3, new AMapLocationCallback() {
            @Override
            public void complete(AMapLocationEntity locEntity) {
                if (locEntity.getCode() == 0) {

                } else {

                }
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(12 * 1000);

                    AMapLocation.with(LocationDemoMainActivity.this).locateStop();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
