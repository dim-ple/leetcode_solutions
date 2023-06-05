/* This program takes the list of coordinates as input. Each element of the list is a two-element list that represents the x and y coordinates of a point. 
 * It then extracts the first two points from the list of coordinates.
 * The function then iterates over the rest of the points in the list. For each point, it checks whether the point is on the same line as the first two points.
 * The check is done by comparing the slopes of the lines connecting the first point to the second point and the first point to the current point. 
 * If the slopes are the same, then the points are on the same line. This is done using the cross product formula, which avoids the division by zero issue.
 * Instead of calculating the slope as (y2 - y1) / (x2 - x1), the function calculates (x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1). 
 * This equation is based on the equality of slopes (y2 - y1) / (x2 - x1) = (y3 - y1) / (x3 - x1), which is cross-multiplied to avoid division.
 * If for any point, the equality does not hold, then the function immediately returns False, meaning that the points do not all lie on the same line.
 * If the function gets through all of the points without returning False, then it returns True, indicating that all points do lie on the same line. */


public class CheckIfLineIsStraight {

    public boolean checkStraightLine(int[][] coordinates) {

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {

            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((x - x0)*(y1 - y0) != (y - y0) * (x1 - x0)){
                return false;
            }
        }
        
        return true;
        
    }
}
