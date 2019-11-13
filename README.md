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
              implementation 'com.github.sinothk:MapLocationByAMap:2.19.0903'
      }
      
      
 # 使用   
 
      <!--开发者申请的key-->
      <meta-data
          android:name="com.amap.api.v2.apikey"
          android:value="***" />

      <!-- 定位需要的服务 -->
      <service android:name="com.amap.api.location.APSService" />
 
      MapLocationHelper.with(this).location(new AMapLocationCallback() {

            @Override
            public void complete(AMapLocationEntity locEntity) {
                if (locEntity.getCode() == 0) {

                } else {

                }
            }
        });

        MapLocationHelper.with(this).locateContinue(3, new AMapLocationCallback() {
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

                    MapLocationHelper.with(LocationDemoMainActivity.this).locateStop();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
