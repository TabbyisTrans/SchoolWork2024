public class App {
    static ArrayList<Integer> arrList = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {
        arrList.add(1);
        arrList.add(2);
        arrList.add(0);
        arrList.add(3);
        arrList.add(2);
        arrList.add(4);
        arrList.add(2);
        arrList.add(1);
        arrList.add(0);
        arrList.add(2);
        arrList.add(0);
        arrList.add(1);
        arrList.add(3);
        arrList.add(2);
    }

    public static int sum()
    {
        int freq = 0;
        for (int a: arrList)
        {
            if (a == 0)
            {
                freq++;
            }
        }
        return freq;
    }

    public static int low()
    {
        int low = arrList.get(0);
        for (int j=1; j < arrList.size(); j++)
        {
            if (arrList.get(j) < low)
            {
                low = arrList.get(j);
            }
        }
        return low;
    }

    public static int avg()
    {
        int sum = 0;
        for (int a: arrList)
        {
            sum += a;
        }
        return sum/arrList.size();
    }

    public static int containsZero()
    {
        int ind = 0;
        boolean zero = false;
        while (!zero && ind < arrList.size())
        {
            
        }
    }
}
