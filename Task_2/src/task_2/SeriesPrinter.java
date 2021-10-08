



package task_2;

/*@author sujoy*/

public class SeriesPrinter {
    
    void printSeries(int n)
    {
        System.out.print("PrintSeries(" + n + ") -> ");
        for(int i = 0; i<=n; i++)
        System.out.print(i +" ");
    }

    void printSeries(int startIndex, int endIndex)
    {
        System.out.print("\nPrintSeries(" + startIndex + "," + endIndex + ") -> ");
        for (int i = startIndex; i<=endIndex; i++)
            System.out.print(i+ " ");
    }

    void printSeries(int startIndex, int endIndex,int interval)
    {
        System.out.print("\nPrintSeries(" + startIndex + "," + endIndex + "," + interval + ") -> ");
        for(int i = startIndex; i <= endIndex; i +=interval)
        {
            System.out.print(i + " ");
        }
    }
    
}
