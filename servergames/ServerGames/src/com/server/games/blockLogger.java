package com.server.games;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;


public class blockLogger{
	main plugin;
	File MapFile;
	FileConfiguration mapsConfig;
	HashMap<Integer, String> loc_1_maps;
	HashMap<Integer, String> loc_2_maps;


	public blockLogger(main plugin) {
	    this.plugin = plugin;
		loc_1_maps = new HashMap<Integer, String>();		
		loc_2_maps = new HashMap<Integer, String>();		

		registerMaps();
		
	}
	
	public void registerMaps() {		
		startFileLoad();
		loadYamls();
		
		int i = 0;
        int u = 0;
        
		ConfigurationSection mapsection = mapsConfig.getConfigurationSection("maps");
        if(mapsection ==  null)
        {
            mapsection = mapsConfig.createSection("maps");
        }        
        for(String key : mapsection.getKeys(false))
        {
            String x1 = mapsection.getString(key+".x1");
            String y1 = mapsection.getString(key+".y1");
            String z1 = mapsection.getString(key+".z1");
            
            String x2 = mapsection.getString(key+".x2");
            String y2 = mapsection.getString(key+".y2");
            String z2 = mapsection.getString(key+".z2");
            
            if(!x1.isEmpty()&&!y1.isEmpty()&&z1.isEmpty()&&x2.isEmpty()&&y2.isEmpty()&&z2.isEmpty())
            {                  	 
           	 u++;
           	 i=u-1;           	
           	 loc_1_maps.put(i,mapsection.getString(key+".x1")+","+mapsection.getString(key+".y1")+","+mapsection.getString(key+".z1"));
           	 loc_2_maps.put(i,mapsection.getString(key+".x2")+","+mapsection.getString(key+".y2")+","+mapsection.getString(key+".z2"));
                
            }
        }         

		logger.mess("Registered: " + loc_1_maps.size() + " Maps!!! :D", "low");
	}
	
	private void firstRun() throws Exception  {

		if (!plugin.l.checkBoolean("DontChangeThis")) {
			plugin.l.setBoolean("DontChangeThis", true);
			MapFile.getParentFile().mkdirs();
			copy(plugin.getResource("maps.yml"), MapFile);
		}
	}
	
	private void copy(InputStream in, File file) {
		try {
			OutputStream out = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveYamls() {
		try {
			mapsConfig.save(MapFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadYamls() {
		try {

			 mapsConfig.load(MapFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startFileLoad(){
		MapFile = new File(plugin.getDataFolder(), "maps.yml");
		try {
			firstRun();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mapsConfig = new YamlConfiguration();
	}
	
	public String intToString(int i) {
	    return "" + i;
	}
	
}
