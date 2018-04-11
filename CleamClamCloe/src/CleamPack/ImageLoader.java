package CleamPack;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	static Image imgX, imgO;

	public ImageLoader() {
		try {
			imgX = ImageIO.read(new File("res/x.png"));
			imgO = ImageIO.read(new File("res/o.png"));
			// try and catch, falls das Bild nicht vorhanden ist
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
