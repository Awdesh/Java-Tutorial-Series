package ClassesAndObjects;

import Methods.MethodVideo;

public class Video extends MethodVideo {
    String title = "Sample Title";

    String description = "Sample Description";

    int duration = 5;

    boolean published = false;

    char letter = 'A';

    long val = 53265783212346378L;

    float f = 2.50F;

    double d = 2.25;

    int[] myColllection = new int[5];

    int[] newArray = new int[] {5,10,15,20,25};

    public void play() {
        System.out.println("Playing the video");
        MethodVideo mv = new MethodVideo();
    }

    public void stop() {
        System.out.println("Stopping the video");
    }


}

















/*


To add to all the wonderful answers here

First of all float and double are both used for representation of numbers fractional numbers. So, the difference between the two stems from the fact with how much precision they can store the numbers.

    For example: I have to store 123.456789 One may be able to store only 123.4567 while other may be able to store the exact 123.456789.

So, basically we want to know how much accurately can the number be stored and is what we call precision.

Quoting @Alessandro here

    The precision indicates the number of decimal digits that are correct, i.e. without any kind of representation error or approximation. In other words, it indicates how many decimal digits one can safely use.

Float can accurately store about 7-8 digits in the fractional part while Double can accurately store about 15-16 digits in the fractional part

So, float can store double the amount of fractional part. That is why Double is called double the float
Share
Improve this answer

 */
