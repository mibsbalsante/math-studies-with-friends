class stats{
  public static double mean(double[] m) {
      double sum = 0;
      for (int i = 0; i < m.length; i++) {
          sum += m[i];
      }
      return sum / m.length;
  }
  // the array double[] m MUST BE SORTED
  public static double median(double[] m) {
      int middle = m.length/2;
      if (m.length%2 == 1) {
          return m[middle];
      } else {
          return (m[middle-1] + m[middle]) / 2.0;
      }
  }
  public static int mode(int a[]) {
      int maxValue, maxCount;

      for (int i = 0; i < a.length; ++i) {
          int count = 0;
          for (int j = 0; j < a.length; ++j) {
              if (a[j] == a[i]) ++count;
          }
          if (count > maxCount) {
              maxCount = count;
              maxValue = a[i];
          }
      }

      return maxValue;
  }
public static void main(Strring args[])
{
  stats st=new stats();
  st.mean([1,3,51,2,12]);
  st.median([1,4,6,7,9]);
  st.mode(12,41,2,4,5);
}
}
