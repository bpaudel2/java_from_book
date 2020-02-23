package OOP.step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor
{
    private boolean open;
    private List<Bark> allowedBark;

    public DogDoor()
    {
        this.open = false;
        this.allowedBark = new ArrayList<Bark>();
    }

    public void addAllowedBark(Bark bark)
    {
        this.allowedBark.add(bark);
    }

    public void open()
    {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            public void run()
            {
                close();
                timer.cancel();
            }
        }, 5000);

    }

    public void close()
    {
        System.out.println("The dog door closes.");
    }

    public boolean isOpen()
    {
        return open;
    }

    public List<Bark> getAllowedBark() {
        return allowedBark;
    }

    public void setAllowedBark(List<Bark> allowedBark) {
        this.allowedBark = allowedBark;
    }



}
