package org.example.day4._3_strings;

public class StringExercises {
    /* EXERCISE 9
       Prefix the param with 'Good job, '

       goodJob("Anna")          -> "Good job, Anna!"
       goodJob("my friend")     -> "Good job, my friend!"
       goodJob("XYZ")           -> "Good job, XYZ!"
       goodJob("Indiana Jones") -> "Good job, Indiana Jones!"

    */
    String goodJob(String name) {
        return "Good job, " + name + "!";
    }


    /*EXERCISE 10

       If String is even length, return first half x2. Else return original String.

       doubleFirstHalf("HeyYou")   -> "HeyHey"
       doubleFirstHalf("12345678") -> "12341234"
       doubleFirstHalf("M")        -> "M"
       doubleFirstHalf("panda")    -> "panda"
    */


    /*

    string is 0 indexed
    A substring is used to create a smaller string from the bigger one
    We said if the length is divisible by 2 without a remainder ->> even
    str.substring(beginIndex, endIndex)
    then half of the string is going to = substring(starting  at 0 index --> half of the string length ( Hey
    then we want to return first half x2 = half + half

    */

    String doubleFirstHalf(String str) {
        if (str.length() % 2 == 0) {
            String half = str.substring(0, str.length() / 2);
            return half + half;
        }
        return str;
    }

    /* EXERCISE 11

        interlace("A", "B")      -> "ABABA"
        interlace("Sun", "Moon") -> "SunMoonSunMoonSun"
        interlace("blue", "red") -> "blueredblueredblue"
        interlace("Hi", "Ciao")  -> "HiCiaoHiCiaoHi"
     */
    String interlace(String a, String b) {
        return a + b + a + b + a;
    }

    /* EXERCISE 12

        cutEnds("Java")  -> "av"
        cutEnds("koala") -> "oal"
        cutEnds("XX")    -> ""
        cutEnds("a")     -> ""
     */

    //  We can say, if the length of the string is less than  2, lets  not perform an action
    // i.e., We leave it empty since nothing is available to chop("")

    String cutEnds(String str) {
        int length = str.length();

        if (length < 2) {
            return "";}

            // But if length is greater than 2 we want to perform the chopping action
            // we can use the substring syntax to chop string; say the beginning is index 1, and the end index= string length
            // for last index

            return (str.substring(1, length - 1));}


    /*EXERCISE 13

       addTags("smile", "i")        -> <i>smile</i>
       addTags("777666555", "phone" -> <phone>777666555</phone>
       addTags("welcome", "header"  -> <header>welcome</header>
     */
    String addTags(String word, String tag) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*EXERCISE 14

       copyLastChars("computer") -> "ter ter"
       copyLastChars("ABCD")     -> "BCD BCD"
       copyLastChars("Hi")       -> "Hi Hi"
       copyLastChars("Amazing")  -> "ing ing"
     */


    String copyLastChars(String str) {

        int length = str.length();

    //if the length of the string is less than 3, then  return the entire string length
        if (length< 3) {
            return str + " " + str;
        }

    //if string characters are >3 then return the end  which is defined as
        String end = str.substring(length-3,length);

        //return the end
        return end + " " + end;
    }
}

