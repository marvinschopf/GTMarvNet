package de.marvnet.gtmarvnet.models;

/*

    Author: marvin
    Date: 26.01.18 at 14:34
    Project: GTMarvNet
    Package: de.marvnet.gtmarvnet.models

*/

public abstract class Model {

    private static int lp = 100;


    public static int getLP() {
        return lp;
    }

    public static void setLP(int livepoints) {
        lp = livepoints;
    }

    public Model() {
        this.setLP(100);
    }

    public Model(int livep) {
        this.setLP(livep);
    }

}
