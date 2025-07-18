import java.io.File;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Random {
    public static void main(String[] args) {
        try {

            File file = new File("D:\\QS\\javaPrograms\\random\\chh.jpg");
            BufferedImage originalImage = ImageIO.read(file);

            int newWidth = 200; // Adjust this value to control the width of the output image
            int newHeight = (newWidth * originalImage.getHeight()) / originalImage.getWidth();

            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = resizedImage.createGraphics();
            g2d.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
            g2d.dispose();

            int terminalWidth = 80; // Default terminal width
            try {
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                terminalWidth = screenSize.width / 10; // Approximate terminal width in characters
            } catch (Exception e) {
            }

            int padding = (terminalWidth - newWidth) / 2;

            for (int i = 0; i < resizedImage.getHeight(); i++) {
                for (int p = 0; p < padding; p++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < resizedImage.getWidth(); j++) {
                    Color color = new Color(resizedImage.getRGB(j, i));

                    String ansiColor = String.format("\u001B[38;2;%d;%d;%dm", color.getRed(), color.getGreen(), color.getBlue());

                    System.out.print(ansiColor + "@");  // Use "@" to represent the pixel
                }

                System.out.println("\u001B[0m"); // Reset the color at the end of the line
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
