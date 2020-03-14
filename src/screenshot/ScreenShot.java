/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/**
 *
 * @author Shahryar Khan
 */
public class ScreenShot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here
        
        
          
    Robot robot = new Robot();
   robot.mouseMove(200, 200);
   
   /*
   
 //   robot.keyPress(KeyEvent.VK_A);
  //  robot.keyRelease(KeyEvent.VK_A);
    
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
      robot.mouseWheel(-100);
    */
   
   //screen shot
   
   DateFormat DF = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
   
   try{
    Robot robot1 = new Robot();
     String format = "jpg";
     String fileName = "FullScreenshot_"+DF.format(new Date())+"." + format;

    int x = 100;
    int y = 100;
    int width = 200;
    int height = 200;
    Rectangle area;
    BufferedImage bufferedImage = null;
   // area = new Rectangle(x, y, width, height);
   // bufferedImage = robot.createScreenCapture(area);

    // Capture the whole screen
    area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    
    bufferedImage = robot.createScreenCapture(area);
  //  for(int i=0 ;i<=10;i++){
  
        
  //  }
    ImageIO.write(bufferedImage , format, new File(fileName));
    
   }catch(Exception e)
   {
       System.out.println("error"+e);
   }
        
        
    }
    
}
