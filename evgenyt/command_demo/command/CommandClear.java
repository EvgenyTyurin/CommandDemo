package evgenyt.command_demo.command;

import evgenyt.command_demo.Editor;

/**
 * Clear all text in TextArea
 */

public class CommandClear extends Command {
    public CommandClear(Editor controller) {
        super(controller);
    }

    @Override
    public void execute() {
        super.execute();
        controller.getTextArea().clear();
    }
}
