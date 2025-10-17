// Strings 

//Problem 1: Find shortest path distance from origin after directional moves
public class Day18 {
    public static float shortestPath(String pattern) {
        int x = 0;  // x-coordinate
        int y = 0;  // y-coordinate
        
        for(int i = 0; i < pattern.length(); i++) {
            char dir = pattern.charAt(i);
            
            // Use switch instead of if-else chain
            switch(dir) {
                case 'N':  // North
                    y++;
                    break;
                case 'S':  // South
                    y--;
                    break;
                case 'E':  // East
                    x++;
                    break;
                case 'W':  // West
                    x--;
                    break;
            }
        }
        
        // Calculate shortest distance using Pythagorean theorem
        // Distance = √(x² + y²)
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);
    }
    
    public static void main(String args[]) {
        String pattern = "WNEENESENNN";
        System.out.println("Shortest Path Distance: " + shortestPath(pattern));
    }
}