package com.mashibing.tank;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResourceMgr {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public static BufferedImage goodTankL, goodTankU, goodTankR, goodTankD; 
	public static BufferedImage badTankL, badTankU, badTankR, badTankD; 
	public static BufferedImage bulletL, bulletU, bulletR, bulletD; 
	public static BufferedImage[] explodes = new BufferedImage[16];
=======
	public static BufferedImage tankL, tankU, tankR, tankD; 
>>>>>>> parent of f901488 (子弹换成图片)
=======
	public static BufferedImage tankL, tankU, tankR, tankD; 
>>>>>>> parent of f901488 (子弹换成图片)
=======
	public static BufferedImage tankL, tankU, tankR, tankD; 
>>>>>>> parent of f901488 (子弹换成图片)
	
 	
	static {
		try {
<<<<<<< HEAD
			goodTankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/GoodTank1.png"));
			goodTankL = ImageUtil.rotateImage(goodTankU, -90);
			goodTankR = ImageUtil.rotateImage(goodTankU, 90);
			goodTankD = ImageUtil.rotateImage(goodTankU, 180);
			
			badTankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/BadTank1.png"));
			badTankL = ImageUtil.rotateImage(badTankU, -90);
			badTankR = ImageUtil.rotateImage(badTankU, 90);
			badTankD = ImageUtil.rotateImage(badTankU, 180);
			
			bulletU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletU.png"));
			bulletL = ImageUtil.rotateImage(bulletU, -90);
			bulletR = ImageUtil.rotateImage(bulletU, 90);
			bulletD = ImageUtil.rotateImage(bulletU, 180);
			
			for(int i=0; i<16; i++) 
				explodes[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/e" + (i+1) + ".gif"));
=======
			tankL = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankL.gif"));
			tankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankU.gif"));
			tankR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankR.gif"));
			tankD = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankD.gif"));
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of f901488 (子弹换成图片)
=======
>>>>>>> parent of f901488 (子弹换成图片)
=======
>>>>>>> parent of f901488 (子弹换成图片)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
