package me.xtimpugz.lotrui;

import org.lwjgl.input.Keyboard;
import org.terasology.input.BindButtonEvent;
import org.terasology.input.DefaultBinding;
import org.terasology.input.InputType;
import org.terasology.input.RegisterBindButton;

/**
 * Created by jove on 2/01/2017.
 */
@RegisterBindButton(id = "openJournal", description = "Open journal", category = "interaction")
@DefaultBinding(type = InputType.KEY, id = Keyboard.KEY_J)
public class LOTRUIButton extends BindButtonEvent {
}
