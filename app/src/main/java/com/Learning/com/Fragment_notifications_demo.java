package com.Learning.com;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_notifications_demo extends Fragment {
    Button simple,long_text,chat,image;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_notification_demo, container, false);
        simple=(Button)view.findViewById(R.id.simple);
        chat=(Button)view.findViewById(R.id.chat);
        long_text=(Button)view.findViewById(R.id.long_text);
        image=(Button)view.findViewById(R.id.image);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simple();
            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chat();
            }
        });
        long_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longText();
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Imagenotification();
            }
        });

        return view;
    }
    public void simple(){
        int notifyid=001;
        NotificationManager manager=(NotificationManager)getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getActivity())
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Android Learning")
                .setAutoCancel(true)
                .setContentText("Hi, buddies click here to dismiss");
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            String channelId = "1";
            String channelName_1 = "channel1";
            NotificationChannel channel = new NotificationChannel(channelId, channelName_1, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            channel.setShowBadge(true);
            builder.setChannelId(channelId);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
        else {
            builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_LIGHTS|Notification.DEFAULT_VIBRATE);
        }
        Intent intent=getActivity().getIntent();
        TaskStackBuilder stackBuilder=TaskStackBuilder.create(getActivity().getApplicationContext());
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent=stackBuilder.getPendingIntent(001,PendingIntent.FLAG_UPDATE_CURRENT);
        if(manager!=null){
            manager.notify(notifyid,builder.build());
        }




    }
    public void chat(){
        int notifyid=002;
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getActivity())
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Android Learning")
                .setContentText("Message Arrived")
                .setAutoCancel(true);

        NotificationCompat.InboxStyle inboxStyle=new NotificationCompat.InboxStyle();
        inboxStyle.setBigContentTitle("Messages");
        inboxStyle.addLine("Älpha");
        inboxStyle.addLine("Beta");
        inboxStyle.addLine("CupCake");
        inboxStyle.addLine("Donut");
        builder.setStyle(inboxStyle);
        Intent intent=getActivity().getIntent();
        TaskStackBuilder stackBuilder=TaskStackBuilder.create(getActivity());
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent=PendingIntent.getActivity(getActivity(),0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        NotificationManager manager=(NotificationManager)getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            String channelId2 = "2";
            String channelName_2 = "channel2";
            NotificationChannel channel = new NotificationChannel(channelId2, channelName_2, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            channel.setShowBadge(true);
            builder.setChannelId(channelId2);


            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
        else {
            builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_LIGHTS|Notification.DEFAULT_VIBRATE);
        }

        if(manager!=null){
            manager.notify(notifyid,builder.build());
        }



    }
    public void longText() {
        int notifyid = 003;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
        NotificationManager manager = (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText("Hii all welcome to Android Learning.All the best for your future with android delopment");
        bigTextStyle.setSummaryText("Android Learning");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getActivity())
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Android Learning")
                .setStyle(bigTextStyle);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "1";
            String channelName_1 = "channel1";
            NotificationChannel channel = new NotificationChannel(channelId, channelName_1, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            channel.setShowBadge(true);
            builder.setChannelId(channelId);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }else {
            builder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
        }
        Intent intent = getActivity().getIntent();
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(getActivity().getApplicationContext());
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent = stackBuilder.getPendingIntent(001, PendingIntent.FLAG_UPDATE_CURRENT);
        if (manager != null) {
            manager.notify(notifyid, builder.build());
        }



    }
    public void Imagenotification() {
        int notifyid=004;
        NotificationCompat.BigPictureStyle bigPictureStyle=new NotificationCompat.BigPictureStyle();
        bigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher_background)).build();
        Intent intent=getActivity().getIntent();

        PendingIntent pendingIntent=PendingIntent.getActivity(getActivity(),0,intent,0);
        NotificationManager manager=(NotificationManager)getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getActivity())
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Android Learning")
                .addAction(R.drawable.icon,"Share",pendingIntent)
                .setStyle(bigPictureStyle);
        builder.setContentIntent(pendingIntent);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            String channelId = "1";
            String channelName_1 = "channel1";
            NotificationChannel channel = new NotificationChannel(channelId, channelName_1, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            channel.setShowBadge(true);
            builder.setChannelId(channelId);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
        else {
            builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_LIGHTS|Notification.DEFAULT_VIBRATE);
        }

        if(manager!=null){
            manager.notify(notifyid,builder.build());
        }


    }
}
