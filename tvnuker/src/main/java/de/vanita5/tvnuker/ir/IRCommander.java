package de.vanita5.tvnuker.ir;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.widget.Toast;

public class IRCommander {

    private final ConsumerIrManager manager;
    private Context context;

    public IRCommander(Context context) {
        this.context = context;
        this.manager = (ConsumerIrManager) context.getSystemService(Context.CONSUMER_IR_SERVICE);
    }

    public boolean init() {
        if(manager.hasIrEmitter()) {
            Toast.makeText(context, "Device is supported", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(context, "Device is not supported", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
