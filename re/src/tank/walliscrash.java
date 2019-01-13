package tank;

public class walliscrash {
	public walliscrash() {

		
	}
	public boolean basecampcrush(int x,int y,int Direct){//Åö×²¼ì²â´ó±¾Óª
        switch (Direct) {
        case 0:
                for(int j=0;j<SomeQueues.basecampwall.size();j++) {
                	basecamp basecampwall = SomeQueues.basecampwall.get(j);
                	 if(x>=basecampwall .x&&x<=basecampwall .x+80&&y>=basecampwall.y&&y<=basecampwall.y+80){
                         return true;
                     }
                     if(x>=basecampwall .x&&x<=basecampwall.x+80&&y>=basecampwall.y&&y<=basecampwall.y+80){
                         return true;
                     }  
            }
            break;
        case 1:
        	 for(int j=0;j<SomeQueues.basecampwall.size();j++) {
        		 basecamp basecampwall = SomeQueues.basecampwall.get(j);
        		  if(x>=basecampwall.x&&x<=basecampwall.x+80&&y>=basecampwall.y&&y<=basecampwall.y+80){
                      return true;
                  }
                  if(x>=basecampwall.x&&x<=basecampwall.x+80&&y+30>=basecampwall.y&&y<=basecampwall.y+80){
                      return true;
              }
            } 
            break;
        case 2:
        	 for(int j=0;j<SomeQueues.basecampwall.size();j++) {
        		 basecamp basecampwall = SomeQueues.basecampwall.get(j);
        		 if(x>=basecampwall.x&&x<=basecampwall.x+80&&y>=basecampwall.y&&y<=basecampwall.y+80){
                     return true;
                 }
                 if(x>=basecampwall.x&&x<=basecampwall.x+80&&y+30>=basecampwall.y&&y+30<=basecampwall.y+80){
                     return true;
                 }     
            }
            break;
        case 3:
        	 for(int j=0;j<SomeQueues.basecampwall.size();j++) {
        		 basecamp basecampwall = SomeQueues.basecampwall.get(j);
        		 if(x+30>=basecampwall.x&&x+30<=basecampwall.x+80&&y>=basecampwall.y&&y<=basecampwall.y+80){
                     return true;
                 }
                 if(x+30>=basecampwall.x&&x+30<=basecampwall.x+80&&y+30>=basecampwall.y&&y+30<=basecampwall.y+80){
                     return true;
                 }          
            }
            break;
        default:
            break;
        }
        return false;
    }

	 public boolean cwiscrash(int x,int y,int Direct){//Åö×²¼ì²â
	        switch (Direct) {
	        case 0:

	                for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {
	                	canDestroywalls candestroywall = SomeQueues.canDestroywallspanel.get(j);
	                	   if(x>=candestroywall .x&&x<=candestroywall .x+40&&y>=candestroywall.y&&y<=candestroywall.y+40){
	                           return true;
	                       }
	                       if(x+30>=candestroywall .x&&x+30<=candestroywall.x+40&&y>=candestroywall.y&&y<=candestroywall.y+40){
	                           return true;
	                       }
	                
	            }
	            break;
	        case 1:
	                	 for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {
	                     	canDestroywalls candestroywall = SomeQueues.canDestroywallspanel.get(j);
	                     	  if(x>=candestroywall.x&&x<=candestroywall.x+40&&y+30>=candestroywall.y&&y+30<=candestroywall.y+40){
	                              return true;
	                          }
	                          if(x+30>=candestroywall.x&&x+30<=candestroywall.x+40&&y+30>=candestroywall.y&&y+30<=candestroywall.y+40){
	                              return true;
	                      }
	                               
	                     
	                
	            }
	            break;
	        case 2:

	                	 for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {
	                     	canDestroywalls candestroywall = SomeQueues.canDestroywallspanel.get(j);
	                     	if(x>=candestroywall.x&&x<=candestroywall.x+40&&y>=candestroywall.y&&y<=candestroywall.y+40){
	                            return true;
	                        }
	                        if(x>=candestroywall.x&&x<=candestroywall.x+40&&y+40>=candestroywall.y&&y+30<=candestroywall.y+40){
	                            return true;
	                        }
	            }
	            break;
	        case 3:
	                	 for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {
	                     	canDestroywalls candestroywall = SomeQueues.canDestroywallspanel.get(j);
	                     	 if(x+30>=candestroywall.x&&x+30<=candestroywall.x+40&&y>=candestroywall.y&&y<=candestroywall.y+40){
	                             return true;
	                         }
	                         if(x+30>=candestroywall.x&&x+30<=candestroywall.x+40&&y+30>=candestroywall.y&&y+30<=candestroywall.y+40){
	                             return true;
	                         }                                 
	            }
	            break;
	        default:
	            break;
	        }
	        return false;
	    }
	 public boolean ctwiscrash(int x,int y,int Direct){//Åö×²¼ì²â

	        switch (Direct) {
	        case 0:

	                for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {
	                	cantDestroywalls cantdestroywall = SomeQueues.cantDestroywallspanel.get(j);
	                	   if(x>=cantdestroywall .x&&x<=cantdestroywall .x+40&&y>=cantdestroywall.y&&y<=cantdestroywall.y+40){
	                           return true;
	                       }
	                       if(x+30>=cantdestroywall .x&&x+30<=cantdestroywall.x+40&&y>=cantdestroywall.y&&y<=cantdestroywall.y+40){
	                           return true;
	                       }
	                
	            }
	            break;
	        case 1:
	                	 for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {
	                     	cantDestroywalls cantdestroywall = SomeQueues.cantDestroywallspanel.get(j);
	                     	  if(x>=cantdestroywall.x&&x<=cantdestroywall.x+40&&y+30>=cantdestroywall.y&&y+30<=cantdestroywall.y+40){
	                              return true;
	                          }
	                          if(x+30>=cantdestroywall.x&&x+30<=cantdestroywall.x+40&&y+30>=cantdestroywall.y&&y+30<=cantdestroywall.y+40){
	                              return true;
	                      }
	                               
	                     
	                
	            }
	            break;
	        case 2:

	                	 for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {
	                     	cantDestroywalls cantdestroywall = SomeQueues.cantDestroywallspanel.get(j);
	                     	if(x>=cantdestroywall.x&&x<=cantdestroywall.x+40&&y>=cantdestroywall.y&&y<=cantdestroywall.y+40){
	                            return true;
	                        }
	                        if(x>=cantdestroywall.x&&x<=cantdestroywall.x+40&&y+30>=cantdestroywall.y&&y+30<=cantdestroywall.y+40){
	                            return true;
	                        }
	            }
	            break;
	        case 3:
	                	 for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {
	                     	cantDestroywalls cantdestroywall = SomeQueues.cantDestroywallspanel.get(j);
	                     	 if(x+30>=cantdestroywall.x&&x+30<=cantdestroywall.x+40&&y>=cantdestroywall.y&&y<=cantdestroywall.y+40){
	                             return true;
	                         }
	                         if(x+30>=cantdestroywall.x&&x+30<=cantdestroywall.x+40&&y+30>=cantdestroywall.y&&y+30<=cantdestroywall.y+40){
	                             return true;
	                         }                                 
	            }
	            break;
	        default:
	            break;
	        }
	        return false;
	    }
	 public boolean wateriscrash(int x,int y,int Direct){//Åö×²¼ì²â

	        switch (Direct) {
	        case 0:

	                for(int j=0;j<SomeQueues.waterwall.size();j++) {
	                	water waterwall = SomeQueues.waterwall.get(j);
	                	   if(x>=waterwall .x&&x<=waterwall .x+40&&y>=waterwall.y&&y<=waterwall.y+40){
	                           return true;
	                       }
	                       if(x+30>=waterwall .x&&x+30<=waterwall.x+40&&y>=waterwall.y&&y<=waterwall.y+40){
	                           return true;
	                       }
	                
	            }
	            break;
	        case 1:
	        	   for(int j=0;j<SomeQueues.waterwall.size();j++) {
	        		   water waterwall = SomeQueues.waterwall.get(j);
	                     	  if(x>=waterwall.x&&x<=waterwall.x+40&&y+30>=waterwall.y&&y+30<=waterwall.y+40){
	                              return true;
	                          }
	                          if(x+30>=waterwall.x&&x+30<=waterwall.x+40&&y+30>=waterwall.y&&y+30<=waterwall.y+40){
	                              return true;
	                      }
	                               
	                     
	                
	            }
	            break;
	        case 2:

	        	   for(int j=0;j<SomeQueues.waterwall.size();j++) {
	        		   water waterwall = SomeQueues.waterwall.get(j);
	                     	if(x>=waterwall.x&&x<=waterwall.x+40&&y>=waterwall.y&&y<=waterwall.y+40){
	                            return true;
	                        }
	                        if(x>=waterwall.x&&x<=waterwall.x+40&&y+30>=waterwall.y&&y+30<=waterwall.y+40){
	                            return true;
	                        }
	            }
	            break;
	        case 3:
	        	   for(int j=0;j<SomeQueues.waterwall.size();j++) {
	        		   water waterwall = SomeQueues.waterwall.get(j);
	                     	 if(x+30>=waterwall.x&&x+40<=waterwall.x+30&&y>=waterwall.y&&y<=waterwall.y+40){
	                             return true;
	                         }
	                         if(x+30>=waterwall.x&&x+40<=waterwall.x+30&&y+30>=waterwall.y&&y+30<=waterwall.y+40){
	                             return true;
	                         }                                 
	            }
	            break;
	        default:
	            break;
	        }
	        return false;
	    }

	

}

