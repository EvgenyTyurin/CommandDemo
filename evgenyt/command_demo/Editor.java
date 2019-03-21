package evgenyt.command_demo;

import evgenyt.command_demo.command.Command;
import evgenyt.command_demo.command.CommandClear;
import evgenyt.command_demo.command.CopyCommand;
import evgenyt.command_demo.command.PasteCommand;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import java.util.Stack;

/**
 * Editor (Text Area + buttons, clipboard, command history)
 */

public class Editor {

    @FXML
    private TextArea textArea;
    private Stack<Command> commandHistory = new Stack<>();
    private String clipboard = "";

    /** Clear button clicked */
    @FXML
    private void clear() {
        executeCommand(new CommandClear(this));
    }

    /** Execute command and push it to command history */
    private void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    /** Button undo pressed */
    @FXML
    private void undo() {
        if (!commandHistory.empty()) {
            Command command = commandHistory.pop();
            textArea.setText(command.getBackup());
        }
    }

    /** Button copy pressed */
    @FXML
    private void copy() {
        executeCommand(new CopyCommand(this));
    }

    /** Button paste pressed */
    @FXML
    private void paste() {
        executeCommand(new PasteCommand(this));
    }

    public TextArea getTextArea() {
        return textArea;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

}
