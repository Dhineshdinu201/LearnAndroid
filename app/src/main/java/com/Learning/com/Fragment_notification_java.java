package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_notification_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.app.Notification;\n" +
            "import android.app.NotificationChannel;\n" +
            "import android.app.NotificationManager;\n" +
            "import android.app.PendingIntent;\n" +
            "import android.app.TaskStackBuilder;\n" +
            "import android.content.Context;\n" +
            "import android.content.Intent;\n" +
            "import android.graphics.Bitmap;\n" +
            "import android.graphics.BitmapFactory;\n" +
            "import android.graphics.Color;\n" +
            "import android.os.Build;\n" +
            "import android.support.v4.app.NotificationCompat;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "Button simple,long_text,chat,image;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        simple=(Button)findViewById(R.id.simple);\n" +
            "        chat=(Button)findViewById(R.id.chat);\n" +
            "        long_text=(Button)findViewById(R.id.long_text);\n" +
            "        image=(Button)findViewById(R.id.image);\n" +
            "        simple.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                simple();\n" +
            "            }\n" +
            "        });\n" +
            "        chat.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "               chat();\n" +
            "            }\n" +
            "        });\n" +
            "        long_text.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                longText();\n" +
            "            }\n" +
            "        });\n" +
            "        image.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Imagenotification();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "    public void simple(){\n" +
            "        int notifyid=001;\n" +
            "        NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);\n" +
            "        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)\n" +
            "                .setSmallIcon(R.mipmap.ic_launcher_round)\n" +
            "                .setContentTitle(\"Android Learning\")\n" +
            "                .setAutoCancel(true)\n" +
            "                .setContentText(\"Hi, buddies click here to dismiss\");\n" +
            "        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {\n" +
            "            String channelId = \"1\";\n" +
            "            String channelName_1 = \"channel1\";\n" +
            "            NotificationChannel channel = new NotificationChannel(channelId, channelName_1, NotificationManager.IMPORTANCE_DEFAULT);\n" +
            "            channel.enableLights(true);\n" +
            "            channel.setLightColor(Color.RED);\n" +
            "            channel.enableVibration(true);\n" +
            "            channel.setShowBadge(true);\n" +
            "            builder.setChannelId(channelId);\n" +
            "            if (manager != null) {\n" +
            "                manager.createNotificationChannel(channel);\n" +
            "            }\n" +
            "        }\n" +
            "            else {\n" +
            "                builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_LIGHTS|Notification.DEFAULT_VIBRATE);\n" +
            "            }\n" +
            "            Intent intent=getIntent();\n" +
            "            TaskStackBuilder stackBuilder=TaskStackBuilder.create(getApplicationContext());\n" +
            "            stackBuilder.addNextIntent(intent);\n" +
            "            PendingIntent pendingIntent=stackBuilder.getPendingIntent(001,PendingIntent.FLAG_UPDATE_CURRENT);\n" +
            "            if(manager!=null){\n" +
            "                manager.notify(notifyid,builder.build());\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "    public void chat(){\n" +
            "        int notifyid=002;\n" +
            "        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)\n" +
            "                .setSmallIcon(R.mipmap.ic_launcher_round)\n" +
            "                .setContentTitle(\"Android Learning\")\n" +
            "                .setContentText(\"Message Arrived\")\n" +
            "                .setAutoCancel(true);\n" +
            "\n" +
            "        NotificationCompat.InboxStyle inboxStyle=new NotificationCompat.InboxStyle();\n" +
            "        inboxStyle.setBigContentTitle(\"Messages\");\n" +
            "        inboxStyle.addLine(\"Älpha\");\n" +
            "        inboxStyle.addLine(\"Beta\");\n" +
            "        inboxStyle.addLine(\"CupCake\");\n" +
            "        inboxStyle.addLine(\"Donut\");\n" +
            "        builder.setStyle(inboxStyle);\n" +
            "        Intent intent=getIntent();\n" +
            "        TaskStackBuilder stackBuilder=TaskStackBuilder.create(MainActivity.this);\n" +
            "        stackBuilder.addNextIntent(intent);\n" +
            "        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);\n" +
            "        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {\n" +
            "            String channelId2 = \"2\";\n" +
            "            String channelName_2 = \"channel2\";\n" +
            "            NotificationChannel channel = new NotificationChannel(channelId2, channelName_2, NotificationManager.IMPORTANCE_DEFAULT);\n" +
            "            channel.enableLights(true);\n" +
            "            channel.setLightColor(Color.RED);\n" +
            "            channel.enableVibration(true);\n" +
            "            channel.setShowBadge(true);\n" +
            "            builder.setChannelId(channelId2);\n" +
            "\n" +
            "\n" +
            "            if (manager != null) {\n" +
            "                manager.createNotificationChannel(channel);\n" +
            "            }\n" +
            "        }\n" +
            "            else {\n" +
            "                builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_LIGHTS|Notification.DEFAULT_VIBRATE);\n" +
            "            }\n" +
            "\n" +
            "            if(manager!=null){\n" +
            "                manager.notify(notifyid,builder.build());\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "    public void longText() {\n" +
            "        int notifyid = 003;\n" +
            "        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);\n" +
            "        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);\n" +
            "        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();\n" +
            "        bigTextStyle.bigText(\"Hii all welcome to Android Learning.All the best for your future with android delopment\");\n" +
            "        bigTextStyle.setSummaryText(\"Android Learning\");\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)\n" +
            "                .setSmallIcon(R.mipmap.ic_launcher_round)\n" +
            "                .setContentTitle(\"Android Learning\")\n" +
            "                .setStyle(bigTextStyle);\n" +
            "        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {\n" +
            "            String channelId = \"1\";\n" +
            "            String channelName_1 = \"channel1\";\n" +
            "            NotificationChannel channel = new NotificationChannel(channelId, channelName_1, NotificationManager.IMPORTANCE_DEFAULT);\n" +
            "            channel.enableLights(true);\n" +
            "            channel.setLightColor(Color.RED);\n" +
            "            channel.enableVibration(true);\n" +
            "            channel.setShowBadge(true);\n" +
            "            builder.setChannelId(channelId);\n" +
            "            if (manager != null) {\n" +
            "                manager.createNotificationChannel(channel);\n" +
            "            }\n" +
            "        }else {\n" +
            "                builder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);\n" +
            "            }\n" +
            "            Intent intent = getIntent();\n" +
            "            TaskStackBuilder stackBuilder = TaskStackBuilder.create(getApplicationContext());\n" +
            "            stackBuilder.addNextIntent(intent);\n" +
            "            PendingIntent pendingIntent = stackBuilder.getPendingIntent(001, PendingIntent.FLAG_UPDATE_CURRENT);\n" +
            "            if (manager != null) {\n" +
            "                manager.notify(notifyid, builder.build());\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "        public void Imagenotification() {\n" +
            "            int notifyid=004;\n" +
            "            NotificationCompat.BigPictureStyle bigPictureStyle=new NotificationCompat.BigPictureStyle();\n" +
            "            bigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher_background)).build();\n" +
            "            Intent intent=getIntent();\n" +
            "\n" +
            "            PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,0);\n" +
            "            NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);\n" +
            "            NotificationCompat.Builder builder=new NotificationCompat.Builder(this)\n" +
            "                    .setSmallIcon(R.mipmap.ic_launcher_round)\n" +
            "                    .setContentTitle(\"Android Learning\")\n" +
            "                   .addAction(android.R.drawable.ic_menu_share,\"Share\",pendingIntent)\n" +
            "                    .setStyle(bigPictureStyle);\n" +
            "            builder.setContentIntent(pendingIntent);\n" +
            "            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {\n" +
            "                String channelId = \"1\";\n" +
            "                String channelName_1 = \"channel1\";\n" +
            "                NotificationChannel channel = new NotificationChannel(channelId, channelName_1, NotificationManager.IMPORTANCE_DEFAULT);\n" +
            "                channel.enableLights(true);\n" +
            "                channel.setLightColor(Color.RED);\n" +
            "                channel.enableVibration(true);\n" +
            "                channel.setShowBadge(true);\n" +
            "                builder.setChannelId(channelId);\n" +
            "                if (manager != null) {\n" +
            "                    manager.createNotificationChannel(channel);\n" +
            "                }\n" +
            "            }\n" +
            "                else {\n" +
            "                    builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_LIGHTS|Notification.DEFAULT_VIBRATE);\n" +
            "                }\n" +
            "\n" +
            "                if(manager!=null){\n" +
            "                    manager.notify(notifyid,builder.build());\n" +
            "                }\n" +
            "\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "\n"
            ;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}

