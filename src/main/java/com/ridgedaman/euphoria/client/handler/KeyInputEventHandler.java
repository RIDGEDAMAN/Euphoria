package com.ridgedaman.euphoria.client.handler;

import com.ridgedaman.euphoria.client.settings.Keybindings;
import com.ridgedaman.euphoria.reference.Key;
import com.ridgedaman.euphoria.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {

    private static Key getPressedKeyBinding(){

        if(Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if(Keybindings.release.isPressed()){
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){

        LogHelper.info(getPressedKeyBinding());
    }
}