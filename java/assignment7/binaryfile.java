package assignment7;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class binaryfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        try {
		            // Open the binary file containing the image data
		            FileInputStream fileInputStream = new FileInputStream("image.bin");
		            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		            
		            // Read the image width, height, and pixel data from the binary file
		            int width = dataInputStream.readInt();
		            int height = dataInputStream.readInt();
		            byte[] pixelData = new byte[width * height * 3];
		            dataInputStream.read(pixelData);
		            
		            // Create a BufferedImage object from the pixel data
		            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
		            image.getRaster().setDataElements(0, 0, width, height, pixelData);
		            
		            // Display the image on the screen
		            JFrame frame = new JFrame();
		            JLabel label = new JLabel(new ImageIcon(image));
		            frame.getContentPane().add(label, BorderLayout.CENTER);
		            frame.pack();
		            frame.setVisible(true);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}

