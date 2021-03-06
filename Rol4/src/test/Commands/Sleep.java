package test.Commands;
import java.util.List;

public class Sleep implements Command
{
    @Override
    public void doCommand(List<String> str) {
        try {
            Thread.sleep(Long.parseLong(str.get(0)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

}
