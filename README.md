paho-for-android
================
For What?

The android phone would stay asleep mode if long time not operate. The paho for mqtt would lose the connection with the server.
We have to modify the paho code, and make it could send a ping at any time. 
Em, call the method of MqttClient.nnnn() would send a ping to server. 

I have tested it, and it seems no problem. Welcomes to report the bug for me at chinesejie#qq.com

If you take my code for your project, remember to build the AlarmManager to start the method of nnnn().


Another way...
By using foreground service, this kind of service in android will not be killed.  the most important, it will still run while android phone sleep.

Tn run the project, firstly build a MQTT server, change the ip on PublishServer.java.     

---
