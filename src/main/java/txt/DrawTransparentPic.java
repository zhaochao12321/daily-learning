package txt;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawTransparentPic {


    /**
     * 纯绘制图形，其背景是黑色的
     * @param
     * @throws IOException
     */
    public void drawImage() throws IOException{
        int width=256;
        int height=256;
        //创建BufferedImage对象
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        // 获取Graphics2D
        Graphics2D g2d = bi.createGraphics();

        // 画图BasicStroke是JDK中提供的一个基本的画笔类,我们对他设置画笔的粗细，就可以在drawPanel上任意画出自己想要的图形了。
        g2d.setColor(new Color(255, 0, 0));
        g2d.setStroke(new BasicStroke(1f));
        g2d.fillRect(128, 128, width, height);

        // 释放对象
        g2d.dispose();

        // 保存文件
        ImageIO.write(bi, "png", new File("H:/test.png"));
    }

    /**
     * 绘制图形，把自己绘制的图形设置为透明或半透明，背景并不透明   前景透明，背景依然是黑色
     * @param
     * @throws IOException
     */
    public static void drawImage1() throws IOException{
        int width=256;
        int height=256;
        //创建BufferedImage对象
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获取Graphics2D
        Graphics2D g2d = bi.createGraphics();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 1.0f));// 1.0f为透明度 ，值从0-1.0，依次变得不透明

        // 画图BasicStroke是JDK中提供的一个基本的画笔类,我们对他设置画笔的粗细，就可以在drawPanel上任意画出自己想要的图形了。
        g2d.setColor(new Color(255, 0, 0));
        g2d.setStroke(new BasicStroke(1f));
        g2d.fillRect(128, 128, width, height);

        // 释放对象 透明度设置结束
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        g2d.dispose();

        // 保存文件
        ImageIO.write(bi, "png", new File("H:/test.png"));
    }

    /**
     * 绘制透明图形
     * @param
     * @throws IOException
     */
    public static void drawTransparent() throws IOException{
        int width=256;
        int height=256;
        //创建BufferedImage对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获取Graphics2D
        Graphics2D g2d = image.createGraphics();

        // 增加下面代码使得背景透明
        image = g2d.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        g2d.dispose();
        g2d = image.createGraphics();
        // 背景透明代码结束

        // 画图BasicStroke是JDK中提供的一个基本的画笔类,我们对他设置画笔的粗细，就可以在drawPanel上任意画出自己想要的图形了。
        g2d.setColor(new Color(255, 0, 0));
        g2d.setStroke(new BasicStroke(1f));
        g2d.fillRect(128, 128, width, height);

        // 释放对象
        g2d.dispose();

        // 保存文件
        ImageIO.write(image, "png", new File("F:/test.png"));
    }

    public static void main(String[] args) throws IOException {
		drawTransparent();
//        drawImage1();

    }

}