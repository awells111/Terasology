package org.terasology.config;

import java.util.List;

public class WebBrowserConfig {

    //todo Create a new section in config.cfg and initialize safeSites

    /**
     * Websites that load without confirmation as authorized by the user
     */
    private List<String> safeSites;

    public List<String> getSafeSites() {
        return safeSites;
    }

    public void setSafeSites(List<String> safeSites) {
        this.safeSites = safeSites;
    }
}
