package evgenyt.command_demo.command;

import evgenyt.command_demo.Editor;

public abstract class Command {
    Editor controller;
    private String backup;

    Command(Editor controller) {
        this.controller = controller;
    }

    /** This only backups and must be override with more concrete actions */
    public void execute() {
        backup = controller.getTextArea().getText();
    }

    public String getBackup() {
        return backup;
    }
}
