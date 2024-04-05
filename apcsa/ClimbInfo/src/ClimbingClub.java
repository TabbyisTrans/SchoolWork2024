import java.util.ArrayList;
import java.util.List;

class ClimbInfo
{
    private String name;
    private int time;

    /**
     * Creates a ClimbInfo object with name peakName and time climbTime.
     *
     * @param peakName the name of the mountain peak
     * @param climbTime the number of minutes taken to complete the climb
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        name = peakName;
        time = climbTime;
    }

    /**
     * @return the name of the mountain peak
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the number of minutes taken to complete the climb
     */
    public int getTime()
    {
        return time;
    }

    public String toString()
    {
        return "Peak name: " + name + " time: " + time;
    }
}

public class ClimbingClub
{
    /**
     * The list of climbs completed by members of the club. Guaranteed not to be
     * null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /**
     * Adds a new climb with name peakName and time climbTime to the list of climbs
     * in order by name
     *
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime) {
        boolean placed = false;
        if (climbList.size() == 0)
        {
            climbList.add(0, new ClimbInfo(peakName,climbTime));
            placed = true;
        }
        for (int i = 0; i< climbList.size() && !placed;i++)
        {
            if (peakName.compareTo(climbList.get(i).getName())<0)
            {
                climbList.add(i,new ClimbInfo(peakName,climbTime));
                placed = true;
            }
                              
        }
        if (!placed)
        {
            climbList.add(new ClimbInfo(peakName,climbTime));
        }
    }

    public String toString()
    {
        String output = "";
        for (ClimbInfo info : climbList)
        {
            output = output + info.toString() + "\n";
        }
        return output;
    }

    public static void main(String[] args)
    {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println(
                "The order printed above should be Algonquin, Monadnock,"
                   + " Monadnock, Whiteface");
    }
}

