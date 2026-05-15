package project1;

import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageValidator {

    public static ValidationResult validateImage(String imagePath) {

        try {
            File file = new File(imagePath);

            if (!file.exists()) {
                return new ValidationResult(false, "Image file not found");
            }

            BufferedImage image = ImageIO.read(file);

            if (image == null) {
                return new ValidationResult(false, "Invalid image format");
            }

            // If image is readable
            return new ValidationResult(true, "Valid Image File");

        } catch (Exception e) {
            return new ValidationResult(false, "Image validation error: " + e.getMessage());
        }
    }
}
