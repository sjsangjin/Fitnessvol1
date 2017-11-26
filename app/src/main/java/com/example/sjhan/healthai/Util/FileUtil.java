package com.example.sjhan.healthai.Util;

import android.content.Context;

import com.example.sjhan.healthai.Bean.MachineBean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by sjhan on 2017-11-26.
 */

public class FileUtil {
    public static void setMachineBean(Context context, MachineBean machineBean){
        try {
            FileOutputStream fos = context.openFileOutput(MachineBean.class.getName(), Context.MODE_PRIVATE);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(machineBean);
            os.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static MachineBean getMachineBean(Context context){
        MachineBean machineBean = null;
        try{
            FileInputStream fis = context.openFileInput(MachineBean.class.getName());
            ObjectInputStream is = new ObjectInputStream(fis);
            machineBean = (MachineBean) is.readObject();
            is.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return machineBean;
    }

}