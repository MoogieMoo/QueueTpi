# QueueTpi
## Datian Zhang, Maggie Xia, Adris Jaoutakas

We chose these methods:
+ add
##### addFirst() and addLast() add items to the deque
+ remove
##### removeFirst() and removeLast() remove items to the deque
+ get
##### getFirst() and getLast() return the items in the deque
+ isEmpty()
##### checks if the deque is empty
+ size()
##### returns the size of the deque

### Because they are the basic functions of a data structure and are consistent with the methods that we had implemented before in Stack and Queue.

### We chose to use an Arraylist for Deque because it was easier to implement than DLL and it was more flexible than Array, where size is unchangeable.

We left out these methods"
+ offer
##### same functionality as add except does not throw exception
+ poll
##### same functionality as remove except does not throw exception
+ peek
##### same functionality as get except does not throw exception


                                                                                                    
                                                 `.:/o/                                             
                                           .:osyyssNd:`           ``........```                     
                                      `:oyyo/-`  /m/   `-/+osyysysssso++++osoosyhy+                 
                                   -oyy+-`      +No+syys+/-.``               `/hy/`                 
                                .ohs-`         +ms/-``                     .oh+`                    
                              :yy/`           -N-                        `sh/`                      
                           `+ho-              do                        :mm+:-`                     
                         .oh+`               -N`                       +d/::/osyso:`                
                       .sh/`                 sh                       sd.      ``-oys:`             
         -.`         `oh/`                   m/                      +d`           `-+ys:`          
        `omdsssoo/:--my.                     /` ``..------.`         ``               `-oys-        
          :yy:`.-:/+oyssssso+/:`       .-:/ooshdmmNd++yNNNNmsso/:.              ./-:://///omh:      
   /s+/::--:+hy:`       ```.-:/`  `:+ydmNMh..:MMMMMh  hMMMMm`.mMMNds/-`         -yyms:::::/+sy.     
   `+dds+//++oysy+-           `:ohs+oMMMMMd  oMMMMMy `MMMMMs +MMMMMh:ods:`        `-ho              
     `:oyo-`    ./syo:`    `:smNMM` .MMMMMm  sMMMMMo -MMMMM- mMMMMM: /NMMms-  `.    `yy.            
        `:syo-`    `-+ss+:+yoMMMMM/  hMMMMM.`yMMMMMo-oMMMMh`-MMMMMy :NMMMMMms-.ys`   `od-           
           `:oys/-`    .om+` mMMMMm-/yNmdddsssyoooo+++ossyyshNMMMN.-NMMMMMm-:hs.yy`    /d:          
              .smoss+:-.yh`  /MMMmho/-.```                  `.:ohdodMMMMMN-  -m/`hs     :ho`        
            `/yo.  .-/osymy./yh+-`                            `y.`.:sdNMN:  /h/` `hs     `+y+.      
         `-oy+.     .-  ``+h:.                                 +d-   `-hd+-+d.    .d+  ````-sdy+.   
      `-+ys:`       sy     ` -s                                 /d:     `:ym.  s-  -m+sssssoo+/:.   
   `-+ymho///////+oyN-      `m+           `       +-             :m/      `.  -N`   :m:`            
  .oo:------------.ds       /N`         `oh`     `Mhy-            -do`        od     /m.            
                  :N`     `sNh        `/hosh`    `M.-yy:`          .yy`       oh      +d-           
                  hs     `yyys       .yy.  sh`   `M`  -sy/`          od:      od+`     /d+`         
                 `N-    `hy`oh      .do     sh.  `M`    .+ho.         -do`    ohsh`     .oh/`       
                 /N    `hmy .N.    -m/       +d- `M.      `/ys-.--     `sh.   oh sh``     .sy:`     
                 sh   `hy+m  sh`.`-m/         :d/ m/      `.:hmmmN`      /d+  oh  ydyso+/:..:yd+.   
                 hy   od``m/ `hmdymd-`         .hsyy   `:oys/-`.+Ny:`     .yy-oh  `yh--::++oooos+   
                 ho  :m.  od  `md-N/oyyo:.      `sNM.  sm-       mooys/`    :hmh-:--ym/             
                 hs `m/   -M`  hmdd.  `-+N:       /Ny  /m`  ``.:od-  sddh+-```/hyo+////             
                 oh od     m/  od///`   :N`        .s-  yyssyss/-    ys+m:oyyyo/sdy:`               
                 -N`m/     sd   -/osssssm/                           ys`N/   hy:+shdy:              
                  msM`     .M-                                       ys /N` .N:                     
                  /MM`      hs                                       ds  ds yy                      
                   dM`      :N`                                      d+  :N/N`                      
                   .m-       do         .o.          ``.-:/o.        m/   mM/                       
                    `s`      /M-         :yhyyyysyyssyso+//`        -M`   yd                        
                              -shy+:`      `                      `:mh    ..                        
                                 `:+yyo:.                    `-+sys/-                               
                                   .+hysMms/`          `./+symNs-                                   
                                 -yh/` -MMMMNmhssssssyyso/+h `-yNyy+.                               
                               :hy-    `NMMMMMMMMy```    /m+/syy/ `:yy.                             
                             -hy.       sMMMMMMMMm    .:sNh+ds`      :d+                            
                            od:         .hdddmmNNN-+smNMMh  d+        .hy`                          
                          `hy`            ``````.so/.MMMMs  N:         `od`                         
                          yy`      y-               `MMMMo .M. `/-       yh                         
                         `M.      .N.      d:       .MMMM+ .M`  dd:      `m/                        
                         .M-      od       M+       -MMMM: /N   hyys.     /m.                       
                          yy      dy:.``   M/       -MMMM. /m   ys`/d/     od`                      
                          `hy`  -sMMMNmmddyM-       -MMMM  /m   +m  .hs`    do                      
                           `+h/oNMMMMMMMMMMM-       -MMMM-`om   .M.  `od- `-sNys                    
                             .sMMMMhdddmmmdMo       `NMMMyoss    N:    :mymNMMMMy                   
                               /mMN-///+++/M/        -///`       m/     -mMMMMMmh-...               
                                `ym        M+                    m/      -mmy+-`-mo+oys:`           
                               .shN/-.     N+                    m+`      yd/---:d+  `-od:          
                              -m/.-/ossso+:ms..```    `     ``.-+dym`    /m-/+++/-..-+oss-          
                              oh      `.-:/+ooooosssshhosyhhdsomh.`M.    d+  `-/ossoyM:`            
                              od                   `:N-..mo:do .m/.M.    Nsossodh.   yh`            
                              /m`                   sh  /N  /m  yy:N     ---`  `yy.  `sh.           
                              `dhss/--.``           ds  +m` /m .moyh             +d:   +d-          
                               .-/N//oosss+/:-..````+m-`-hhhdm/hMdh-              -d+   :d/         
                                 .M-    `.-:/++oosssshhsssss+/:/M.                 .hs`  .ho`       
                                  hs                           od                   `yh.  `yy`      
                                  :N`      `...------..``      m/                     /d:  `yy`     
                                   hy      ydydmmNNMMMMNds.   .M-                      -do` `yy`    
                                   .N-     sy   `.:/yNMMMMm.  /N                        `sh.  od.   
                                    sh     hs        /MMMMMo  yy                          /d/  /m:  
                                    `m/    m+         sMMMMy  m/                           .d+  :m: 
                                     /m`   M-         `NMMMo :N`                            .dy` sN.
                                      do   M-          yMMM- od                              -yh+oN 
                                     `/N-  M-          :MMM` hs```                             `/hN.
                                :dsssyo+yyoN/          `NMNoomhsyyy.                              ``
                                :N-        hs           yM-..`    hh                                
                                 :hy++/:::-ym`          -sds++oosyy-                                
                                   `-:::////o`             `.-.``                                   




