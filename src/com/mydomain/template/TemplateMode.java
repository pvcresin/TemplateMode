package com.mydomain.template;

import java.io.File;

import processing.app.Base;
import processing.app.ui.Editor;
import processing.app.ui.EditorState;
import processing.app.Mode;
import processing.mode.java.JavaMode;

/**
 * Mode Template for extending Java mode in Processing IDE 3.0 or later.
 */
public class TemplateMode extends JavaMode {
    public TemplateMode(Base base, File folder) {
        super(base, folder);
    }

    /**
     * Return the pretty/printable/menu name for this mode.
     */
    @Override
    public String getTitle() {
        return "Template";
    }

    /**
     * Create a new editor associated with this mode.
     */
    /*
    @Override
    public Editor createEditor(Base base, String path, EditorState state) {
        return null;
    }
    */

    /**
     * Returns the default extension for this editor setup.
     */
    /*
    @Override
    public String getDefaultExtension() {
        return null;
    }
    */

    /**
     * Returns a String[] array of proper extensions.
     */
    /*
    @Override
    public String[] getExtensions() {
        return null;
    }
    */

    /**
     * Get array of file/directory names that needn't be copied during "Save
     * As".
     */
    /*
    @Override
    public String[] getIgnorable() {
        return null;
    }
    */
}
