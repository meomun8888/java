package mystack;

public class Algorithm {

    public boolean isPerfect(int x)
    {
        int sum = 1;

        for (int i = 2; i * i <= x; i++)
        {
            if (x % i==0)
            {
                if(i * i != x)
                    sum +=  i + x / i;
                else
                    sum += i;
            }
        }
        if (sum == x && x != 1)
            return true;

        return false;
    }
}
