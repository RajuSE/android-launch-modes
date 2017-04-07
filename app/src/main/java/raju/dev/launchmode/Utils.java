package raju.dev.launchmode;

import android.app.ActivityManager;
import android.content.Context;

import java.util.Iterator;
import java.util.List;

/**
 * Created by mgs1901 on 4/7/2017.
 */

public class Utils {
   public static String getRunningActivity(Context ctx){
        String s="";
        ActivityManager m = (ActivityManager) ctx.getSystemService( ctx.ACTIVITY_SERVICE );
        List<ActivityManager.RunningTaskInfo> runningTaskInfoList =  m.getRunningTasks(10);
        Iterator<ActivityManager.RunningTaskInfo> itr = runningTaskInfoList.iterator();
        while(itr.hasNext()){
            ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo)itr.next();
            int id = runningTaskInfo.id;
            CharSequence desc= runningTaskInfo.description;
            int numOfActivities = runningTaskInfo.numActivities;
            String topActivity = runningTaskInfo.topActivity.getShortClassName();
            s+="\nRunning: \n"+topActivity;
        }


        return s;
    }
}
