public class Hackerrank {

    public static String timeConversion(String s) {
        // Write your code here

        int temp=0;
        StringBuilder str = new StringBuilder();
//        System.out.println(s.substring(0, 2));

        if(s.startsWith("PM", 8))
        {
            if(!s.startsWith("12"))
            {
                temp = Integer.parseInt(s.substring(0,2));
                temp+=12;
            }
            else
            {
                temp=12;
            }
            str.append(temp);
        }
        else {

            if(!s.startsWith("12"))
            {
               str.append(s,0,2);

            }
            else
            {
                str.append("00");

            }


        }

        str.append(s, 2, 8);
//        System.out.println(str);

        String s1= String.valueOf(str);

        return s1;
    }
    public static void main(String []args)
    {

        timeConversion( "01:00:00PM");
        timeConversion( "02:00:00PM");
        timeConversion( "03:00:00PM");
        timeConversion( "04:00:00PM");
        timeConversion( "05:00:00PM");
        timeConversion( "06:00:00PM");
        timeConversion( "07:00:00PM");
        timeConversion( "08:00:00PM");
        timeConversion( "09:00:00PM");
        timeConversion( "10:00:00PM");
        timeConversion( "11:00:00PM");
        timeConversion( "12:00:00PM");
        timeConversion( "01:00:00AM");
        timeConversion( "02:00:00AM");
        timeConversion( "03:00:00AM");
        timeConversion( "04:00:00AM");
        timeConversion( "05:00:00AM");
        timeConversion( "06:00:00AM");
        timeConversion( "07:00:00AM");
        timeConversion( "08:00:00AM");
        timeConversion( "09:00:00AM");
        timeConversion( "10:00:00AM");
        timeConversion( "11:00:00AM");
        timeConversion( "12:40:00AM");



    }
}
