package maes.tech.intentanim;

import android.app.Activity;
import android.content.Context;

import com.tech.intentanim.R;

/**
 * Created by Elnur Hajiyev on 3/7/2018.
 */

public class CustomIntent {
    public static String[] types = {
            "",
            "",
            
    };

    public static void customType(Context context, String animtype){
        Activity act = (Activity)context;
        switch (animtype){
            case "left-to-right":
                act.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                break;
            case "right-to-left":
                act.overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
                    break;
            case "bottom-to-up":
                act.overridePendingTransition(R.anim.bottom_to_up, R.anim.up_to_bottom);
                break;
            case "up-to-bottom":
                act.overridePendingTransition(R.anim.up_to_bottom2, R.anim.bottom_to_up2);
                break;
            case "fadein-to-fadeout":
                act.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case "rotateout-to-rotatein":
                act.overridePendingTransition(R.anim.rotatein_out, R.anim.rotateout_in);
                break;
                default:
                    break;

        }
    }
}
