package com.Learning.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {
    TextView textView,textView1,textView2,textView3,textView4,cp,txt_services,txt_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        textView=(TextView)findViewById(R.id.text);
        textView1=(TextView)findViewById(R.id.text1);
        textView2=(TextView)findViewById(R.id.text2);
        textView3=(TextView)findViewById(R.id.text3);
        textView4=(TextView)findViewById(R.id.text4);
        txt_services=(TextView)findViewById(R.id.txt_services);
        txt_activity=(TextView)findViewById(R.id.txt_activity);
        cp=(TextView)findViewById(R.id.cp);
        textView1.setText("•\tBasic\n" +
                "•\tAdvance\n" +
                "•\tImplementation\n");
        textView2.setText("•\tReference\n" +
                "•\tXml\n" +
                "•\tJava\n" +
                "•\tDemo\n");
        textView3.setText("•\tHow to create\n" +
                "•\tWhere to create\n" +
                "•\tWhere to implement\n" +
                "•\tWhere to change \n" +
                "•\tWhere to include\n");
        textView4.setText("•\tActivities\n" +
                "•\tServices\n" +
                "•\tBroadcast receivers\n" +
                "•\tContent providers\n");
        cp.setText("    A content provider manages a shared set of app data that you can store in the file system, in a SQLite database, on the web, or on any other persistent storage location that your app can access. Through the content provider, other apps can query or modify the data if the content provider allows it. For example, the Android system provides a content provider that manages the user's contact information. As such, any app with the proper permissions can query the content provider, such as Contacts Contract Data, to read and write information about a particular person. It is tempting to think of a content provider as an abstraction on a database, because there is a lot of API and support built in to them for that common case. However, they have a different core purpose from a system-design perspective. To the system, a content provider is an entry point into an app for publishing named data items, identified by a URI scheme. Thus an app can decide how it wants to map the data it contains to a URI namespace, handing out those URIs to other entities which can in turn use them to access the data. There are a few particular things this allows the system to do in managing an app:\n" +
                "•\tAssigning a URI doesn't require that the app remain running, so URIs can persist after their owning apps have exited. The system only needs to make sure that an owning app is still running when it has to retrieve the app's data from the corresponding URI.\n" +
                "•\tThese URIs also provide an important fine-grained security model. For example, an app can place the URI for an image it has on the clipboard, but leave its content provider locked up so that other apps cannot freely access it. When a second app attempts to access that URI on the clipboard , the system can allow that app to access the data via a temporary URI permission grant so that it is allowed to access the data only behind that URI, but nothing else in the second app.\n" +
                "Content providers are also useful for reading and writing data that is private to your app and not shared.\n" +
                "A content provider is implemented as a subclass of Content Provider and must implement a standard set of APIs that enable other apps to perform transactions. For more information, see the Content Providers developer guide.\n" +
                "A unique aspect of the Android system design is that any app can start another app’s component. For example, if you want the user to capture a photo with the device camera, there's probably another app that does that and your app can use it instead of developing an activity to capture a photo yourself. You don't need to incorporate or even link to the code from the camera app. Instead, you can simply start the activity in the camera app that captures a photo. When complete, the photo is even returned to your app so you can use it. To the user, it seems as if the camera is actually a part of your app.\n" +
                "When the system starts a component, it starts the process for that app if it's not already running and instantiates the classes needed for the component. For example, if your app starts the activity in the camera app that captures a photo, that activity runs in the process that belongs to the camera app, not in your app's process. Therefore, unlike apps on most other systems, Android apps don't have a single entry point (there's no main() function).\n" +
                "Because the system runs each app in a separate process with file permissions that restrict access to other apps, your app cannot directly activate a component from another app. However, the Android system can. To activate a component in another app, deliver a message to the system that specifies your intent to start a particular component. The system then activates the component for you.\n");
        txt_services.setText("  A service is a general-purpose entry point for keeping an app running in the background for all kinds of reasons. It is a component that runs in the background to perform long-running operations or to perform work for remote processes. A service does not provide a user interface. For example, a service might play music in the background while the user is in a different app, or it might fetch data over the network without blocking user interaction with an activity. Another component, such as an activity, can start the service and let it run or bind to it in order to interact with it. There are actually two very distinct semantics services tell the system about how to manage an app: Started services tell the system to keep them running until their work is completed. This could be to sync some data in the background or play music even after the user leaves the app. Syncing data in the background or playing music also represent two different types of started services that modify how the system handles them:\n" +
                "•\tMusic playback is something the user is directly aware of, so the app tells the system this by saying it wants to be foreground with a notification to tell the user about it; in this case the system knows that it should try really hard to keep that service's process running, because the user will be unhappy if it goes away.\n" +
                "•\tA regular background service is not something the user is directly aware as running, so the system has more freedom in managing its process. It may allow it to be killed (and then restarting the service sometime later) if it needs RAM for things that are of more immediate concern to the user.\n" +
                "Bound services run because some other app (or the system) has said that it wants to make use of the service. This is basically the service providing an API to another process. The system thus knows there is a dependency between these processes, so if process A is bound to a service in process B, it knows that it needs to keep process B (and its service) running for A. Further, if process A is something the user cares about, then it also knows to treat process B as something the user also cares about. Because of their flexibility (for better or worse), services have turned out to be a really useful building block for all kinds of higher-level system concepts. Live wallpapers, notification listeners, screen savers, input methods, accessibility services, and many other core system features are all built as services that applications implement and the system binds to when they should be running.\n" +
                "A service is implemented as a subclass of Service. For more information about the Service class, see the Services developer guide.\n");
        txt_activity.setText("•\tKeeping track of what the user currently cares about (what is on screen) to ensure that the system keeps running the process that is hosting the activity.\n" +
                "•\tKnowing that previously used processes contain things the user may return to (stopped activities), and thus more highly prioritize keeping those processes around.\n" +
                "•\tHelping the app handle having its process killed so the user can return to activities with their previous state restored.\n" +
                "•\tProviding a way for apps to implement user flows between each other, and for the system to coordinate these flows. (The most classic example here being share.)\n" +
                "You implement an activity as a subclass of the Activity class. For more information about the Activity class, see the Activities developer guide.\n");
    }
}
