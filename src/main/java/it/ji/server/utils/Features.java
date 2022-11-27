package it.ji.server.utils;

public enum Features {

    EXPERIMENTAL("experimental");

    private Features(String featureName) {
        this.featureName = featureName;
    }

    public String getFeatureName() {
        return featureName;
    }

    private String featureName;
}
