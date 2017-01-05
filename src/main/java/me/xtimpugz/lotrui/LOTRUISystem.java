package me.xtimpugz.lotrui;

import org.terasology.entitySystem.entity.EntityManager;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.input.ButtonState;
import org.terasology.network.ClientComponent;
import org.terasology.registry.In;
import org.terasology.rendering.nui.NUIManager;

/**
 * Created by jove on 2/01/2017.
 */
@RegisterSystem
public class LOTRUISystem extends BaseComponentSystem {

    @In
    private EntityManager entityManager;

    @In
    private NUIManager nuiManager;

    @ReceiveEvent(components = ClientComponent.class)
    public void onToggleChat(LOTRUIButton event, EntityRef entity) {
        if (event.getState() == ButtonState.DOWN) {
            nuiManager.pushScreen("LOTRUI");
            event.consume();
        }
    }
}
