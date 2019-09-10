/**
 * ToDo command is used to create ToDo tasks.
 */
public class ToDoCommand extends Command {
    private String taskName;

    /**
     * Constructor for ToDoCommand class.
     * 
     * @param command takes in the raw commmand
     * @param taskList taskList is used to store tasks
     */
    public ToDoCommand(String command, String taskName, TaskList taskList ){
        super(command, taskList);
        this.taskName = taskName;
    }

    /**
     * Takes in 'dirty' string and cleans it.
     * 
     * @return a string containing the procesedCommand
     */
    @Override
    public String processCommand(){
        return taskName;
    }

    /**
     * Creates a new Todo task and adds that task to the tasklist
     * 
     * @return a String detailing the process (i.e. task added)
     */
    @Override
    public String execute(String processedCommand){
        ToDoTask newTask = new ToDoTask (false, processedCommand);
        String toPrint = taskList.add(newTask);
        return toPrint;
    }
} 