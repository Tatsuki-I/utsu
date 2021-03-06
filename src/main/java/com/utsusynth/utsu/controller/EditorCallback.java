package com.utsusynth.utsu.controller;

import com.utsusynth.utsu.controller.UtsuController.CheckboxType;
import javafx.beans.property.BooleanProperty;

import java.io.File;

public interface EditorCallback {
    /**
     * Mark whether editor has unsafe changes or not.
     */
    void markChanged(boolean hasUnsavedChanges);

    /**
     * Open voicebank for edit in a new tab.
     */
    void openVoicebank(File location);

    /**
     * Open voicebank in a new tab and highlight a specific lyric config.
     */
    void openVoicebank(File location, String trueLyric);

    /**
     * Fetches the value of any global checkbox menu item.
     */
    BooleanProperty getCheckboxValue(CheckboxType checkboxType);
}
