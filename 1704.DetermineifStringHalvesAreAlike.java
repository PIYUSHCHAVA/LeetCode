
public class Main
{
	//1704 Determine if String Halves Are A like 
    public boolean halvesAreAlike(String s) 
    {
     int count1=0;
     int count2=0;
     //convert the String to lowercase
     s=s.toLowerCase();

     //Iterate through the first half of the String andd count vowel
     for(int i=0; i<s.length()/2; i++)
     {
         if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
         {
             count1++;
         }
     }
     //Iterate through for second half of the String and count vowel
     for(int i=s.length()/2; i<s.length(); i++)
     {
          if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
         {
             count2++;
         }
     }
     //check if count1 is  equal to count2
     return count1 == count2;
    }
    public static void main(String []args)
    {
     Main mainObject = new Main();

        // Test cases
        String s1 = "book";
        System.out.println("Is halves alike for '" + s1 + "': " + mainObject.halvesAreAlike(s1));
         String s2 = "text";
        System.out.println("Is halves alike for '" + s2 + "': " + mainObject.halvesAreAlike(s2));
    }

}
