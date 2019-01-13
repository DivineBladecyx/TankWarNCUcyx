package tank;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URI;
import java.net.URL;

import javax.swing.JFrame;


class fireAudio extends JFrame implements Runnable{ 
 File fire;
  URI fire_uri;
    URL fire_url; 
 public fireAudio(){  
}
@Override
 public synchronized void run() {
	// TODO 自动生成的方法存根
	 try {      
	      fire = new File("src/Audio/fire.wav"); 
	      fire_uri = fire.toURI();
	      fire_url = fire_uri.toURL();  //解析地址
	      AudioClip aau; 
	      aau = Applet.newAudioClip(fire_url);
	     aau.play(); //播放
	   } catch (Exception e) 
	   { e.printStackTrace();
	  } 
}
}
class blastAudio extends JFrame implements Runnable{ 
	 File blast;
	  URI blast_uri;
	    URL blast_url; 
	 public blastAudio(){  
	 
	}
	@Override
	  public void run() {
		// TODO 自动生成的方法存根
		 try {      
			  blast= new File("src/Audio/blast.wav"); 
			  blast_uri = blast.toURI();
			  blast_url = blast_uri.toURL();  //解析地址
		      AudioClip aau; 
		      aau = Applet.newAudioClip(blast_url);
		     aau.play(); //播放
		   } catch (Exception e) 
		   { e.printStackTrace();
		  } 
	}
	}
class hitAudio extends JFrame implements Runnable{ 
	 File  hit;
	  URI  hit_uri;
	    URL hit_url; 
	 public  hitAudio(){  
	}
	@Override
	 public void run() {
		// TODO 自动生成的方法存根
		try {      
			  hit= new File("src/Audio/hit.wav"); 
			  hit_uri =  hit.toURI();
			  hit_url =  hit_uri.toURL();  //解析地址
		      AudioClip aau; 
		      aau = Applet.newAudioClip( hit_url);
		     aau.play(); //播放
		   } catch (Exception e) 
		   { e.printStackTrace();
		  } 
	}
	}
class startAudio extends JFrame implements Runnable{ 
	 File  start;
	  URI  start_uri;
	    URL start_url; 
	 public  startAudio(){  
	
	}
	@Override
	 public synchronized void run() {
		// TODO 自动生成的方法存根
		  try {      
			  start= new File("src/Audio/start.wav"); 
			  start_uri =  start.toURI();
			  start_url =  start_uri.toURL();  //解析地址
		      AudioClip aau; 
		      aau = Applet.newAudioClip( start_url);
		     aau.loop(); //播放
		   } catch (Exception e) 
		   { e.printStackTrace();
		  } 
	}
	}

