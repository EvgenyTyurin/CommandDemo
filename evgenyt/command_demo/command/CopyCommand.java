package evgenyt.command_demo.command;

import evgenyt.command_demo.Editor;

/**
 * Copy TextArea selection to clipboard
 */

public class CopyCommand extends Command {
    public CopyCommand(Editor controller) {
        super(controller);
    }

    @Override
    public void execute() {
        super.execute();
        controller.setClipboard(controller.getTextArea().getSelectedText());
    }
}
