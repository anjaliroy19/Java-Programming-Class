/**
 * CourseGrades Demo
 * @author Todd Pickell CISS 238
 * Chapter 9
 * Programming Challenge 5 pg 640
 */

/**
 *  Relatable interface 
 */

public interface Relatable
{
   boolean equals(GradeActivity g);
   boolean isGreater(GradeActivity g);
   boolean isLess(GradeActivity g);
}