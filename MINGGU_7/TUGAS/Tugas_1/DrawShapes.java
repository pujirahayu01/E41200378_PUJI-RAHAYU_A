
package Tugas_1;

import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init(){
    // the donr is arial size, 18 and is italicix=zed
    font = new Font("Arial", Font.ITALIC,18);
    
    //some color are predefined in the color class
    redColor = Color.red;
    backgroundColor = Color.orange;
    
    //COlor can be created using red , green , blue , blue values
    blueColor = new Color(0,0,122); //semakin tinggi angka belakang , semakin cerah warna persegi yang ad lingkarannya
    
    // set the background color of the applet
    setBackground(backgroundColor);
    }
    
    public void stop(){
    }
     public void paint (Graphics graph){
     graph.setFont(font);
     //create a title
     graph.drawString("Draw Shapes", 90, 50);//angka 90 menunjukkan: semakin besar maka se
                                           // makin ke tengah tulisannya
    // set the color for the first shape
    graph.setColor(blueColor);
    
    // Draw a rectangle using drawRect(int x, int y, int width, int height
    graph.drawRect(120, 120, 120, 120); // ini persegi yang gaada warnanya.dua angka terakhir 
                                        //menentukan besar kecil gambar(120,120) (120,120)<= ini
    
    // this will fill a rectangle
    graph.fillRect(115, 115, 90, 90);// angka kedua itu untuk mengatur letak dari perseginya 
                                                //yng warna biru tua
    //angka 90 x 90 berfungsi mengatur lebar dari persegi
    //set the color for the next shape
    graph.setColor(redColor);
    
    // draw sircle using drawArc(int x, int y , int width, int height, int startAngle, int arcAngle
    graph.fillArc(110, 110, 50, 50, 0, 360); 
    
    // set color for next shapee
    graph.setColor(Color.CYAN);
    
    // draw another rectangle
    graph.drawRect(50,50,50,50);
    // this will fill a rectangle
    graph.fillRect(50, 50, 60, 60);
     }
}

