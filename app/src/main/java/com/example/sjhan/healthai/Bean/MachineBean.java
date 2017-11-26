package com.example.sjhan.healthai.Bean;

import java.io.Serializable;

/**
 * Created by sjhan on 2017-11-26.
 */

public class MachineBean implements Serializable {
    public String machineName;

    public MachineBean(String machineName){
        this.machineName = machineName;
    }

    public String  getMachineName(){
        return machineName;
    }

    public void setMachineName(String machineName){
        this.machineName = machineName;
    }



}
