package com.utsusynth.utsu.view.config;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ThemePreferencesEditor extends PreferencesEditor {
    private String displayName = "Theme";
    private BorderPane view;

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    protected void setDisplayNameInternal(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public BorderPane getView() {
        return view;
    }

    @Override
    protected void setViewInternal(BorderPane view) {
        this.view = view;
    }

    @Override
    protected Pane initializeInternal() {
        return new Pane();
    }
}