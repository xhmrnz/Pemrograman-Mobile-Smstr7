package com.ilham.mygcmnetworkmanager;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.SyncHttpClient;

import org.json.JSONObject;

import java.text.DecimalFormat;

import cz.msebera.android.httpclient.entity.mime.Header;

public class SchedulerService extends GcmTaskService {

    final String TAG = SchedulerService.class.getSimpleName();
    final String APP_ID = "df2ea7c1340ba5048ab8457391700dd8";
    final String CITY = "Serang";

    static String TAG_TASK_WEATHER_LOG = "WeatherTask";

    @Override
    public int onRunTask(TaskParams taskParams) {
        int result =  0;
        if (taskParams.getTag().equals(TAG_TASK_WEATHER_LOG)){
            getCurrentWeather();
            result = GcmNetworkManager.RESULT_SUCCESS;
        }
        return result;
    }

    @Override
    public void onInitializeTasks(){
        super.onInitializeTasks();
        SchedulerTask mSchedulerTask = new SchedulerTask(this);
        mSchedulerTask.createPeriodicTask();
    }

    public void getCurrentWeather(){
        Log.d("GetWeather", "Running");
        SyncHttpClient client = new SyncHttpClient();
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + CITY + "&appid=" + APP_ID;
        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] header, byte[] responseBody){
                String result = new String(responseBody);
                Log.d(TAG, result);
                try {
                    JSONObject responseObject = new JSONObject(result);
                    String currentWeather = responseObject.getJSONArray("weather").getJSONObject(0).getString("main");
                    String description = responseObject.getJSONArray("weather").getJSONObject(0).getString("description");
                    double tempInKelvin = responseObject.getJSONObject("main").getDouble("temp");

                    double tempInCelcius = tempInKelvin - 273;
                    String temprature = new DecimalFormat("##.##").format(tempInCelcius);

                    String title = "Current Weather";
                    String message = currentWeather + ", " + description + " with " + temprature + " celcius ";
                    int notifId = 100;

                    showNotification(getApplicationContext(), title, message, notifId);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        @Override
        public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, Throwable error) {
            Log.d("GetWeather", "Failed");
        }
    });
}

    private void showNotification(Context context, String title, String message, int notifId) {
        String CHANNEL_ID = "Channel_1";
        String CHANNEL_NAME = "Job service channel";
        NotificationManager notificationManagerCompat = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setContentTitle(title)
                .setSmallIcon(R.drawable.ic_replay_30_black_24dp)
                .setContentText(message)
                .setColor(ContextCompat.getColor(context, android.R.color.black))
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000})
                .setSound(alarmSound);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,
                    CHANNEL_NAME,
                    NotificationManager.IMPORTANCE_DEFAULT);

            channel.enableVibration(true);
            channel.setVibrationPattern(new long[]{1000, 1000, 1000, 1000, 1000});

            builder.setChannelId(CHANNEL_ID);

            if(notificationManagerCompat != null){
                notificationManagerCompat.createNotificationChannel(channel);
            }
        }

    Notification notification = builder.build();
        if(notificationManagerCompat != null){
            notificationManagerCompat.notify(notifId, notification);
        }
}
}