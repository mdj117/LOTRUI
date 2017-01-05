package me.xtimpugz.lotrui;

import org.terasology.engine.Time;
import org.terasology.registry.In;
import org.terasology.rendering.nui.CoreScreenLayer;
import org.terasology.rendering.nui.widgets.UIButton;
import org.terasology.rendering.nui.widgets.UIText;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by jove on 2/01/2017.
 */
public class LOTRUI extends CoreScreenLayer {
    private UIText infoArea;
    private UIButton updateInfoButton;
    private List<String> texts = new ArrayList();
    @In
    private Time time;

    private ListIterator<String> iter;

    @Override
    public void initialise() {

        infoArea = find("infoArea", UIText.class);
        updateInfoButton = find("updateInfoButton", UIButton.class);
        texts.add("LOTRModule is an open-source Terasology module! Feel free to contribute!");
        texts.add("Choose a faction to get started!");
        texts.add("Gain alignment to be able to trade with faction units!");
        iter = texts.listIterator();
        if (updateInfoButton != null) {
            updateInfoButton.subscribe(button -> {
                final double bytesInMegabyte = 1048576.0;
                double memoryUsage = ((double) Runtime.getRuntime().totalMemory() - (double) Runtime.getRuntime().freeMemory()) / bytesInMegabyte;

                if(iter.hasNext()) infoArea.setText(iter.next());
                else {
                    while(iter.hasPrevious()){
                        infoArea.setText(iter.previous());
                    }
                }
            });
        }
    }
}
