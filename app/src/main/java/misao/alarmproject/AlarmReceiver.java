package misao.alarmproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by Sonu on 1/23/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Wake Up Wake up",Toast.LENGTH_LONG).show();
        Uri alarmURi = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        if(alarmURi == null)
        {
            alarmURi = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context,alarmURi);
        ringtone.play();
    }
}
