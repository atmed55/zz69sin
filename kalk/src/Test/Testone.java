package Test; 
import org.junit.Test; 
import junit.framework.Assert; 
import star.star; 
public class Testone { 
@Test 
public void testone(){ 
star k = new star(); 
float A=k.Calculation(1, 3840, 2160, 32, 120, 30); 
if(A!=113906.25)Assert.fail(); 
}}