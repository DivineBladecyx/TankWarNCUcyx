package tank;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class drawpicture {
	public drawpicture() {
	}
	   Image image=null;
	   public void drawwater(int x,int y,Graphics g) {
		   try {

               image=ImageIO.read(new File("src/picture/water.gif"));
               g.drawImage(image, x, y, 40, 40, null);
           } catch (Exception e) {

               // TODO Auto-generated catch block

               e.printStackTrace();

           }
	   }
	   public void drawgameover(int x,int y,Graphics g) {
		   try {

               image=ImageIO.read(new File("src/picture/over.gif"));
               g.drawImage(image, x, y, 540, 500, null);
           } catch (Exception e) {

               // TODO Auto-generated catch block

               e.printStackTrace();

           }
	   }
	   public void drawgrass(int x,int y,Graphics g) {
		   try {

               image=ImageIO.read(new File("src/picture/grass.png"));
               g.drawImage(image, x, y, 40, 40, null);
           } catch (Exception e) {

               // TODO Auto-generated catch block

               e.printStackTrace();

           }
	   }
	   public void drawvictory(int x,int y,Graphics g) {
		   try {

               image=ImageIO.read(new File("src/picture/victory.jpg"));
               g.drawImage(image, x, y, 540, 850, null);
           } catch (Exception e) {

               // TODO Auto-generated catch block

               e.printStackTrace();

           }
	   }
	   public void drawcanDestroywalls(int x,int y,Graphics g) {
		   try {

               image=ImageIO.read(new File("src/picture/walls.gif"));
               g.drawImage(image, x, y, 40, 40, null);
           } catch (Exception e) {

               // TODO Auto-generated catch block

               e.printStackTrace();

           }
	   }

	   public void drawbasecampwalls(int x,int y,Graphics g)
	 	   {
	 		   try
	 		   {
	 			   image=ImageIO.read(new File("src/picture/basecampwall.png"));
	 			   g.drawImage(image, x, y, 80, 80, null);
	 		   }catch(Exception e)
	 		   {
	 			   e.printStackTrace();
	 		   }
	 	   }
	   public void drawcantDestroywalls(int x,int y,Graphics g) {
		   try {

               image=ImageIO.read(new File("src/picture/steels.gif"));
               g.drawImage(image, x, y, 40, 40, null);
           } catch (Exception e) {

               // TODO Auto-generated catch block

               e.printStackTrace();

           }
	   }
	 public void drawmyTank(int x,int y,Graphics g,int direct){
		      switch(direct){
				  case 0:
					  //向上
					  g.fill3DRect(x	 , y	, 5 , 30, false);
					  g.fill3DRect(x+15, y	, 5 , 30, false);
					  g.fill3DRect(x+5 , y+5	, 10, 20, false);
					  g.fillOval(x+4, y+10, 10 , 10);
					  g.drawLine(x+9, y+15, x+9, y );
					  break;
				  case 1:
					  //向下w
					  g.fill3DRect(x	 , y	, 5 , 30, false);
					  g.fill3DRect(x+15, y	, 5 , 30, false);
					  g.fill3DRect(x+5 , y+5	, 10, 20, false);
					  g.fillOval(x+4, y+10, 10 , 10);
					  g.drawLine(x+9, y+15, x+9, y+30 );
					  break;
				  case 2:
					  //向左
					  g.fill3DRect(x	 , y	, 30, 5 , false);
					  g.fill3DRect(x   , y+15 , 30, 5 , false);
					  g.fill3DRect(x+5 , y+5	, 20, 10, false);
					  g.fillOval(x+9 , y+4, 10  , 10 );
					  g.drawLine(x+5, y+9, x-4, y+9);
					  break;
				  case 3:
					  //向右
					  g.fill3DRect(x	 , y	, 30, 5 , false);
					  g.fill3DRect(x   , y+15 , 30, 5 , false);
					  g.fill3DRect(x+5 , y+5	, 20, 10, false);
					  g.fillOval(x+9 , y+4, 10  , 10 );
					  g.drawLine(x+15, y+9, x+30, y+9);
					  break;
				  default:
					  break;
			  }

	       /* switch (direct) {
	        case 0:  
	            //向上  
	        	  try {

	                  image=ImageIO.read(new File("src/picture/p2tankU.gif"));
	                  g.drawImage(image, x, y, 30, 30, null);
	              } catch (Exception e) {

	                  // TODO Auto-generated catch block

	                  e.printStackTrace();

	              }
	            break;  
	        case 1:  
	        	 try {

	                 image=ImageIO.read(new File("src/picture/p2tankD.gif"));
	                 g.drawImage(image, x, y, 30, 30, null);
	             } catch (Exception e) {

	                 // TODO Auto-generated catch block

	                 e.printStackTrace();

	             }
	            //向下w  
	            break;  
	        case 2:  
	        	 try {

	                 image=ImageIO.read(new File("src/picture/p2tankL.gif"));
	                 g.drawImage(image, x, y, 30, 30, null);
	             } catch (Exception e) {

	                 // TODO Auto-generated catch block

	                 e.printStackTrace();

	             }
	            //向左  
	            break;  
	        case 3:  
	        	 try {
	                 image=ImageIO.read(new File("src/picture/p2tankR.gif"));
	                 g.drawImage(image, x, y, 30, 30, null);
	             } catch (Exception e) {
	                 e.printStackTrace();
	             }
	            //向右  
	            break;  
	        default:  
	            break;  
	        }  */
	    }  
	    public void drawenemyTank(int x,int y,Graphics g,int direct){  
	        switch (direct) {  
	        case 0:  
	            //向上  
	        	  try {

	                  image=ImageIO.read(new File("src/picture/enemy3U.gif"));
	                  g.drawImage(image, x, y, 30, 30, null);
	              } catch (Exception e) {

	                  // TODO Auto-generated catch block

	                  e.printStackTrace();

	              }
	            break;  
	        case 1:  
	        	 try {

	                 image=ImageIO.read(new File("src/picture/enemy3D.gif"));
	                 g.drawImage(image, x, y, 30, 30, null);
	             } catch (Exception e) {

	                 // TODO Auto-generated catch block

	                 e.printStackTrace();

	             }
	            //向下w 
	            break;  
	        case 2:  
	        	 try {

	                 image=ImageIO.read(new File("src/picture/enemy3L.gif"));
	                 g.drawImage(image, x, y, 30, 30, null);
	             } catch (Exception e) {

	                 // TODO Auto-generated catch block

	                 e.printStackTrace();

	             }
	            //向左  
	            break;  
	        case 3:  
	        	 try {

	                 image=ImageIO.read(new File("src/picture/enemy3R.gif"));
	                 g.drawImage(image, x, y, 30, 30, null);
	             } catch (Exception e) {

	                 // TODO Auto-generated catch block

	                 e.printStackTrace();

	             }
	            //向右  
	            break;  
	        default:  
	            break;  
	        }  
	    } 
	    public void drawmybullet(int x,int y,Graphics g,int direct) {
	    	 try {

                 image=ImageIO.read(new File("src/picture/tankmissile.gif"));
                 g.drawImage(image, x, y, 10 ,10, null);
             } catch (Exception e) {

                 // TODO Auto-generated catch block

                 e.printStackTrace();

             }
	    }
	    public void drawenemybullet(int x,int y,Graphics g,int direct) {
	    	 try {

                image=ImageIO.read(new File("src/picture/enemymissile.gif"));
                g.drawImage(image, x, y, 10 ,10, null);
            } catch (Exception e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }
	    }
}
