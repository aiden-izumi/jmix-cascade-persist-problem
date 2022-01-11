package org.izumi.jmix.cascadepersist.screen.outer;

import io.jmix.ui.screen.*;
import org.izumi.jmix.cascadepersist.entity.Outer;

@UiController("jmcape_Outer.browse")
@UiDescriptor("outer-browse.xml")
@LookupComponent("outersTable")
public class OuterBrowse extends StandardLookup<Outer> {
}
