/*
 *
 */

package assignment1;

/**
 *
 * @author Mark Hutchison
 */
public class Assign1_4 {

    public Assign1_4() {
        int a, a2, a3;
        String data;
        
        String header = String.format("%-10s%-10s%-10s", "a", "a^2", "a^3");
        System.out.println(header);
        
        for(int i = 1; i < 4; i++)
        {
            a = i;
            a2 = i * i;
            a3 = i * i * i;
            data = String.format("%-10d%-10d%-10d", a, a2, a3);
            System.out.println(data);
        }
    }
    
    
}
