package ControlFlowStatements;

/* Bob is a wall painter and he needs your help.
You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work.
Bob might also have some extra buckets at home.
He also knows the area that he can cover with one bucket of paint.

1. Write a method named getBucketCount with 4 parameters.
The first parameter should be named width of type double. This parameter represents the width of the wall.
The second parameter should be named height of type double. This parameter represents the height of the wall.
The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.
The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method need to return -1 to indicate an invalid value.

2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
Write another overloaded method named getBucketCount with 3 parameters namely width, height and areaPerBucket (all double).

3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
Write another overloaded method named getBucketCount with 2 parameters namely area and areaPerBucket (both double).

 */
public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(31.4,4.5));
        System.out.println(getBucketCount(3.4,4.5,1));
        System.out.println(getBucketCount(3.4,4.5,1.1,2));
        System.out.println(getBucketCount(-1,4.5,1.1,2));
        System.out.println(getBucketCount(1,4.5,1.1,-1));
        System.out.println(getBucketCount(1,4.5,1.1,110));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double buckets = area / areaPerBucket;
        int neededBuckets = (int) Math.ceil(buckets - extraBuckets);
        return neededBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double buckets = Math.ceil(area / areaPerBucket);
        return (int) buckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double buckets = Math.ceil(area / areaPerBucket);
        return (int) buckets;
    }

}