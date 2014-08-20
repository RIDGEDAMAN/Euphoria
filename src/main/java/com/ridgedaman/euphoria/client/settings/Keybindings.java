package com.ridgedaman.euphoria.client.settings;

import com.ridgedaman.euphoria.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings {

    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_F, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_V, Names.Keys.CATEGORY);
}
