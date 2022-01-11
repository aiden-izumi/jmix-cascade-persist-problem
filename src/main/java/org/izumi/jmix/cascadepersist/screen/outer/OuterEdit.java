package org.izumi.jmix.cascadepersist.screen.outer;

import io.jmix.ui.screen.*;
import org.izumi.jmix.cascadepersist.entity.Outer;

@UiController("jmcape_Outer.edit")
@UiDescriptor("outer-edit.xml")
@EditedEntityContainer("outerDc")
public class OuterEdit extends StandardEditor<Outer> {

    @Subscribe
    private void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        int debug = 4;
    }
}
