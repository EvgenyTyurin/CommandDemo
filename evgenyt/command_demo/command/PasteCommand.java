package evgenyt.command_demo.command;

import evgenyt.command_demo.Editor;

/**
 * Paste from clipboard to TextArea
 */

public class PasteCommand extends Command{
    public PasteCommand(Editor controller) {
        super(controller);
    }

    @Override
    public void execute() {
        super.execute();
        controller.getTextArea().setText(controller.getTextArea().getText() +
                controller.getClipboard());
    }
}
